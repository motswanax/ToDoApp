package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author baike
 */
public class AddItemFormController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField taskField;

    @FXML
    private JFXTextField descriptionField;

    @FXML
    private JFXButton saveTaskButton;

    @FXML
    void initialize() {

    }
}
