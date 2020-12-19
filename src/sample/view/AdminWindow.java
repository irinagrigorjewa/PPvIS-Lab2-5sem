package sample.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AdminWindow implements Window {
    public Stage primaryStage = new Stage();

    @FXML
    private Button authorization;
    @FXML
    private Button password;

    public void handleEvent(){

    }
}
