import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, Krish!");
        Button button = new Button("Click Me");

        button.setOnAction(e -> label.setText("Button Clicked!"));

        StackPane root = new StackPane();
        root.getChildren().addAll(label, button);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("JavaFX Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
