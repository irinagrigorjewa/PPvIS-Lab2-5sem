package sample.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.Main;
import sample.Protester;

import java.io.IOException;

public class ProtesterWindow implements Window{
    private Protester protester;
    public ProtesterWindow(){};
    public ProtesterWindow(Protester protester){
        this.protester=protester;
    }

    public void onShowMapButton(){}
    public void onShowBasicInformationButtonButton(){}
    public void onShowAuthorizationOrganizerButton(){}
    public Stage primaryStage = new Stage();

    @FXML
    private Button organizer;


    @FXML
    private Button enter;


    @FXML
    private Button edit;
    @FXML
    public void handleEvent(){
        organizer.setOnAction(event-> {

            try {

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(Main.class.getResource("AuthorOrganizerWindow.fxml"));
                AnchorPane personOverview = loader.load();
                primaryStage.setScene(new Scene(personOverview, 900, 550));
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

}
