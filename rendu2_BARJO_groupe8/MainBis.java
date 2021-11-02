package rendu2_BARJO_groupe8;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainBis extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
          try {
                // Load root layout from fxml file.
                FXMLLoader loader = new FXMLLoader(MainBis.class.getResource("InterfaceBarjo.fxml"));
                loader.setController(new Controller());
                VBox rootLayout = (VBox) loader.load();

                // Show the scene containing the root layout.
                Scene scene = new Scene(rootLayout);
                primaryStage.setScene(scene);
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        launch(args);
    }
}
