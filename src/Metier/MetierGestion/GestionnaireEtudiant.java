package Metier.MetierGestion;
import java.util.ArrayList;

import Metier.MetierPOJO.Etudiant;
import persistance.DAOEtudiant;

public class GestionnaireEtudiant {
    
    private DAOEtudiant etud ;

    
    public GestionnaireEtudiant(DAOEtudiant etud) {
        this.etud = etud;
    }
    
    public GestionnaireEtudiant() {
        super();
        etud=new DAOEtudiant(); 
    
    }
    public ArrayList<Etudiant> getAll(){
		return etud.getAll();
	}
    public Boolean inseretEtudiant(String CNE ,String nom, String prenom, String email,
    String niveau , String filiere){
        return etud.insertEtudiant(CNE, nom, prenom, email, niveau, filiere);
    }

    public boolean deleteEtudiant(int id){
        return etud.deleteEtudiant(id);
    }


    public boolean updateEtudiant(int id,String CNE ,String nom, String prenom, String email, 
    String niveau , String filiere){
        return etud.updateEtudiant(id, CNE, nom, prenom, email, niveau, filiere);
    }

    public Boolean ByNomAndPrenom(String nom, String prenom){
        return etud.isExisteByNomAndPrenom(nom, prenom);
    }

    public int getEtudiantIdByCNE(String cne) {
        return etud.getEtudiantIdByCNE(cne);
    }



}
