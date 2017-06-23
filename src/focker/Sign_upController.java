/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package focker;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author KeshaN PererA
 */
public class Sign_upController implements Initializable {

    @FXML
    private AnchorPane registerscreen;

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
    private void btnRegisted_clicked(ActionEvent event)throws Exception {
        AnchorPane pane =FXMLLoader.load(getClass().getResource("playgame.fxml"));
         registerscreen.getChildren().setAll(pane); 
        
        
        
    }
    
}
