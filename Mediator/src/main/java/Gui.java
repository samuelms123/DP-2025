import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Gui extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader1 = new FXMLLoader(Gui.class.getResource("/fxml/messages.fxml"));
        Scene scene1 = new Scene(loader1.load());
        stage.setScene(scene1);
        stage.setTitle("User 1");
        stage.show();

        FXMLLoader loader2 = new FXMLLoader(Gui.class.getResource("/fxml/messages.fxml"));
        Scene scene2 = new Scene(loader1.load());
        stage.setScene(scene1);
        stage.setTitle("User 2");
        stage.show();

    }
}
