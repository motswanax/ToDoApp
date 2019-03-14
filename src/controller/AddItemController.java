package controller;

import animations.Shaker;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author baike
 */
public class AddItemController {
    @FXML
    private AnchorPane rootAnchorPane;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView addButton;

    @FXML
    private Label noTaskLabel;

    @FXML
    void initialize() {
        addButton.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            Shaker buttonShaker = new Shaker(addButton);
            buttonShaker.shake();

            // add transition animation to the button and label
            FadeTransition fadeTransition = new FadeTransition(Duration.millis(2000), addButton);
            FadeTransition labelTransition = new FadeTransition(Duration.millis(2000), noTaskLabel);

            // remove
            System.out.println("Added Clicked");
            addButton.relocate(0, 20);
            noTaskLabel.relocate(0, 85);

            addButton.setOpacity(0);
            noTaskLabel.setOpacity(0);

            // transition the button
            fadeTransition.setFromValue(1f);
            fadeTransition.setToValue(0f);
            fadeTransition.setCycleCount(1);
            fadeTransition.setAutoReverse(false);
            fadeTransition.play();

            // transition the label
            labelTransition.setFromValue(1f);
            labelTransition.setToValue(0);
            labelTransition.setCycleCount(1);
            labelTransition.setAutoReverse(false);
            labelTransition.play();

            try {
                AnchorPane formPane = FXMLLoader.load(getClass().getResource("/view/addItemForm.fxml"));

                // add transition to the switching to the new view
                FadeTransition rootTransition = new FadeTransition(Duration.millis(2000), formPane);
                rootTransition.setFromValue(0f);
                rootTransition.setToValue(1f);
                rootTransition.setCycleCount(1);
                rootTransition.setAutoReverse(false);
                rootTransition.play();

                rootAnchorPane.getChildren().setAll(formPane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
