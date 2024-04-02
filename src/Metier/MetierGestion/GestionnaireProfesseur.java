package Metier.MetierGestion;
import java.util.ArrayList;

import Metier.MetierPOJO.Professeur;
import persistance.DAOProfesseur;
public class GestionnaireProfesseur {
    DAOProfesseur prof ;

    public GestionnaireProfesseur() {
        prof =new DAOProfesseur();
    }

    public GestionnaireProfesseur(DAOProfesseur prof) {
        this.prof = prof;
    }
    
    
   
    public boolean insertProfesseur(String nom, String prenom, String email, 
    String grade ,String departement){
        return prof.insertProfesseur(nom, prenom, email, grade, departement);
    }
    public boolean deleteProfesseur(int id){
        return prof.deleteProfesseur(id);
    }
    public ArrayList<Professeur> getAllProfesseur(){
        return prof.getAllProfesseur();
    }
    public boolean updateProfesseur(int id,String nom, String prenom, String email, 
    String grade ,String departement){
        return prof.updateProfesseur(id, nom, prenom, email, grade, departement);
    }
        public int getIDByNom(String nom) {
            return prof.getIDByNom(nom);
        }
            public int getDepartementBynom(String departement) {
                return prof.getDepartementBynom(departement);
            }
         public boolean ajouterMembreDepartement(int idProf, int idDepartement) {
             return prof.ajouterMembreDepartement(idProf, idDepartement);
         }

         public boolean ByNomAndPrenom(String nom, String prenom){
            return prof.isExisteByNomAndPrenom(nom, prenom);
        }

 
}
