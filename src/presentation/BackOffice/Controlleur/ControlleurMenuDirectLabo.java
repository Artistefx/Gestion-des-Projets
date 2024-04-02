package presentation.BackOffice.Controlleur;

import presentation.BackOffice.Vues.MenuDirecLabo;

public class ControlleurMenuDirectLabo {
    private MenuDirecLabo menuDirectLabo;

    public void demmarrerApplication() {
        this.menuDirectLabo = new MenuDirecLabo(this);
        this.menuDirectLabo.setVisible(true);
    }

    public void ButtonProfesseur() {
        ControlleurLaboratoire controlleurProfesseur = new ControlleurLaboratoire();
        controlleurProfesseur.demmarrerApplicationProf();
    }

    public void ButtonDoctorant() {
        ControlleurLaboratoire controlleurDoctorant = new ControlleurLaboratoire();
        controlleurDoctorant.demmarrerApplicationDoc();
    }

    public void ButtonProjetDoctorat() {
        ControlleurProjetDoctorat controlleurProjetDoctorat = new ControlleurProjetDoctorat();
        controlleurProjetDoctorat.demarrerApplication();
    }
    

}
