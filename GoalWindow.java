import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;

public class GoalWindow {
    protected static boolean onOpen(int score, int goalSecond) {
        Alert alrt = new Alert(AlertType.CONFIRMATION);
        alrt.setTitle(null);
        alrt.setHeaderText("Game Clear!");
        alrt.setContentText("Score: " + score + "\n");
        alrt.setContentText("Clear Time: " + goalSecond + "\n");
        alrt.setContentText("Score: " + (score + 100) + "\n" + "Clear Time: " + goalSecond + "\n" + "Total Score: " + (score + 100) * goalSecond + "\n" + "Start new game?");
        Optional<ButtonType> result = alrt.showAndWait();
        if (result.get() == ButtonType.OK) {
            return true;
        } else {
            return false;
        }
    }

}
