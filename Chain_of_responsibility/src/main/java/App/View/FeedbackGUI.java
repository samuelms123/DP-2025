package App.View;

import App.Controller.FeedbackController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class FeedbackGUI extends Application {
    private FeedbackController controller;
    @Override
    public void start(Stage stage) throws Exception {

        URL fxml = FeedbackGUI.class.getResource("/fxml/feedback2.fxml");
        FXMLLoader loader = new FXMLLoader(fxml);
        Scene scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.show();

        stage.setScene(scene);
        stage.show();
        controller = loader.getController();
    }
}
