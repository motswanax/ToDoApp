package controller;

import animations.Shaker;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author baike
 */
public class AddItemController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView addButton;

    @FXML
    void initialize() {
        addButton.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            Shaker buttonShaker = new Shaker(addButton);
            buttonShaker.shake();
            System.out.println("Added Clicked");
        });
    }
}
