import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class ChatHomePage extends Application {

    private TextArea messageArea;
    private TextField inputField;
    private Button sendButton;
    private VBox messageList;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Main layout (vertical stack of components)
        BorderPane mainLayout = new BorderPane();
        mainLayout.setStyle("-fx-background-color: #f9f9f9;");

        // Top AppBar (like Instagram's top bar)
        HBox appBar = createAppBar();
        mainLayout.setTop(appBar);

        // Message list (the chat history)
        messageList = new VBox(10);
        messageList.setStyle("-fx-padding: 10px;");
        messageList.setSpacing(5);

        // Add some mock messages for demonstration
        messageList.getChildren().addAll(createMessageCard("Hello! How are you?"), createMessageCard("I'm good, thanks!"));

        ScrollPane messageAreaScroll = new ScrollPane(messageList);
        messageAreaScroll.setFitToWidth(true);
        messageAreaScroll.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        mainLayout.setCenter(messageAreaScroll);

        // Bottom input field and send button
        HBox inputArea = createInputArea();
        mainLayout.setBottom(inputArea);

        // Creating and setting up the scene
        Scene scene = new Scene(mainLayout, 500, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Chat Application");
        primaryStage.show();
    }

    // Create a stylish top AppBar
    private HBox createAppBar() {
        HBox appBar = new HBox();
        appBar.setStyle("-fx-background-color: #4CAF50; -fx-padding: 10px;");
        appBar.setAlignment(Pos.CENTER_LEFT);

        Label appName = new Label("ChatRoom");
        appName.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: white;");

        appBar.getChildren().add(appName);
        return appBar;
    }

    // Create a message card (like a speech bubble or card)
    private VBox createMessageCard(String messageText) {
        VBox messageCard = new VBox();
        messageCard.setPadding(new Insets(10));
        messageCard.setStyle("-fx-background-color: #ffffff; -fx-border-radius: 10px; -fx-shadow: 2px 2px 5px rgba(0, 0, 0, 0.1);");
        
        Label messageLabel = new Label(messageText);
        messageLabel.setStyle("-fx-font-size: 14px;");
        
        messageCard.getChildren().add(messageLabel);
        return messageCard;
    }

    // Create the input area at the bottom (with input field and send button)
    private HBox createInputArea() {
        HBox inputArea = new HBox(10);
        inputArea.setStyle("-fx-padding: 10px;");
        inputArea.setAlignment(Pos.CENTER);

        inputField = new TextField();
        inputField.setPromptText("Type a message...");
        inputField.setStyle("-fx-font-size: 14px; -fx-background-color: #ffffff; -fx-border-radius: 20px; -fx-padding: 10px;");
        inputField.setPrefWidth(350);

        sendButton = new Button("Send");
        sendButton.setStyle("-fx-font-size: 14px; -fx-background-color: #4CAF50; -fx-text-fill: white; -fx-border-radius: 20px;");

        sendButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sendMessage();
            }
        });

        inputArea.getChildren().addAll(inputField, sendButton);
        return inputArea;
    }

    // Handle the sending of a message
    private void sendMessage() {
        String message = inputField.getText().trim();
        if (!message.isEmpty()) {
            // Create and display the message card
            messageList.getChildren().add(createMessageCard("You: " + message));

            // Logic to send the message to other clients via server goes here.

            // Clear the input field
            inputField.clear();
        }
    }
}
