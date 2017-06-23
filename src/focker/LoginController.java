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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author KeshaN PererA
 */
public class LoginController implements Initializable {

    @FXML
    private AnchorPane loginscreen;
    
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
    private void btnPlay_cliked(ActionEvent event)throws Exception {
      
        StackPane pane =FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        loginscreen.getChildren().setAll(pane);
        
    }

    @FXML
    private void btnBack_clicked(ActionEvent event)throws Exception {
        AnchorPane pane =FXMLLoader.load(getClass().getResource("playgame.fxml"));
        loginscreen.getChildren().setAll(pane);
    }
   

    private void btnsignup_clicked(MouseEvent event) throws Exception{
        AnchorPane parentContent =FXMLLoader.load(getClass().getResource("sign_up.fxml"));
                     loginscreen.getChildren().setAll(parentContent);
    }
}


