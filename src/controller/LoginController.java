package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
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
        String loginText = loginUsername.getText().trim();
        String loginPwd = loginPassword.getText().trim();

        System.out.println("adfd" + loginText);

        loginSignUpButton.setOnAction(actionEvent1 -> {
            System.out.println("haha");
            // take user to sign up screen
            loginSignUpButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/signup.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setTitle("Sign Up");
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        loginButton.setOnAction(actionEvent -> {
            if (!loginText.equals("") || !loginPwd.equals("")) {
                loginUser(loginText, loginPwd);
            } else {
                System.out.println("Error login in user");
            }
        });

    }

    private void loginUser(String username, String password) {
        // check if user exists in the database. If true,
        // take them to AddItem view
    }
}
