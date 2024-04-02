package Metier.MetierGestion;
import java.util.ArrayList;

import Metier.MetierPOJO.Etudiant;
import Metier.MetierPOJO.Filiere;
import persistance.DAOFiliere;
public class GestionnaireFiliere {
    DAOFiliere filiere ;

    public GestionnaireFiliere(DAOFiliere filiere) {
        this.filiere = filiere;
    }
    public GestionnaireFiliere(){
        this.filiere = new DAOFiliere();
    }
    public boolean insertFiliere(String Nom_filiere, String departementFiliere, String Coordonateur){
        return filiere.insertFiliere(Nom_filiere, departementFiliere, Coordonateur);
    }
    public boolean deleteFiliere(int id_filiere){
        return filiere.deleteFiliere(id_filiere);
    }
    public boolean updateFiliere(int id_filiere,String Nom_filiere, String departementFiliere, String Coordonateur){
        return filiere.updateFiliere(id_filiere, Nom_filiere, departementFiliere, Coordonateur);
    }
    public ArrayList<Filiere> getAllFiliere(){
        return filiere.getAllFiliere();
    }
    public ArrayList<Etudiant> getAllEtudiant(String filier){
        return filiere.getAllEtudiant(filier);
    }
    public boolean updateCoordinateurFiliere(String Nom_filiere,String coordonateur){
        return filiere.updateCoordinateurFiliere(Nom_filiere, coordonateur);
    }
    public boolean checkCoordinateurDepartement(String coordinateur, String departement) {
         return filiere.checkCoordinateurDepartement(coordinateur, departement);
    }
    
}
