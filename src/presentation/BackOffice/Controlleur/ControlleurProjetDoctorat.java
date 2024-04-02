package presentation.BackOffice.Controlleur;

import java.sql.Date;
import java.util.ArrayList;

import Metier.MetierGestion.GestionnaireProjet;
import Metier.MetierPOJO.Projet;
import presentation.BackOffice.Vues.ProjetDoctorat;

public class ControlleurProjetDoctorat {
    private ProjetDoctorat projetDoctorat;
    private GestionnaireProjet gestionnaireProjet;

    public void demarrerApplication() {
        this.projetDoctorat = new ProjetDoctorat(this);
        this.projetDoctorat.setVisible(true);
    }

    public ArrayList<Projet> getAllProjetDoc() {
        this.gestionnaireProjet = new GestionnaireProjet();
        return this.gestionnaireProjet.getAllProjetDoc();
    }

    public void Supprimer(int id) {
        this.gestionnaireProjet = new GestionnaireProjet();
        this.gestionnaireProjet.deleteProjet(id);
    }

    public void Affecter(String titre, Date depart, String typeProjet, String lieu, int duree,
    String doctorant,String encadrant1, String encadrant2) {
        this.gestionnaireProjet = new GestionnaireProjet();
        if(this.gestionnaireProjet.createDoctorat(titre, depart, typeProjet, lieu, duree,doctorant, encadrant1, encadrant2))
            this.projetDoctorat.afficherMessage("Projet Doctorat Ajouté");
        else
            this.projetDoctorat.afficherMessage("Vérifier les données saisies");
    }

}
