package presentation.FrontOffice;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginApp extends Application {

    private ControlleurLoginApp controlleurLoginApp;

    public LoginApp() {
        this.controlleurLoginApp = new ControlleurLoginApp();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");

        // Create a BorderPane as the root pane
        BorderPane root = new BorderPane();
        root.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));

        // Create a GridPane for the login form
        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25));

        // Add a title
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Arial", FontWeight.BOLD, 28));
        grid.add(scenetitle, 0, 0, 2, 1);

        // Add labels and text fields
        Label usernameLabel = new Label("Username:");
        usernameLabel.setTextFill(Color.WHITE);
        grid.add(usernameLabel, 0, 1);

        TextField usernameTextField = new TextField();
        grid.add(usernameTextField, 1, 1);

        Label passwordLabel = new Label("Password:");
        passwordLabel.setTextFill(Color.WHITE);
        grid.add(passwordLabel, 0, 2);

        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);

        // Add a role selection
        Label roleLabel = new Label("Role:");
        roleLabel.setTextFill(Color.WHITE);
        grid.add(roleLabel, 0, 3);

        ComboBox<String> roleComboBox = new ComboBox<>();
        roleComboBox.getItems().addAll("Student", "Professor");
        grid.add(roleComboBox, 1, 3);

        // Add a login button
        Button loginButton = new Button("Sign In");
        loginButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 16px;");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(loginButton);
        grid.add(hbBtn, 1, 4);

        // Add a status label
        final Text actiontarget = new Text();
        actiontarget.setFill(Color.RED);
        grid.add(actiontarget, 1, 5);

        // Handle login button action
        loginButton.setOnAction(e -> {
            String username = usernameTextField.getText();
            String password = passwordField.getText();
            String role = roleComboBox.getValue();

            // Validate the login credentials (e.g., check against a database)
            if (role.equals("Student") ) {
                if (this.controlleurLoginApp.loginStudent(username, password)){
                    actiontarget.setFill(Color.GREEN);
                    actiontarget.setText("Login successful! Role: " + role);
                }
                else {
                    actiontarget.setFill(Color.RED);
                    actiontarget.setText("Login failed!");
                }
            } else {
                if (this.controlleurLoginApp.loginProfesseur(username, password)){
                    actiontarget.setFill(Color.GREEN);
                    actiontarget.setText("Login successful! Role: " + role);
                    Stage stage = (Stage) loginButton.getScene().getWindow();
                    stage.close();
                    this.controlleurLoginApp.startProfWindow(username, password);
                }
                else {
                    actiontarget.setFill(Color.RED);
                    actiontarget.setText("Login failed!");
                }
            }
        });

        // Set the grid as the center of the BorderPane
        root.setCenter(grid);

        // Create the scene
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
            // Apply some styling to the scene
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        primaryStage.show();
    }

    public void setControlleurLoginApp(ControlleurLoginApp controlleurLoginApp) {
        this.controlleurLoginApp = controlleurLoginApp;
    }
}

