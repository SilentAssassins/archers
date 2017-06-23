/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package focker;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author KeshaN PererA
 */
public class Main_screenController implements Initializable {

    @FXML
    private AnchorPane rootScreen;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         String css = Focker.class.getResource("screenControler.css").toExternalForm();
         rootScreen.getStylesheets().add(css); 
     }      
    
   
}
