package es.guillermodorado.bomberman;

import javafx.application.Application;
import static javafx.print.PrintColor.COLOR;
import javafx.scene.Group;
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
        
        
        //Ladrillo 1
        Rectangle lad1 = new Rectangle(28,10);
        Rectangle lad2 = new Rectangle(8,10);
        Rectangle lad3 = new Rectangle(8,10);
        Rectangle lad4 = new Rectangle(8,10);
        Rectangle lad5 = new Rectangle(13,10);
        Rectangle lad6 = new Rectangle(13,10);
        Rectangle lad7 = new Rectangle(13,10);
        Rectangle lad8 = new Rectangle(13,10);
        Rectangle sep1 = new Rectangle(2,10);
        Rectangle sep2 = new Rectangle(2,10);
        Rectangle sep3 = new Rectangle(2,10);
        Rectangle sep4 = new Rectangle(2,10);
        Rectangle sep5 = new Rectangle(2,10);
       
        // Agrupación 1
        Group groupladrillo1 = new Group();
        groupladrillo1.getChildren().add(lad1);
        groupladrillo1.getChildren().add(lad2);
        groupladrillo1.getChildren().add(lad3);
        groupladrillo1.getChildren().add(lad4);
        groupladrillo1.getChildren().add(lad5);
        groupladrillo1.getChildren().add(lad6);
        groupladrillo1.getChildren().add(lad7);
        groupladrillo1.getChildren().add(lad8);
        groupladrillo1.getChildren().add(sep1);
        groupladrillo1.getChildren().add(sep2);
        groupladrillo1.getChildren().add(sep3);
        groupladrillo1.getChildren().add(sep4);
        groupladrillo1.getChildren().add(sep5);
        
        paneRoot.getChildren().add(groupladrillo1);
                
        //Ladrillo Top layer
        lad5.setX(100);
        lad5.setY(90);
        lad5.setFill(Color.DARKGOLDENROD);
        lad3.setX(115);
        lad3.setY(90);
        lad3.setFill(Color.DARKGOLDENROD);
        lad6.setX(125);
        lad6.setY(90);
        lad6.setFill(Color.DARKGOLDENROD);
        
        sep2.setX(113);
        sep2.setY(90);
        sep3.setX(123);
        sep3.setY(90);
        
        //Mid
        lad1.setX(100);
        lad1.setY(100);
        lad1.setFill(Color.DARKGOLDENROD);
        lad2.setX(130);
        lad2.setY(100);
        lad2.setFill(Color.DARKGOLDENROD);
        
        sep1.setX(128);
        sep1.setY(100);
        
        //Bottom layer
        lad4.setX(100);
        lad4.setY(110);
        lad4.setFill(Color.DARKGOLDENROD);
        lad7.setX(110);
        lad7.setY(110);
        lad7.setFill(Color.DARKGOLDENROD);
        lad8.setX(125);
        lad8.setY(110);
        lad8.setFill(Color.DARKGOLDENROD);
        
        sep4.setX(108);
        sep4.setY(110);
        sep5.setX(123);
        sep5.setY(110);
        
        //Ladrillo 2
        Rectangle lad21 = new Rectangle(28,10);
        Rectangle lad22 = new Rectangle(8,10);
        Rectangle lad23 = new Rectangle(8,10);
        Rectangle lad24 = new Rectangle(8,10);
        Rectangle lad25 = new Rectangle(13,10);
        Rectangle lad26 = new Rectangle(13,10);
        Rectangle lad27 = new Rectangle(13,10);
        Rectangle lad28 = new Rectangle(13,10);
        Rectangle sep21 = new Rectangle(2,10);
        Rectangle sep22 = new Rectangle(2,10);
        Rectangle sep23 = new Rectangle(2,10);
        Rectangle sep24 = new Rectangle(2,10);
        Rectangle sep25 = new Rectangle(2,10);
        
        // Agrupación 1
        Group groupladrillo2 = new Group();
        groupladrillo2.getChildren().add(lad21);
        groupladrillo2.getChildren().add(lad22);
        groupladrillo2.getChildren().add(lad23);
        groupladrillo2.getChildren().add(lad24);
        groupladrillo2.getChildren().add(lad25);
        groupladrillo2.getChildren().add(lad26);
        groupladrillo2.getChildren().add(lad27);
        groupladrillo2.getChildren().add(lad28);
        groupladrillo2.getChildren().add(sep21);
        groupladrillo2.getChildren().add(sep22);
        groupladrillo2.getChildren().add(sep23);
        groupladrillo2.getChildren().add(sep24);
        groupladrillo2.getChildren().add(sep25);
        
        paneRoot.getChildren().add(groupladrillo1);
        
         //Ladrillo Top layer
        lad25.setX(100);
        lad25.setY(90);
        lad25.setFill(Color.DARKGOLDENROD);
        lad23.setX(115);
        lad23.setY(90);
        lad23.setFill(Color.DARKGOLDENROD);
        lad26.setX(125);
        lad26.setY(90);
        lad26.setFill(Color.DARKGOLDENROD);
        
        sep22.setX(113);
        sep22.setY(90);
        sep23.setX(123);
        sep23.setY(90);
        
        //Mid
        lad21.setX(100);
        lad21.setY(100);
        lad21.setFill(Color.DARKGOLDENROD);
        lad22.setX(130);
        lad22.setY(100);
        lad22.setFill(Color.DARKGOLDENROD);
        
        sep21.setX(128);
        sep21.setY(100);
        
        //Bottom layer
        lad24.setX(100);
        lad24.setY(110);
        lad24.setFill(Color.DARKGOLDENROD);
        lad27.setX(110);
        lad27.setY(110);
        lad27.setFill(Color.DARKGOLDENROD);
        lad28.setX(125);
        lad28.setY(110);
        lad28.setFill(Color.DARKGOLDENROD);
        
        sep24.setX(108);
        sep24.setY(110);
        sep25.setX(123);
        sep25.setY(110);
        
    }

    public static void main(String[] args) {
        launch();
    }

}