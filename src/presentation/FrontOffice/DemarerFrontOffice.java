package presentation.FrontOffice;

import javafx.application.Application;
import javafx.stage.Stage;

public class DemarerFrontOffice extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ControlleurProfWindow controlleurProfWindow = new ControlleurProfWindow("chef", "chef");
        controlleurProfWindow.startProfWindow(primaryStage);
        System.out.println(controlleurProfWindow.GetNom());
    }
}