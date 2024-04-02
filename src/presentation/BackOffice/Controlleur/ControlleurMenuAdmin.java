package presentation.BackOffice.Controlleur;

import presentation.BackOffice.Vues.MenuAdmin;

public class ControlleurMenuAdmin {
    private MenuAdmin menuAdmin;

    public void demmarrerApplication() {
        this.menuAdmin = new MenuAdmin(this);
        this.menuAdmin.setVisible(true);
    }

    public void ButtonEntreprise() {
        ControlleurEntreprise controlleurEntreprise = new ControlleurEntreprise();
        controlleurEntreprise.demmarrerApplication();
    }

    public void ButtonEtudiant() {
        ControlleurEtudiant controlleurEtudiant = new ControlleurEtudiant();
        controlleurEtudiant.demmarrerApplication();
    }
    public void ButtonLaboratoire(){
        ControlleurLaboratoire controlleurlabo = new ControlleurLaboratoire();
        controlleurlabo.demmarrerApplication();
    }
    public void ButtonProfesseur(){
        ControlleurProfesseur controlleurProf = new ControlleurProfesseur();
        controlleurProf.demmarrerApplication();
    }
    public void ButtonDepartement(){
        ControlleurDepartement controlleurDepart =  new ControlleurDepartement();
        controlleurDepart.demmarrerApplication();
    }
    public void ButtonFiliere(){
        ControlleurFiliere controlleurfiliere = new ControlleurFiliere();
        controlleurfiliere.filiereAcceuil();
    }
    
    
}
