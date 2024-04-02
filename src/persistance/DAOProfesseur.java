package persistance;

import java.util.ArrayList;

import Metier.MetierPOJO.Professeur;
import Metier.MetierGestion.GestionnaireFiliere;

import java.sql.*;

public class DAOProfesseur{
    //GestionnaireFiliere gst = new GestionnaireFiliere();
    public String getnomById(int id) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Professeur where Id_professeur=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String nom = rs.getString("nom_professeur");
                con.close();
                return nom;
            } else {
                con.close();
                return null;
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public int getIDByNom(String nom) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Professeur where nom_professeur=?");
            stmt.setString(1, nom);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("Id_professeur");
                con.close();
                return id;
            } else {
                con.close();
                return -1;
            }
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
	public boolean isExisteByID(String id) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Professeur where Id_professeur=?");
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
	}
    public int getDepartementBynom(String departement) {
        DAODepartement dao = new DAODepartement();
        return dao.getIDByNom(departement);
    }
    public String getDepartementById(int departement) {
        DAODepartement dao = new DAODepartement();
        return dao.getnomById(departement);
    }
	public boolean insertProfesseur(String nom, String prenom, String email, 
        String grade ,String departement) {
        try{ 
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("insert into Professeur values(?,?,?,?,?,?)");  
            stmt.setInt(1,0); 
            stmt.setString(2,nom);
            stmt.setString(3,prenom);
            stmt.setString(4,email);
            stmt.setString(5,grade);
            stmt.setInt(6,getDepartementBynom(departement));      
            int i=stmt.executeUpdate(); 
            stmt=con.prepareStatement("insert into Membre_Departement values(?,?)");
            stmt.setInt(1,getDepartementBynom(departement));
            stmt.setInt(2,getIDByNom(nom));
            int j = stmt.executeUpdate();
            if(i>0 && j>0){
                System.out.println(i+" records inserted");  
                con.close();  
                return true; 
            }
            else{
                System.out.println("Error");
                con.close();  
                return false; 
            } 
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

  public boolean deleteProfesseur(int id) {
    try{  
        Connection con = Connexion.ConnectDB();
        //PreparedStatement stmt = null;
        
        // Supprimer les enregistrements dans la table Membre_Laboratoire_professeurs
       PreparedStatement stmt = con.prepareStatement("delete from Membre_Laboratoire_professeurs where Id_professeur=?");  
        stmt.setInt(1,id); 
        int k = stmt.executeUpdate();

        // Supprimer les enregistrements dans la table Etudiant avec id_filiere en cascade
        stmt = con.prepareStatement("delete from Etudiant where id_filiere in (select id_filiere from Filiere where id_Coordonateur=?)");
        stmt.setInt(1, id);
        int h = stmt.executeUpdate();
        
        // Supprimer les enregistrements dans la table Filiere avec id_Coordonateur = id
        stmt = con.prepareStatement("delete from Filiere where id_Coordonateur=?");
        stmt.setInt(1, id);
        int m = stmt.executeUpdate();

        // Supprimer les enregistrements dans la table Membre_Departement avec Id_professeur = id
        stmt = con.prepareStatement("delete from Membre_Departement where Id_professeur=?");
        stmt.setInt(1,id);
        int n = stmt.executeUpdate();

        // Supprimer les enregistrements dans la table Laboratoire avec Id_responsable = id
        stmt = con.prepareStatement("delete from Laboratoire where Id_responsable=?");  
        stmt.setInt(1,id);
        int o = stmt.executeUpdate(); 

        if(k>0 || m>0 || n>0 || o>0 || h>0) {
            System.out.println("Enregistrements supprimés avec succès.");  
            con.close();  
            return true; 
        }
        else{
            System.out.println("Aucun enregistrement trouvé avec cet ID.");
            con.close();  
            return false; 
        } 
    }
    catch(Exception e){
        System.out.println(e);
        return false;
    }
}



	public ArrayList<Professeur> getAllProfesseur() {
        ArrayList<Professeur> professeurs = new ArrayList<Professeur>();
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("select * from Professeur");  
            ResultSet rs=stmt.executeQuery();  
            while(rs.next()){  
                Professeur professeur = new Professeur(rs.getInt(1) ,rs.getString(2), rs.getString(3), rs.getString(4) , rs.getString(5), getDepartementById(rs.getInt(6)));
                professeurs.add(professeur);
            }  
            con.close();
            System.out.println("All records selected");
            return professeurs;  
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    //update
    public boolean updateProfesseur(int id,String nom, String prenom, String email, 
        String grade ,String departement) {
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("update Professeur set nom_professeur=?,prenom_professeur=?,Email_professeur=?,Grade_professeur=?,id_departement=? where Id_professeur=?");  
            stmt.setString(1,nom);
            stmt.setString(2,prenom);
            stmt.setString(3,email);
            stmt.setString(4,grade);
            stmt.setInt(5,getDepartementBynom(departement));
            stmt.setInt(6,id); 
            int i=stmt.executeUpdate(); 
            if(i>0){
                System.out.println(i+" records updated");  
                con.close();  
                return true; 
            }
            else{
                System.out.println("Error");
                con.close();  
                return false; 
            } 
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
	
    //get professeur's departement
    public String getDepartementByProfesseur(int id) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Professeur where Id_professeur=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int id_departement = rs.getInt("id_departement");
                String departement =getDepartementById(id_departement);
                con.close();
                return departement;
            } else {
                con.close();
                return null;
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public ArrayList<Professeur> getAllProfesseur(String departement) {
        ArrayList<Professeur> professeurs = new ArrayList<Professeur>();
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("select * from Professeur where id_departement=?");
            stmt.setInt(1,getDepartementBynom(departement));
            ResultSet rs=stmt.executeQuery();  
            while(rs.next()){  
                Professeur professeur = new Professeur(rs.getInt(1) ,rs.getString(2), rs.getString(3), rs.getString(4) , rs.getString(5), getDepartementById(rs.getInt(6)));
                professeurs.add(professeur);
            }  
            con.close();
            System.out.println("All records selected");
            return professeurs;  
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    public boolean ajouterMembreDepartement(int idProf, int idDepartement) {
    try {
        Connection con=Connexion.ConnectDB();
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO Membre_Departement (idDepartement, idProf) VALUES (?, ?)");
        pstmt.setInt(1, idDepartement);
        pstmt.setInt(2, idProf);
        pstmt.executeUpdate();
        pstmt.close();
        			return true;

    } catch (SQLException ex) {
        System.out.println("Erreur lors de l'insertion dans la table Membre departement : " + ex.getMessage());
    }
    			return false;

}

public boolean isExisteByNomAndPrenom(String nom , String prenom){
    try{  
        Connection con=Connexion.ConnectDB();
        PreparedStatement stmt=con.prepareStatement("select * from Professeur where nom_professeur=? and prenom_professeur=?");  
        stmt.setString(1,nom);
        stmt.setString(2,prenom);
        ResultSet rs=stmt.executeQuery();  
        if(rs.next()){  
            con.close();
            return true; 
        }
        else{
            con.close();
            return false; 
        } 
    }
    catch(Exception e){
        System.out.println(e);
        return false;
    }
}

}



