/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package focker;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author KeshaN PererA
 */
public class Settings_screenController implements Initializable {

    @FXML
    private AnchorPane setting_screen;
    @FXML
    private AnchorPane settings_genraltab;
    @FXML
    private AnchorPane settings_personaltab;
    @FXML
    private ImageView userprofilepic;
    @FXML
    private Pane settings_personal_nick_name;
    @FXML
    private Pane settings_personal_change_pwd;
    @FXML
    private Pane settings_personal_change_propic;
    @FXML
    private Button settings_back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnBack_cliked(ActionEvent event) throws IOException {
         AnchorPane pane =FXMLLoader.load(getClass().getResource("main_menu.fxml"));
         setting_screen.getChildren().setAll(pane);
    }

    @FXML
    private void settingspersonal_btnnickname_clicked(ActionEvent event) {
        settings_personal_nick_name.setVisible(true);
        settings_personal_change_pwd.setVisible(false);
        settings_personal_change_propic.setVisible(false);
    }

    @FXML
    private void settingspersonal_changepwd_clicked(ActionEvent event) {
        settings_personal_change_pwd.setVisible(true);
        settings_personal_nick_name.setVisible(false);
        settings_personal_change_propic.setVisible(false);
    }

    @FXML
    private void settingspersonal_propichanged_clicked(ActionEvent event) {
        settings_personal_change_propic.setVisible(true);
         settings_personal_nick_name.setVisible(false);
         settings_personal_change_pwd.setVisible(false);
    }

    @FXML
    private void settingsgeneralaltab_clicked(Event event) {
  
    }

    @FXML
    private void settingspersonaltab_clicked(Event event) {
 
    }

    @FXML
    private void settingshelptab_clicked(Event event) {

    }

    @FXML
    private void settingsabouttab_clicked(Event event) {

    }
    
    
}
