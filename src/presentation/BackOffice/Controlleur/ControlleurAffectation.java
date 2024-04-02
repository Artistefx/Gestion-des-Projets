/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation.BackOffice.Controlleur;

import Metier.MetierGestion.GestionnaireFiliere;
import Metier.MetierPOJO.Filiere;
import presentation.BackOffice.Vues.Affectation;

import javax.swing.JOptionPane;

/**
 *
 * @author MERYEM
 */
public class ControlleurAffectation {
    
    private Affectation affectation;
    private GestionnaireFiliere gst;
    private Filiere filiere;
    
    
     public void demmarrerApplication() {
       this.affectation = new Affectation(this);
        this.affectation.setVisible(true);
    }
     
     public void Affecter(String f,String c){
         this.gst = new GestionnaireFiliere();
         if(this.gst.updateCoordinateurFiliere(f, c)){
             			JOptionPane.showMessageDialog(null, "Professeur Affecté avec Succès ");
         }
                                else 
             			JOptionPane.showMessageDialog(null, "Erreur");


     }
     
     
}
