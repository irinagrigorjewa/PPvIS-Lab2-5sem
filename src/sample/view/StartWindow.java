package sample.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;

public class StartWindow implements Window{
    public Stage primaryStage = new Stage();

    @FXML
    private Button authorization;
    @FXML
    private Button password;
    @FXML
    private Button admin;

    @FXML
    private Button regist;

    @FXML
    void handlerEvent(){

        authorization.setOnAction(event -> {
            try {

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(Main.class.getResource("login.fxml"));
                AnchorPane personOverview = loader.load();
                primaryStage.setScene(new Scene(personOverview, 700, 500));
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        password.setOnAction(event -> {
            try {

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(Main.class.getResource("password.fxml"));
                AnchorPane personOverview = loader.load();
                primaryStage.setScene(new Scene(personOverview, 358, 450));
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        regist.setOnAction(event -> {
            try {

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(Main.class.getResource("registration.fxml"));
                AnchorPane personOverview = loader.load();
                primaryStage.setScene(new Scene(personOverview, 504, 604));
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        admin.setOnAction(event -> {
            try {

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(Main.class.getResource("loginAdmin.fxml"));
                AnchorPane personOverview = loader.load();
                primaryStage.setScene(new Scene(personOverview, 900, 550));
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
