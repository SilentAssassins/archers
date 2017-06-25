/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package focker;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author KeshaN PererA
 */
public class PlaygameController implements Initializable {

    @FXML
    private AnchorPane playbtnscreen;
    @FXML
    private Button play_menu_login;
    @FXML
    private Button play_menu_signup;
    @FXML
    private Button play_menu_back;
    @FXML
    private Button play_menu_play;
    @FXML
    private Pane playmenu_loginpane;
    @FXML
    private Pane playmenu_registerpane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    AnchorPane root = new AnchorPane();
    Scene scene = new Scene(root);

    @FXML
    private void LoginBtn_cliked(ActionEvent event)throws Exception{
       playmenu_loginpane.setVisible(true);
       playmenu_registerpane.setVisible(false);
    }

    @FXML
    private void btnSignup_clicked(ActionEvent event)throws Exception {
         playmenu_registerpane.setVisible(true);
         playmenu_loginpane.setVisible(false);

    }

    @FXML
    private void btnBack_cliked(ActionEvent event)throws Exception {
        AnchorPane pane =FXMLLoader.load(getClass().getResource("main_menu.fxml"));
         playbtnscreen.getChildren().setAll(pane);
    } 

    @FXML
    private void btnPlay_cliked(ActionEvent event)throws Exception{   
    StackPane pane =FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
    playbtnscreen.getChildren().setAll(pane);
    }

    @FXML
    private void btnRegisted_clicked(ActionEvent event) {
        playmenu_registerpane.setVisible(false);
      
    }
}
