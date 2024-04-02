package presentation.BackOffice.Controlleur;

import presentation.BackOffice.Vues.MenuCoordinateur;

public class ControlleurMenuCoordinateur {
    private MenuCoordinateur menuCoordinateur;

    public void demmarrerApplication() {
        this.menuCoordinateur = new MenuCoordinateur(this);
        this.menuCoordinateur.setVisible(true);
    }

    public void ButtonProfesseur() {
        ControlleurProfesseur controlleurProfesseur = new ControlleurProfesseur();
        controlleurProfesseur.demmarrerApplication();
    }

    public void ButtonEtudiant12() {
        ControlleurFiliere controlleurFiliere = new ControlleurFiliere();
        controlleurFiliere.demmarrerApplication();
    }

    public void ButtonProjetPFA() {
        ControlleurPFA controlleurPFA = new ControlleurPFA();
        controlleurPFA.demmarrerApplication();
    }

    public void ButtonProjetPFE() {
        ControlleurPFA controlleurPFA = new ControlleurPFA();
        controlleurPFA.demmarrerApplicationPFE();
    }

    public void ButtonProfesseurDepartement() {
        ControlleurDepartement controlleurProfesseurDepartement = new ControlleurDepartement();
        controlleurProfesseurDepartement.demmarrerApplicationVoirProfParDepar();
    }
}
