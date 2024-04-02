package presentation.FrontOffice;


import java.io.File;
import java.sql.Date;
import java.util.List;

import Metier.MetierGestion.GestionnaireEtape;
import Metier.MetierGestion.GestionnaireProjet;
import Metier.MetierGestion.GestionnaireRendez_vous;
import Metier.MetierPOJO.Etape;
import Metier.MetierPOJO.Projet;
import Metier.MetierPOJO.Rendez_vous;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ControlleurProfWindow {

    private GestionnaireProjet gst;
    private GestionnaireEtape gstEtape;
    private String nom = "chef";
    private String prenom;
    private File selected;

    @FXML
    private Button Avancement;
    @FXML
    private Button Logout;
    @FXML
    private Button Projets;
    @FXML
    private Button Rendez;
    @FXML
    private Button etape;
    @FXML
    private TextField Name;
    @FXML
    private GridPane grid1;
    @FXML
    private GridPane grid2;
    

    @FXML
    private TableColumn<Projet, String> depart;

    @FXML
    private TableColumn<Projet,Integer> Duree;

    @FXML
    private TableColumn<Projet,String> Encadrant_1;

    @FXML
    private TableColumn<Projet,String> Encadrant_2;

    @FXML
    private TableColumn<Projet,String> Entreprise;

    @FXML
    private TableColumn<Projet,String> Etudiant;

    @FXML
    private TableColumn<Projet,String> type;

    @FXML
    private TableColumn<Projet,String> titre;

    @FXML
    private TableView<Projet> Table_Projet;

    @FXML
    private Button define;

    @FXML
    private DatePicker date;

    @FXML
    private TextField Duree_etape;

    @FXML
    private TextField Num_projet;

    @FXML
    private TableView<Etape> Table_Etape;

    @FXML
    private TableColumn<Etape , Integer> ID;

    @FXML
    private TableColumn<Etape , String> Date12;

    @FXML
    private TableColumn<Etape , Integer> Duree1;

    @FXML
    private TableColumn<Etape, String> Projet;

    @FXML
    private TextField ID_Etape;

    @FXML
    private TextField doc_name;

    @FXML
    private GridPane grid3;
    @FXML
    private ComboBox<String> titreCombo1;
    @FXML
    private Button Charger;
    
    @FXML
    private TableView<Etape> tableEtapeProjet;
    @FXML
    private TableColumn<Etape , String> Date2;
    @FXML
    private TableColumn<Etape , Integer> Duree2;
    @FXML
    private TableColumn<Etape , Integer> ID2;
    @FXML
    private TableColumn<Etape , String> Projet2;
    @FXML
    private TableColumn<Etape , String> Validite2;
    @FXML
    private TextField IdEtapeValider;
    @FXML
    private Button fileButton1;
    @FXML
    private Button Valider;

    @FXML
    private GridPane grid4;
    @FXML
    private DatePicker Date_Rendez;
    @FXML
    private TextField Lieu;
    @FXML
    private Button AddRapport;
    @FXML
    private TableView<Rendez_vous> tableRendez;
    @FXML
    private TableColumn<Rendez_vous, Integer> ID3;
    @FXML
    private TableColumn<Rendez_vous,String> Lieu3;
    @FXML
    private TableColumn<Rendez_vous,String> Projet3;
    @FXML
    private TableColumn<Rendez_vous,String> Date3;
    @FXML
    private TableColumn<Rendez_vous,Integer> Document;
    @FXML
    private TextField Id_Rendez_rapport;
    @FXML
    private Button RapportButton;
    @FXML
    private ComboBox<String> titreCombo;
    private GestionnaireRendez_vous gstRendez;


    
    public ControlleurProfWindow() {
        
    }

    public ControlleurProfWindow(String username, String password) {
        this.nom = username;
        this.prenom = password;
    }

    public void SetNom(String nom){
        this.nom = nom;
    }

    public void SetPrenom(String prenom){
        this.prenom = prenom;
    }

    public String GetNom(){
        return this.nom;
    }
    

    public void startProfWindow(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/presentation/FrontOffice/ProfWindow.fxml"));
            Parent root = loader.load();
        
            this.nom = "chef";
        
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void HandleClicks(ActionEvent event){
        if(event.getSource() == Avancement){
            System.out.println("Avancement");
            this.grid1.setVisible(false);
            this.grid2.setVisible(false);
            this.grid3.setVisible(true);
            this.grid4.setVisible(false);
        }
        else if(event.getSource() == Logout){
            //close the window
            Stage stage = (Stage) Logout.getScene().getWindow();
            stage.close();
        }
        else if(event.getSource() == Projets){
            System.out.println("Projets");
            this.grid1.setVisible(true);
            this.grid2.setVisible(false);
            this.grid3.setVisible(false);
            this.grid4.setVisible(false);
        }
        else if(event.getSource() == Rendez){
            System.out.println("Rendez");
            this.grid1.setVisible(false);
            this.grid2.setVisible(false);
            this.grid3.setVisible(false);
            this.grid4.setVisible(true);
        }
        else if(event.getSource() == etape){
            System.out.println("etape");
            this.grid1.setVisible(false);
            this.grid2.setVisible(true);
            this.grid3.setVisible(false);
            this.grid4.setVisible(false);
        }
    }

    public void Definir(ActionEvent event){
        if(event.getSource() == define){
            System.out.println("define");
            this.gstEtape = new GestionnaireEtape();
            // convert from localDate to sqlDate 
            Date date1 = Date.valueOf(date.getValue());
            gstEtape.insertEtape(Num_projet.getText(),Integer.parseInt(Duree_etape.getText()), date1);
            Table_Etape.getItems().clear();
            populateTableEtape();
        }
    }

    private void populateTableEtape() {
        // Fetch data from the database
        this.gstEtape = new GestionnaireEtape();
        List<Etape> dataList = gstEtape.getAllEtape();

        // Add data to the table
        Table_Etape.getItems().addAll(dataList);
    }

    public void initialize() {
        Name.setText(this.nom);
        // Initialize table columns
        depart.setCellValueFactory(new PropertyValueFactory<>("Depart"));
        Duree.setCellValueFactory(new PropertyValueFactory<>("duree"));
        Encadrant_1.setCellValueFactory(new PropertyValueFactory<>("encadrant1"));
        Encadrant_2.setCellValueFactory(new PropertyValueFactory<>("encadrant2"));
        Entreprise.setCellValueFactory(new PropertyValueFactory<>("Lieu"));
        Etudiant.setCellValueFactory(new PropertyValueFactory<>("etudiant"));
        type.setCellValueFactory(new PropertyValueFactory<>("type"));
        titre.setCellValueFactory(new PropertyValueFactory<>("titre"));

        // Populate table with data from the database
        populateTable();

        // Initialize table columns
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));
        Date12.setCellValueFactory(new PropertyValueFactory<>("date"));
        Duree1.setCellValueFactory(new PropertyValueFactory<>("duree"));
        Projet.setCellValueFactory(new PropertyValueFactory<>("projet"));

        // Populate table with data from the database
        populateTableEtape();

        titreCombo1.getItems().addAll(new GestionnaireProjet().getAllTitreProjet());
        titreCombo.getItems().addAll(new GestionnaireProjet().getAllTitreProjet());

        // Initialize table columns
        ID2.setCellValueFactory(new PropertyValueFactory<>("id"));
        Date2.setCellValueFactory(new PropertyValueFactory<>("date"));
        Duree2.setCellValueFactory(new PropertyValueFactory<>("duree"));
        Projet2.setCellValueFactory(new PropertyValueFactory<>("projet"));
        Validite2.setCellValueFactory(new PropertyValueFactory<>("validite"));

        // Initialize table columns
        ID3.setCellValueFactory(new PropertyValueFactory<>("id"));
        Lieu3.setCellValueFactory(new PropertyValueFactory<>("lieu"));
        Projet3.setCellValueFactory(new PropertyValueFactory<>("projet"));
        Date3.setCellValueFactory(new PropertyValueFactory<>("date"));
        Document.setCellValueFactory(new PropertyValueFactory<>("document"));

        // Populate table with data from the database
        populateTableRendez();
    }

    private void populateTableRendez() {
        // Fetch data from the database
        this.gstRendez = new GestionnaireRendez_vous();
        List<Rendez_vous> dataList = gstRendez.getAllRendez_vousByProf(this.nom);

        tableRendez.getItems().clear();

        // Add data to the table
        tableRendez.getItems().addAll(dataList);
    }

    private void populateTableEtapeProjet() {
        // Fetch data from the database
        this.gstEtape = new GestionnaireEtape();
        List<Etape> dataList = gstEtape.getAllEtapeByProjet(titreCombo1.getValue());

        // Add data to the table
        tableEtapeProjet.getItems().addAll(dataList);
    }

    private void populateTable() {
        // Fetch data from the database
        this.gst = new GestionnaireProjet();
        List<Projet> dataList = gst.getAllProjetByEncadrant(this.nom);

        // Add data to the table
        Table_Projet.getItems().addAll(dataList);
    }

    @FXML
    private Button fileButton;

    @FXML
    private void handleFileButtonAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select File");

        // Set the initial directory 
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));

        // Add file extension filters if needed
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("PDF Files", "*.pdf"),
                new FileChooser.ExtensionFilter("Text Files", "*.txt")
        );

        Stage stage = (Stage) fileButton.getScene().getWindow();
        File selectedFile = fileChooser.showOpenDialog(stage);

        if (selectedFile != null) {
            // Process the selected file
            this.selected = selectedFile;
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        } else {
            System.out.println("No file selected.");
        }

        
    }

    @FXML
    private void handleUploadButtonAction(ActionEvent event) {
        //insert file in db
        this.gstEtape = new GestionnaireEtape();
        gstEtape.insertDocument(doc_name.getText(), selected.getAbsolutePath());
        gstEtape.AddDocToEtape(doc_name.getText(), Integer.parseInt(ID_Etape.getText()));
    }

    @FXML
    private void handleChargerButtonAction(ActionEvent event) {
        //insert file in db
        tableEtapeProjet.getItems().clear();
        populateTableEtapeProjet();
    }

    @FXML
    private void handleValiderButtonAction(ActionEvent event) {
        //insert file in db
        this.gstEtape = new GestionnaireEtape();
        gstEtape.ValiderEtape(titreCombo1.getValue(),Integer.parseInt(IdEtapeValider.getText()));
        tableEtapeProjet.getItems().clear();
        populateTableEtapeProjet();
    }

    @FXML
    private void handleAjouterButtonAction(ActionEvent event) {
        //insert file in db
        this.gstRendez = new GestionnaireRendez_vous();
        // convert from localDate to sqlDate
        Date date1 = Date.valueOf(Date_Rendez.getValue());
        gstRendez.insertRendez_vous(date1,Lieu.getText(), titreCombo.getValue());
        
    }
}


    


    
