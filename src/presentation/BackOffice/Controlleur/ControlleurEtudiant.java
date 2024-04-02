package presentation.BackOffice.Controlleur;

import presentation.BackOffice.Vues.etudiant;
import presentation.BackOffice.Vues.pageModification;
import presentation.BackOffice.Vues.pageSupression;

public class ControlleurEtudiant {
    private etudiant etd ;
    private pageSupression pageSup ;
    private pageModification pageMod ;
    public void afficherPageSupp() {
        
        this.pageSup  = new pageSupression(this);
        this.pageSup.setVisible(true);
        
    }
    public void afficherPageModif(){
        
        this.pageMod  = new pageModification(this);
        this.pageMod.setVisible(true);
        
    }


    public void demmarrerApplication() {
        this.etd = new etudiant(this);
        this.etd.setVisible(true);
    }
    
    
 }