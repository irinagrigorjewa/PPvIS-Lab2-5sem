package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.List;

public class Main extends Application {
public List<Executor> executor;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Injector injector=new Injector();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Стартовое окно");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }


    public static void run(String[] args) {
        launch(args);
    }
}
