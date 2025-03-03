package Eureka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Eureka/View/fxml/LogIn.fxml"));
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.sizeToScene();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setResizable(false);
            stage.setTitle("Eureka");
            stage.show();
            stage.centerOnScreen();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);

    }
}