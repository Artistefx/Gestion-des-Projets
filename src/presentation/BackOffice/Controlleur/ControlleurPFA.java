package presentation.BackOffice.Controlleur;

import java.sql.Date;
import java.util.ArrayList;

import Metier.MetierGestion.GestionnaireProjet;
import Metier.MetierPOJO.Projet;
import presentation.BackOffice.Vues.ProjetPFA;
import presentation.BackOffice.Vues.ProjetPFE;

public class ControlleurPFA {
    private ProjetPFA projetPFA;
    private ProjetPFE projetPFE;
    private GestionnaireProjet gestionnaireProjet;

    public void demmarrerApplication() {
        this.projetPFA = new ProjetPFA(this);
        this.projetPFA.setVisible(true);
    }

    public void demmarrerApplicationPFE() {
        this.projetPFE = new ProjetPFE(this);
        this.projetPFE.setVisible(true);
    }

    public void Affecter( String titre, Date depart, String typeProjet, String lieu, int duree,
    String etudiant,String encadrant1) {
        this.gestionnaireProjet = new GestionnaireProjet();
        if (this.gestionnaireProjet.createPfaPfe(titre, depart, typeProjet, lieu, duree,etudiant, encadrant1)) {
            //pop up
            this.projetPFA.afficherMessage("Projet affecté avec succès");
        } else {
            this.projetPFA.afficherMessage("Erreur lors de l'affectation du projet");
        }
    }

    public void Supprimer (int id) {
        this.gestionnaireProjet = new GestionnaireProjet();
        if (this.gestionnaireProjet.deleteProjet(id)) {
            //pop up
            this.projetPFA.afficherMessage("Projet supprimé avec succès");
        } else {
            this.projetPFA.afficherMessage("Erreur lors de la suppression du projet");
        }
    }

    public void AffecterPFE( String titre, Date depart, String typeProjet, String lieu, int duree,
    String etudiant,String encadrant1) {
        this.gestionnaireProjet = new GestionnaireProjet();
        if (this.gestionnaireProjet.createPfaPfe(titre, depart, typeProjet, lieu, duree,etudiant, encadrant1)) {
            //pop up
            this.projetPFE.afficherMessage("Projet affecté avec succès");
        } else {
            this.projetPFE.afficherMessage("Erreur lors de l'affectation du projet");
        }
    }

    public void SupprimerPFE (int id) {
        this.gestionnaireProjet = new GestionnaireProjet();
        if (this.gestionnaireProjet.deleteProjet(id)) {
            //pop up
            this.projetPFE.afficherMessage("Projet supprimé avec succès");
        } else {
            this.projetPFE.afficherMessage("Erreur lors de la suppression du projet");
        }
    }

    public ArrayList<Projet> getAllProjetPFA() {
        this.gestionnaireProjet = new GestionnaireProjet();
        return this.gestionnaireProjet.getAllProjetPFA();
    }

    public ArrayList<Projet> getAllProjetPFE() {
        this.gestionnaireProjet = new GestionnaireProjet();
        return this.gestionnaireProjet.getAllProjetPFE();
    }


}

