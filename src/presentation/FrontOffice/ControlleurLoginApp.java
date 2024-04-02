package presentation.FrontOffice;

import Metier.MetierGestion.GestionnaireEtudiant;
import Metier.MetierGestion.GestionnaireProfesseur;
import javafx.stage.Stage;

public class ControlleurLoginApp {
    
    
    private GestionnaireEtudiant gestionnaireEtudiant; 
    private GestionnaireProfesseur gestionnaireProfesseur;
    private ControlleurProfWindow controlleurProfWindow;

    //start login app methode
    public void startLoginApp() {
        LoginApp.main(null);
    }

    //start prof window methode
    public void startProfWindow(String username, String password) {
            this.controlleurProfWindow = new ControlleurProfWindow(username, password);
            this.controlleurProfWindow.startProfWindow(new Stage());
    }
    

    public boolean loginStudent(String username, String password) {
        this.gestionnaireEtudiant = new GestionnaireEtudiant();
        return this.gestionnaireEtudiant.ByNomAndPrenom(username, password);
    }

    public boolean loginProfesseur(String username, String password) {
        this.gestionnaireProfesseur = new GestionnaireProfesseur();
        return this.gestionnaireProfesseur.ByNomAndPrenom(username, password);
    }
}
