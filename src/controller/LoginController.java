package controller;

import animations.Shaker;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import database.DatabaseHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.User;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * @author baike
 */
public class LoginController {
    private int userId;
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

    private DatabaseHandler databaseHandler;

    @FXML
    void initialize() {

        databaseHandler = new DatabaseHandler();

        loginSignUpButton.setOnAction(actionEvent1 -> {
            loginSignUpButton.getScene().getWindow().hide();
            // take user to sign up screen
            goToView("/view/signup.fxml", "Sign Up");
        });

        loginButton.setOnAction(actionEvent -> {

            String loginText = loginUsername.getText().trim();
            String loginPwd = loginPassword.getText().trim();

            User user = new User();
            user.setUserName(loginText);
            user.setPassword(loginPwd);

            ResultSet userRow = databaseHandler.getUser(user);

            int counter = 0;
            try {
                while (userRow.next()) {
                    counter++;

                    // proof
                    String name = userRow.getString("firstname");
                    userId = userRow.getInt("userid");
                }

                if (counter == 1) {
                    showAddItemScreen();
                } else {
                    Shaker usernameShaker = new Shaker(loginUsername);
                    usernameShaker.shake();
                    Shaker passwordShaker = new Shaker(loginPassword);
                    passwordShaker.shake();

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }

    private void showAddItemScreen() {

        loginSignUpButton.getScene().getWindow().hide();

        // take user to add item screen
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/addItem.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setTitle("Add Item");
        stage.setScene(new Scene(root));

        AddItemController addItemController = loader.getController();
        addItemController.setUserId(userId);

        stage.showAndWait();
    }

    private void goToView(String viewPath, String viewTitle) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(viewPath));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setTitle(viewTitle);
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
}
