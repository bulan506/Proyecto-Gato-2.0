package proyectogato;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Interface iE = new Interface();
        iE.logeo();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
