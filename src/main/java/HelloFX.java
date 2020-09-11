import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {
        System.setProperty("prism.lcdtext", "false");
        System.setProperty("prism.text", "t2k");

        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        //l.setStyle("-fx-font: 14 'IBM Plex Sans';");
        
        
        Scene scene = new Scene(new StackPane(l), 640, 480);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
