import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Gui extends Application {

    MessageCenter messageCenter = new MessageCenter();

    public void createUserWithWindow() throws IOException {
        User user = new User(messageCenter);
        messageCenter.registerUser(user);

        FXMLLoader loader = new FXMLLoader(Gui.class.getResource("/fxml/messages.fxml"));
        Scene scene = new Scene(loader.load());

        MessageController controller = loader.getController();
        controller.setUser(user);

        Stage stage  = new Stage();
        stage.setScene(scene);
        stage.setTitle("User " + user.getUserId());
        stage.show();
    }

    @Override
    public void start(Stage mainStage) throws Exception {
        createUserWithWindow();
        createUserWithWindow();
        createUserWithWindow();

    }
}
