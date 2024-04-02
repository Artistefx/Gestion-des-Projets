package Metier.MetierGestion;
import Metier.MetierPOJO.Etudiant;
import java.util.ArrayList;

import Metier.MetierPOJO.Laboratoire;
import Metier.MetierPOJO.Professeur;
import persistance.DAOLaboratoire;
public class GestionnaireLabo {
    DAOLaboratoire labo ;

    public GestionnaireLabo(DAOLaboratoire labo) {
        this.labo = labo;
    }
    public GestionnaireLabo(){
        this.labo = new DAOLaboratoire();
    }
    public boolean insertLaboratoire(String Nom_laboratoire,String email, String Coordonateur) {
        return labo.insertLaboratoire(Nom_laboratoire, email, Coordonateur);
        
    }
    public boolean deleteLaboratoire(int id_laboratoire){
        return labo.deleteLaboratoire(id_laboratoire);
    }
    public boolean updateLaboratoire(int id_laboratoire, String Nom_laboratoire,String email, String Coordonateur) {
   return labo.updateLaboratoire(id_laboratoire, Nom_laboratoire, email, Coordonateur);
    }
    public ArrayList<Laboratoire> getAllLaboratoire(){
        return labo.getAllLaboratoire();
    }
    public ArrayList<Etudiant> getAllEtudiant(String laboratoire){
    return labo.getAllEtudiant(laboratoire);
   
    }
    public boolean ajouterMembreLaboDoctorant(int idDoctorant, int idLabo) {
        return labo.ajouterMembreLaboDoctorant(idDoctorant, idLabo);
        
    }
    	public int getIDByNom(String nom) {
            return labo.getIDByNom(nom);
        }
        public ArrayList<Professeur> getAllProfesseur(String laboratoire) {
            return labo.getAllProfesseur(laboratoire);
        }
            
}
