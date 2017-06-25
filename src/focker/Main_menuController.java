/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package focker;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author KeshaN PererA
 */
public class Main_menuController implements Initializable {

    @FXML
    private AnchorPane menuscreen;
    @FXML
    private Button main_btn_settings;
    @FXML
    private Button main_btn_play;
    @FXML
    private Button main_btn_score;
    @FXML
    private Button main_btn_exit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         if(!Focker.isSplashLoaded)
            loadScreen();
               // TODO
    }    
     
    AnchorPane root = new AnchorPane();
    Scene scene = new Scene(root);  
    
     @FXML
    private void btnplay_clicked(ActionEvent event)throws Exception {
    AnchorPane pane =FXMLLoader.load(getClass().getResource("playgame.fxml"));
    menuscreen.getChildren().setAll(pane);
    }
 
    private void loadScreen(){ 

       try {  
            Focker.isSplashLoaded = true ;        
            AnchorPane pane =FXMLLoader.load(getClass().getResource("main_screen.fxml"));
            menuscreen.getChildren().setAll(pane);
            
            FadeTransition fadein= new FadeTransition(javafx.util.Duration.seconds(1), pane);
            fadein.setFromValue(0);
            fadein.setToValue(1);
            fadein.setCycleCount(1);
            
            FadeTransition fadeout= new FadeTransition(javafx.util.Duration.seconds(1), pane);
            fadeout.setFromValue(1);
            fadeout.setToValue(0);
            fadeout.setCycleCount(1);
            
            fadein.play(); 
            
            fadein.setOnFinished((e )->{
               fadeout.play(); 
            });
                
            fadeout.setOnFinished((e )->{
                try {
                    AnchorPane parentContent =FXMLLoader.load(getClass().getResource("main_menu.fxml"));
                     menuscreen.getChildren().setAll(parentContent);
                    
                    } catch (IOException ex) {
                    Logger.getLogger(Main_menuController.class.getName()).log(Level.SEVERE, null, ex);
                }
             });
            
        } catch (IOException ex) {
            Logger.getLogger(Main_menuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    @FXML
    private void btnsettings_clicked(ActionEvent event)throws Exception {
     AnchorPane pane =FXMLLoader.load(getClass().getResource("settings_screen.fxml"));
     menuscreen.getChildren().setAll(pane); 
    }
    
    @FXML
    private void btnexit_clicked(ActionEvent event)throws Exception {

        System.exit(0);
    }
}


    