package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import database.DatabaseHandler;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import model.User;

import javax.swing.*;
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
    private JFXCheckBox signupCheckboxFemale;

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
        createUser();


        signupButton.setOnAction(actionEvent -> {
            createUser();
        });
    }

    private void createUser() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        String name = signupFirstName.getText();
        String lastName = signupLastName.getText();
        String userName = signupUsername.getText();
        String password = signupPassword.getText();
        String location = signupLocation.getText();

        String gender = signupCheckboxFemale.isSelected() ? "Female" : "Male";

        User user = new User(name, lastName, userName, password, location, gender);

        databaseHandler.signUpUser(user);
    }
}
