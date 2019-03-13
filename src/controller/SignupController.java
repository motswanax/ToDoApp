package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author baike
 */
public class SignupController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane signupCheckboxFemale;

    @FXML
    private JFXTextField signupFirstName;

    @FXML
    private JFXTextField signupLastName;

    @FXML
    private JFXTextField signupUsername;

    @FXML
    private JFXTextField signupLocation;

    @FXML
    private JFXCheckBox signupCheckboxMale;

    @FXML
    private JFXPasswordField signupPassword;

    @FXML
    private JFXButton signupButton;

    @FXML
    void initialize() {

    }
}
