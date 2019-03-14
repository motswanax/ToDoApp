package animations;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * Animate the login textfields when incorrect information is entered by the user
 * @author baike
 */
public class Shaker {
    private TranslateTransition translateTransition;

    public Shaker(Node node) {
        translateTransition = new TranslateTransition(Duration.millis(50), node);
        translateTransition.setFromX(0f);
        translateTransition.setByX(10f);
        translateTransition.setByY(10f);
        translateTransition.setCycleCount(2);
        translateTransition.setAutoReverse(true);
    }

    public void shake() {
        translateTransition.playFromStart();
    }
}
