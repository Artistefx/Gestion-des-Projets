package presentation.BackOffice.Controlleur;

import presentation.BackOffice.Vues.PageModificationEntrp;
import presentation.BackOffice.Vues.PageSuppressionEntr;
import presentation.BackOffice.Vues.entreprise;

public class ControlleurEntreprise {
    private entreprise etd ;
    private PageSuppressionEntr pageSup ;
    private PageModificationEntrp pageMod ;
    
    public void afficherPageSupp() {
        this.etd.dispose();
        this.pageSup  = new PageSuppressionEntr(this);
        this.pageSup.setVisible(true);
        
    }
   public void afficherPageModif(){
        this.etd.dispose();
        this.pageMod  = new PageModificationEntrp(this);
        this.pageMod.setVisible(true);
        
    }

    public void demmarrerApplication() {
        this.etd = new entreprise(this);
        this.etd.setVisible(true);
      
}
    
    
 }
