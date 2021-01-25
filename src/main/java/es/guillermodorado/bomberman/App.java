package es.guillermodorado.bomberman;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Pane paneRoot = new Pane();  
        Scene scene = new Scene(paneRoot, 600, 540);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("BombermanGame");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}