package Metier.MetierGestion;
import java.util.ArrayList;

import Metier.MetierPOJO.Entreprise;
import persistance.DAOEntreprise;
public class GestionnaireEntreprise {
    DAOEntreprise entrp ;

    public GestionnaireEntreprise(DAOEntreprise entrp) {
        this.entrp = entrp;
    }
    public GestionnaireEntreprise(){
        entrp = new DAOEntreprise();
    }
    public boolean insertEntreprise(String raison_sociale, String adresse, String telephone, 
        String email ,String nom_Responsable){
            return entrp.insertEntreprise(raison_sociale, adresse, telephone, email, nom_Responsable);
        }
        public boolean deleteEntreprise(String raison_sociale){
            return entrp.deleteEntreprise(raison_sociale);
        }
        public boolean updateEntreprise(String raison_sociale, String adresse, String telephone, 
        String email ,String nom_Responsable){
            return entrp.updateEntreprise(raison_sociale, adresse, telephone, email, nom_Responsable);
        }
        public ArrayList<Entreprise> getAllEntreprise(){
            return entrp.getAllEntreprise();
        }
}
