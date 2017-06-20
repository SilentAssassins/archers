/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package focker;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Menake
 */
public class Focker extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }
//    public void start(Stage primaryStage) throws IOException {
//
//        primaryStage.setTitle("Random Card");
//
//        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
//        
//                GridPane pane = new GridPane();
//                pane.setAlignment(Pos.CENTER);
//                pane.setHgap(10);
//                pane.setVgap(5);
//
//                // creates button 
//                Button refresh = new Button("Refresh");
//               HBox button = new HBox(10);
//               button.setAlignment(Pos.BOTTOM_CENTER);
//               button.getChildren().add(refresh);
//               pane.getChildren().add(refresh);
//
//               // creates random card images and adds them to pane
//               Image img = new Image("focker/Resources/Images/cards/02.png");
//               ImageView imgView = new ImageView(img);
//               pane.add(imgView, 1, 0);
//
//               Image img2= new Image("focker/Resources/Images/cards/03.png");
//               ImageView imgView2 = new ImageView(img2);
//               pane.add(imgView2, 2, 0);
//
//               Image img3= new Image("focker/Resources/Images/cards/04.png");
//               ImageView imgView3 = new ImageView(img3);
//               pane.add(imgView3, 3, 0);
//
//               Image img4= new Image("focker/Resources/Images/cards/05.png");
//               ImageView imgView4 = new ImageView(img4);
//               pane.add(imgView4,4, 0);
//               //create scene
//               Scene scene = new Scene(pane,400,200);
//               primaryStage.setScene(scene);
//               primaryStage.show();
//               refresh.setOnAction((ActionEvent e) -> {
//                   imgView.setImage(new Image("focker/Resources/Images/cards/02.png"));
//                   imgView2.setImage(new Image("focker/Resources/Images/cards/03.png"));
//                   imgView3.setImage(new Image("focker/Resources/Images/cards/04.png"));
//                   imgView4.setImage(new Image("focker/Resources/Images/cards/05.png"));
//        });
//
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
