package presentation.BackOffice.Controlleur;

import presentation.BackOffice.Vues.pageModificationProf;
import presentation.BackOffice.Vues.pageSupressionProf;
import presentation.BackOffice.Vues.professeur;

public class ControlleurProfesseur {
    private professeur etd ;
    private pageSupressionProf pageSup ;
    private pageModificationProf pageMod ;
    public void afficherPageSupp() {
        
        this.pageSup  = new pageSupressionProf(this);
        this.pageSup.setVisible(true);
        
    }
    public void afficherPageModif(){
        
        this.pageMod  = new pageModificationProf(this);
        this.pageMod.setVisible(true);
        
    }


    public void demmarrerApplication() {
        this.etd = new professeur(this);
        this.etd.setVisible(true);
    }
    
    
 }