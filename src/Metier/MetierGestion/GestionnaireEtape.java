package Metier.MetierGestion;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import Metier.MetierPOJO.Etape;
import persistance.DAOEtape;
public class GestionnaireEtape {
    DAOEtape etape ;

    public GestionnaireEtape(DAOEtape etape) {
        this.etape = etape;
    }
    public GestionnaireEtape(){
        this.etape =new DAOEtape();
    }
    public boolean insertEtape(String num_projet, int duree, Date date_depart) {
        return etape.insertEtape(num_projet, duree, date_depart);

    }
    public boolean deleteEtape(int id_etape){
        return etape.deleteEtape(id_etape);
    }
    public boolean updateEtape(int id_etape, int num_projet, int duree, Date date_depart, 
    int id_livraison){
        return etape.updateEtape(id_etape, num_projet, duree, date_depart, id_livraison);
    }
    public ArrayList<Etape> getAllEtape() {
      return etape.getAllEtape();   
    }
    public boolean insertDocument(String nom, String path){
        return etape.insertDocument(nom, path);
    }
    public boolean AddDocToEtape(String file, int id_etape){
        return etape.insertDocIntoEtape(file, id_etape);
    }
    public List<Etape> getAllEtapeByProjet(String titre) {
        return etape.getAllEtapeByProjet(titre);
    }
    public boolean ValiderEtape(String Titre, int id_etape) {
        return etape.ValiderEtape(Titre, id_etape);
    }
    
    
}
