import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TestFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("✅ JavaFX Initialized Successfully!");
        Scene scene = new Scene(label, 300, 200);

        primaryStage.setTitle("TestFX Window");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
