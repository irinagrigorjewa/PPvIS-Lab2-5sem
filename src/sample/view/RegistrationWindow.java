package sample.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;

public class RegistrationWindow implements Window {
    public Stage primaryStage = new Stage();
    @FXML
    private Button ok;

    public void handleEvent() {
        ok.setOnAction(event -> {
            primaryStage.close();
//            try {
//
//                FXMLLoader loader = new FXMLLoader();
//                loader.setLocation(Main.class.getResource("sample.fxml"));
//                AnchorPane personOverview = loader.load();
//                primaryStage.setScene(new Scene(personOverview, 900, 550));
//                primaryStage.show();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        });
    }

    }


