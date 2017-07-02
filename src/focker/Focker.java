/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package focker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Menake
 */
public class Focker extends Application {

    public static Boolean isSplashLoaded = false;

    @Override
    public void start(Stage stage) throws Exception {
        
//                audio playing with loop 
//        MediaPlayer musicplayer;
//        Media mp3MusicFile = new Media(getClass().getResource("/focker/res/audio/").toExternalForm()); 
//
//        musicplayer = new MediaPlayer(mp3MusicFile);
//        musicplayer.setAutoPlay(true);
//        
//         musicplayer.setOnEndOfMedia(new Runnable(){    
//        public void run()
//        {
//        musicplayer.seek(Duration.ZERO); 
//        }});   

        Parent root = FXMLLoader.load(getClass().getResource("main_menu.fxml"));
        Scene scene = new Scene(root);
        String css = Focker.class.getResource("screenControler.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
