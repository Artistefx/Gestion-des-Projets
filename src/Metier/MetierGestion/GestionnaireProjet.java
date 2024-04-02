package Metier.MetierGestion;


import java.sql.Date;
import java.util.ArrayList;
import Metier.MetierPOJO.Projet;
import persistance.DAOProjet;

public class GestionnaireProjet {
    DAOProjet projet ;

    public GestionnaireProjet(DAOProjet projet) {
        this.projet = projet;
    }

    public GestionnaireProjet(){
        projet = new DAOProjet();
    }

    public boolean createPfaPfe(String titre, Date depart, String typeProjet, String lieu, int duree,
    String etudiant,String encadrant1){
        return projet.insertProjetPFaPFe(titre, depart, typeProjet, lieu, duree,etudiant, encadrant1);
    }

    public boolean createDoctorat(String titre, Date depart, String typeProjet, String lieu, int duree,
    String etudiant,String encadrant1, String encadrant2){
        return projet.insertProjetDoctorat(titre, depart, typeProjet, lieu, duree,etudiant, encadrant1, encadrant2);
    }

    public boolean deleteProjet(int id){
        return projet.DeleteProjet(id);
    }

    public ArrayList<Projet> getAllProjet(){
        return projet.getAllProjet();
    }

    public ArrayList<Projet> getAllProjetPFA() {
        return projet.getAllProjetPFA();
    }

    public ArrayList<Projet> getAllProjetPFE() {
        return projet.getAllProjetPFE();
    }

    public ArrayList<Projet> getAllProjetDoc() {
        return projet.getAllProjetDoctorat();
    }

    public ArrayList<Projet> getAllProjetByEncadrant(String nom) {
        return projet.getAllProjetEncdrantByNomAndPrenom(nom);
    }

    public ArrayList<String> getAllTitreProjet() {
        return projet.getAllTitreProjet();
    }

    
}
