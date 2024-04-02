package presentation.BackOffice.Controlleur;

import presentation.BackOffice.Vues.MenuChef;

public class ControlleurMenuChef {
    private MenuChef menuChef;

    public void demmarrerApplication() {
        this.menuChef = new MenuChef(this);
        this.menuChef.setVisible(true);
    }

    public void ButtonDesignerCoord() {
        ControlleurAffectation controlleurDesignerCoord = new ControlleurAffectation();
        controlleurDesignerCoord.demmarrerApplication();
    }

    public void ButtonVoirDepartement() {
        ControlleurDepartement controlleurVoirDepartement = new ControlleurDepartement();
        controlleurVoirDepartement.demarrerApplicationAllDepart();
    }

    public void ButtonVoirProf() {
        ControlleurDepartement controlleurVoirProf = new ControlleurDepartement();
        controlleurVoirProf.demarrerApplicationVoirProfDeparte();
    }

    public void ButtonVoirEtudiant() {
        ControlleurDepartement controlleurVoirDoctorant = new ControlleurDepartement();
        controlleurVoirDoctorant.demarrerApplicationVoirEtdDeparte();
    }
}
