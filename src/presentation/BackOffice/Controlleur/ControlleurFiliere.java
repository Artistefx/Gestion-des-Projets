
package presentation.BackOffice.Controlleur;

import presentation.BackOffice.Vues.GetAllEtd;
import presentation.BackOffice.Vues.filiere;
import presentation.BackOffice.Vues.pageModificationFiliere;
import presentation.BackOffice.Vues.pageSupressionFiliere;

public class ControlleurFiliere {
    private GetAllEtd etudiant;
    private pageSupressionFiliere pageSup ;
    private pageModificationFiliere pageMod ;
    private filiere flr ;
    
    
    public void filiereAcceuil(){
        this.flr = new filiere(this);
        this.flr.setVisible(true);
    }
    
    public void afficherPageSupp() {
        
        this.pageSup  = new pageSupressionFiliere(this);
        this.pageSup.setVisible(true);
        
    }
    public void afficherPageModif(){
        
        this.pageMod  = new pageModificationFiliere(this);
        this.pageMod.setVisible(true);
        
    }
    
    public void demmarrerApplication() {
        this.etudiant = new GetAllEtd(this);
        this.etudiant.setVisible(true);
    }    
    public void afficherListe(){
        this.etudiant = new GetAllEtd(this);
        this.etudiant.setVisible(true);
    }
    
}
