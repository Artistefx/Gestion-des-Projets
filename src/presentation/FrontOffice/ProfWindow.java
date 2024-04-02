package presentation.FrontOffice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 * @author kerbo
 */
public class ProfWindow extends Application {
    
    private String password;
    private String username;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/presentation/FrontOffice/ProfWindow.fxml"));
        Parent root = loader.load();
        
        ControlleurProfWindow controller = loader.getController();
        controller.SetNom(username);  // Set the username
        controller.SetPrenom(password);  // Set the password
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}