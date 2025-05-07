import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.IOException;
import java.net.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatHomePage extends Application {

    private static final int PORT = 5555;
    private ExecutorService executorService = Executors.newCachedThreadPool();
    private DatagramSocket socket;
    private boolean running = true;
    private String username = "User" + (int) (Math.random() * 1000);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            socket = new DatagramSocket(PORT);
            startReceiverThread();
        } catch (SocketException e) {
            showAlert("Network Error", "Failed to initialize socket: " + e.getMessage());
        }

        // Main UI Setup
        BorderPane root = new BorderPane();
        root.getStyleClass().add("root");

        // Create and set the AppBar
        AppBar appBar = new AppBar(primaryStage);
        root.setTop(appBar);

        // Create and set the Chat Area
        ChatArea chatArea = new ChatArea();
        root.setCenter(chatArea);

        // Create and set the Input Area
        InputArea inputArea = new InputArea(chatArea);
        root.setBottom(inputArea);

        // Create the scene with CSS styling
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("").toExternalForm() + "styles.css");
        
        // Add inline CSS since we're using a single file
        scene.getRoot().setStyle("-fx-base: #2b2b2b; -fx-accent: #3c3f41; -fx-default-button: #4c5052; " +
                "-fx-focus-color: #4c5052; -fx-faint-focus-color: #4c50522D; -fx-control-inner-background: #3c3f41; " +
                "-fx-control-inner-background-alt: #3c3f41; -fx-text-fill: #bbbbbb;");

        primaryStage.setTitle("LAN Messenger");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Handle window close
        primaryStage.setOnCloseRequest(event -> {
            running = false;
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
            executorService.shutdownNow();
        });
    }

    private void startReceiverThread() {
        executorService.execute(() -> {
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            while (running) {
                try {
                    socket.receive(packet);
                    String received = new String(packet.getData(), 0, packet.getLength());
                    javafx.application.Platform.runLater(() -> {
                        // This will be handled by the ChatArea's appendMessage method
                    });
                } catch (IOException e) {
                    if (!socket.isClosed()) {
                        javafx.application.Platform.runLater(() -> 
                            showAlert("Network Error", "Error receiving message: " + e.getMessage()));
                    }
                }
            }
        });
    }

    private void broadcastMessage(String message) {
        try {
            byte[] buffer = (username + ": " + message).getBytes();
            DatagramPacket packet = new DatagramPacket(
                    buffer, 
                    buffer.length, 
                    InetAddress.getByName("255.255.255.255"), 
                    PORT);
            socket.send(packet);
        } catch (IOException e) {
            showAlert("Network Error", "Failed to send message: " + e.getMessage());
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Nested UI Component Classes
    private class AppBar extends HBox {
        public AppBar(Stage stage) {
            getStyleClass().add("app-bar");
            setPadding(new Insets(10));
            setSpacing(10);
            setAlignment(Pos.CENTER_LEFT);

            // App icon and title
            ImageView icon = new ImageView(new Image("https://cdn-icons-png.flaticon.com/512/2593/2593618.png", 30, 30, true, true));
            Label title = new Label("LAN Messenger");
            title.setStyle("-fx-font-size: 18; -fx-font-weight: bold; -fx-text-fill: white;");

            // Spacer to push menu to the right
            Region spacer = new Region();
            HBox.setHgrow(spacer, Priority.ALWAYS);

            // Menu
            MenuBar menuBar = createMenuBar(stage);

            getChildren().addAll(icon, title, spacer, menuBar);
        }

        private MenuBar createMenuBar(Stage stage) {
            MenuBar menuBar = new MenuBar();
            menuBar.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");

            // File Menu
            Menu fileMenu = new Menu("File");
            MenuItem exitItem = new MenuItem("Exit");
            exitItem.setOnAction(e -> stage.fireEvent(new javafx.stage.WindowEvent(stage, javafx.stage.WindowEvent.WINDOW_CLOSE_REQUEST)));
            fileMenu.getItems().add(exitItem);

            // Settings Menu
            Menu settingsMenu = new Menu("Settings");
            MenuItem usernameItem = new MenuItem("Change Username");
            usernameItem.setOnAction(e -> changeUsername());
            settingsMenu.getItems().add(usernameItem);

            // Help Menu
            Menu helpMenu = new Menu("Help");
            MenuItem aboutItem = new MenuItem("About");
            aboutItem.setOnAction(e -> showAboutDialog());
            helpMenu.getItems().add(aboutItem);

            menuBar.getMenus().addAll(fileMenu, settingsMenu, helpMenu);
            return menuBar;
        }

        private void changeUsername() {
            TextInputDialog dialog = new TextInputDialog(username);
            dialog.setTitle("Change Username");
            dialog.setHeaderText(null);
            dialog.setContentText("Enter new username:");

            dialog.showAndWait().ifPresent(name -> {
                if (!name.trim().isEmpty()) {
                    username = name.trim();
                }
            });
        }

        private void showAboutDialog() {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("About LAN Messenger");
            alert.setHeaderText("LAN Messenger v1.0");
            alert.setContentText("A simple LAN chat application for broadcasting messages.\n\n" +
                    "All users on the same network will receive your messages.");
            alert.showAndWait();
        }
    }

    private class ChatArea extends ScrollPane {
        private VBox messageContainer;

        public ChatArea() {
            getStyleClass().add("chat-area");
            setFitToWidth(true);
            setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

            messageContainer = new VBox(10);
            messageContainer.setPadding(new Insets(10));
            messageContainer.setFillWidth(true);

            setContent(messageContainer);
        }

        public void appendMessage(String sender, String message) {
            LocalTime time = LocalTime.now();
            String timestamp = time.format(DateTimeFormatter.ofPattern("HH:mm"));

            Label senderLabel = new Label(sender + " • " + timestamp);
            senderLabel.setStyle("-fx-font-weight: bold; -fx-text-fill: " + (sender.equals(username) ? "#4CAF50" : "#2196F3") + ";");

            Label messageLabel = new Label(message);
            messageLabel.setWrapText(true);
            messageLabel.setStyle("-fx-text-fill: #e0e0e0; -fx-font-size: 14;");
            messageLabel.setMaxWidth(Double.MAX_VALUE);

            VBox messageBox = new VBox(2, senderLabel, messageLabel);
            messageBox.setPadding(new Insets(5, 10, 5, 10));
            messageBox.getStyleClass().add("message-bubble");
            messageBox.setStyle("-fx-background-color: " + (sender.equals(username) ? "#2E7D32" : "#1565C0") + "; " +
                    "-fx-background-radius: 10; -fx-padding: 5 10 5 10;");

            HBox messageContainerBox = new HBox(messageBox);
            messageContainerBox.setAlignment(sender.equals(username) ? Pos.CENTER_RIGHT : Pos.CENTER_LEFT);
            messageContainerBox.setPadding(new Insets(5, 10, 5, 10));

            messageContainer.getChildren().add(messageContainerBox);
            
            // Scroll to bottom
            javafx.application.Platform.runLater(() -> {
                messageContainer.layout();
                setVvalue(1.0);
            });
        }
    }

    private class InputArea extends BorderPane {
        private TextField inputField;
        private Button sendButton;

        public InputArea(ChatArea chatArea) {
            getStyleClass().add("input-area");
            setPadding(new Insets(10));

            inputField = new TextField();
            inputField.setPromptText("Type your message here...");
            inputField.setStyle("-fx-background-radius: 15; -fx-padding: 8 15 8 15;");
            inputField.setOnAction(e -> sendMessage(chatArea));

            sendButton = new Button("Send");
            sendButton.setStyle("-fx-background-radius: 15; -fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
            sendButton.setOnAction(e -> sendMessage(chatArea));

            HBox buttonBox = new HBox(sendButton);
            buttonBox.setAlignment(Pos.CENTER_RIGHT);

            setCenter(inputField);
            setRight(buttonBox);
            BorderPane.setAlignment(buttonBox, Pos.CENTER_RIGHT);
        }

        private void sendMessage(ChatArea chatArea) {
            String message = inputField.getText().trim();
            if (!message.isEmpty()) {
                chatArea.appendMessage(username, message);
                broadcastMessage(message);
                inputField.clear();
            }
        }
    }
}