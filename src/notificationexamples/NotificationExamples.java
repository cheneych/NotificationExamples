package notificationexamples;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NotificationExamples extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("NotificationsUI.fxml"));
        Parent root = loader.load();
        NotificationsUIController controller = loader.getController();
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Notification Examples");
        stage.show();
        
        controller.start(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
