
package presentation.BackOffice.Controlleur;

import Metier.MetierGestion.GestionnaireLabo;
import Metier.MetierPOJO.Laboratoire;
import presentation.BackOffice.Vues.DoctorantLabo;
import presentation.BackOffice.Vues.Laboratoirefenetre;
import presentation.BackOffice.Vues.ModificationLaboratoire;
import presentation.BackOffice.Vues.ProfesseurLabo;
import presentation.BackOffice.Vues.SuppressionLaboratoire;




public class ControlleurLaboratoire {
    private Laboratoirefenetre labo;
    private GestionnaireLabo gestionLabo;
    private  SuppressionLaboratoire pageSup ;
    private ModificationLaboratoire pageMod;
    private ProfesseurLabo etudiant;
    private DoctorantLabo doct;
    
    
    
    public void demmarrerApplication() {
        this.labo = new Laboratoirefenetre(this);
        this.labo.setVisible(true);
      
}
    public void afficherPageSupp() {
        
        this.pageSup  = new SuppressionLaboratoire(this);
        this.pageSup.setVisible(true);
        
    }
    public void afficherPageMod(){
        this.pageMod = new ModificationLaboratoire(this);
        this.pageMod.setVisible(true);
        
    }

    public void demmarrerApplicationProf() {
        this.etudiant = new ProfesseurLabo(this);
        this.etudiant.setVisible(true);
    }    
    public void demmarrerApplicationDoc(){
        this.doct = new DoctorantLabo(this);
        this.doct.setVisible(true);
    }
    public void afficherListe(){
        this.etudiant = new ProfesseurLabo(this);
        this.etudiant.setVisible(true);
    }
    
    
}
