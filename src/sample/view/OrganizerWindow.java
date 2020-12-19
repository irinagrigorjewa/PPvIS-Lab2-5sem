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

public class OrganizerWindow implements Window{
    public Protester protester;
    OrganizerWindow(Protester protester){
        this.protester=protester;
    }
   public void onCreateRallyButton(){

   }
   public void onChangeRallyButton(){

   }
    public Stage primaryStage = new Stage();
    @FXML
    private Button addMeeting;


    @FXML
   public void handleEvent(){
        addMeeting.setOnAction(event-> {

            try {

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(Main.class.getResource("meeting.fxml"));
                AnchorPane personOverview = loader.load();
                primaryStage.setScene(new Scene(personOverview, 900, 550));
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

   }
}
