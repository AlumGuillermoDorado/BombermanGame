package es.guillermodorado.bomberman;

import javafx.application.Application;
import static javafx.print.PrintColor.COLOR;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
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
        
        Rectangle lad1 = new Rectangle(28,8);
        Rectangle lad2 = new Rectangle(8,8);
        Rectangle lad3 = new Rectangle(8,8);
        Rectangle lad4 = new Rectangle(8,8);
        Rectangle lad5 = new Rectangle(13,10);
        Rectangle lad6 = new Rectangle(13,10);
        Rectangle lad7 = new Rectangle(13,10);
        Rectangle lad8 = new Rectangle(13,10);
        
        
        Rectangle sep1 = new Rectangle(2,2);
        Rectangle sep2 = new Rectangle(2,2);
        Rectangle sep3 = new Rectangle(2,2);
        Rectangle sep4 = new Rectangle(2,2);
        Rectangle sep5 = new Rectangle(2,2);
        
        paneRoot.getChildren().add(lad1);
        paneRoot.getChildren().add(lad2);
        paneRoot.getChildren().add(lad3);
        paneRoot.getChildren().add(lad4);
        paneRoot.getChildren().add(lad5);
        paneRoot.getChildren().add(lad6);
        paneRoot.getChildren().add(lad7);
        paneRoot.getChildren().add(lad8);
        
        paneRoot.getChildren().add(sep1);
        paneRoot.getChildren().add(sep2);
        paneRoot.getChildren().add(sep3);
        paneRoot.getChildren().add(sep4);
        paneRoot.getChildren().add(sep5);
        
        lad1.setX(100);
        lad1.setY(100);
        lad1.setFill(Color.DARKGOLDENROD);
        lad2.setX(130);
        lad2.setY(100);
        lad2.setFill(Color.DARKGOLDENROD);
    }

    public static void main(String[] args) {
        launch();
    }

}