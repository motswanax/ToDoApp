package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author baike
 */
public class LoginController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField loginUsername;

    @FXML
    private JFXPasswordField loginPassword;

    @FXML
    private JFXButton loginButton;

    @FXML
    private JFXButton loginSignUpButton;

    @FXML
    void initialize() {

        String loinText = loginUsername.getText().trim();
        String loginPwd = loginPassword.getText().trim();

        loginButton.setOnAction(actionEvent -> {
            loginUser(loinText, loginPwd);
        });

    }

    private void loginUser(String username, String password) {
    }
}
