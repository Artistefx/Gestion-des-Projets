package Metier.MetierGestion;
import java.util.ArrayList;

import Metier.MetierPOJO.Departement;
import Metier.MetierPOJO.Etudiant;
import Metier.MetierPOJO.Professeur;
import persistance.DAODepartement;
public class GestionnaireDepartement {
    DAODepartement depat ;

    public GestionnaireDepartement(DAODepartement depat) {
        this.depat = depat;
    }
    public GestionnaireDepartement(){
        depat = new DAODepartement();
    }
   public void create(int id_departement, String nom_departement, String chef_departement){
    depat.insertDepartement( id_departement,  nom_departement,  chef_departement);
   }
   public void update(int id_departement, String nom_departement, String chef_departement){
    depat.updateDepartement( id_departement,  nom_departement,  chef_departement);
   }
   public boolean deletedepartement(int id){
    return depat.deleteDepartement(id);
   }
   
   public ArrayList<Departement> getAllDepartement(){
    return depat.getAllDepartement();
   }
   
   public ArrayList<Professeur> getAllProfesseur(String departement){
    return depat.getAllProfesseur(departement);
   }
    
   public ArrayList<Etudiant> getAllEtudiant(String departement) {
        return depat.getAllEtudiant(departement);
    }
    public Departement getDepartement(String nom) {
        return depat.getDepartement(nom);
    }
}
