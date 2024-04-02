package persistance;

import java.util.ArrayList;

import Metier.MetierPOJO.Etudiant;
import Metier.MetierPOJO.Filiere;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class DAOFiliere {
    public boolean isExisteByID(int id_filiere) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Filiere where id_filiere=?");
            stmt.setInt(1, id_filiere);
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

    public int getProfesseurBynom(String nom) {
        DAOProfesseur dao = new DAOProfesseur();
        return dao.getIDByNom(nom);
    }
    public String getProfesseurById(int id) {
        DAOProfesseur dao = new DAOProfesseur();
        return dao.getnomById(id);
    }

    public boolean CompareDepartement(String departement, int id) {
        DAOProfesseur dao = new DAOProfesseur();
        String departementFiliere = dao.getDepartementByProfesseur(id);
        if (departement.equals(departementFiliere)) {
            return true;
        } else {
            return false;
        }
    }
	public boolean insertFiliere(String Nom_filiere, String departementFiliere, String Coordonateur) {
        try{ 
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("insert into Filiere values(?,?,?,?)");
            stmt.setInt(1,0);
            stmt.setString(2,Nom_filiere);
            stmt.setInt(3,getDepartementBynom(departementFiliere));
            stmt.setInt(4,getProfesseurBynom(Coordonateur));
            if(CompareDepartement(departementFiliere, getProfesseurBynom(Coordonateur))){
                int i=stmt.executeUpdate();
                if(i>0){
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
            else{
                System.out.println("Error coordinateur n'appartient pas au departement");
                    con.close();  
                    return false; 
            }
            }
            catch(Exception e){
                System.out.println(e);
                return false;
            }    
    }

    public boolean deleteFiliere(int id_filiere) {
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("delete from Filiere where id_filiere=?");  
            stmt.setInt(1,id_filiere);
            int i=stmt.executeUpdate();  
            if(i>0){
                System.out.println(i+" records deleted");  
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

    public boolean updateFiliere(int id_filiere,String Nom_filiere, String departementFiliere, String Coordonateur) {
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("update Filiere set id_departementFiliere=?, id_Coordonateur=? , Nom_filiere=? where id_filiere=?");  
            stmt.setInt(1,getDepartementBynom(departementFiliere));
            stmt.setInt(2,getProfesseurBynom(Coordonateur));
            stmt.setString(3,Nom_filiere); 
            stmt.setInt(4,id_filiere);
            if(CompareDepartement(departementFiliere, getProfesseurBynom(Coordonateur))){
                int i=stmt.executeUpdate();
                if(i>0){
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
            else{
                System.out.println("Error coordinateur n'appartient pas au departement");
                    con.close();  
                    return false; 
            }
            }
            catch(Exception e){
                System.out.println(e);
                return false;
            }
    }


    public ArrayList<Filiere> getAllFiliere() {
        ArrayList<Filiere> list = new ArrayList<Filiere>();
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Filiere");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Filiere e = new Filiere(rs.getInt(1), rs.getString(2), getDepartementById(rs.getInt(3)),getProfesseurById(rs.getInt(4)));
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public int getIDByNomfiliere(String nom) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Filiere where Nom_filiere=?");
            stmt.setString(1, nom);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id_filiere");
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

	public String getNomFiliereByID(int id) {
	        try {
	            Connection con = Connexion.ConnectDB();
	            PreparedStatement stmt = con.prepareStatement("select * from Filiere where id_filiere=?");
	            stmt.setInt(1, id);
	            ResultSet rs = stmt.executeQuery();
	            if (rs.next()) {
	                String nom = rs.getString("Nom_filiere");
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

        public ArrayList<Etudiant> getAllEtudiant(String filiere) {
            ArrayList<Etudiant> etd = new ArrayList<Etudiant>();
            try{  
                Connection con=Connexion.ConnectDB();
                PreparedStatement stmt=con.prepareStatement("select * from Etudiant where id_filiere=?");
                stmt.setInt(1,getIDByNomfiliere(filiere));
                ResultSet rs=stmt.executeQuery();  
                while(rs.next()){  
                    Etudiant etudiant = new Etudiant(rs.getInt(1) ,rs.getString(2), rs.getString(3), rs.getString(4) , rs.getString(5),rs.getString(6), getNomFiliereByID(rs.getInt(7)));
                    etd.add(etudiant);
                }  
                con.close();
                System.out.println("All records selected");
                return etd;  
            }
            catch(Exception e){
                System.out.println(e);
                return null;
            }
        }

        public boolean updateCoordinateurFiliere(String Nom_filiere,String coordonateur){
    
            Connection con = Connexion.ConnectDB();
            try {
                PreparedStatement stmt = con.prepareStatement("UPDATE FILIERE SET id_Coordonateur=? WHERE Nom_filiere = ?");
                stmt.setInt(1,getProfesseurBynom(coordonateur));
                stmt.setString(2,Nom_filiere);
                int i=stmt.executeUpdate();  
                if(i>0){
                    System.out.println(i+" records edited");  
                    con.close();  
                    return true; 
                }
                else{
                    System.out.println("Error");
                    con.close();  
                    return false; 
                } 
                
            } catch (SQLException ex) {
                Logger.getLogger(DAOFiliere.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        return false;}
       public boolean checkCoordinateurDepartement(String coordinateur, String departement) {
        try{  
            Connection con = Connexion.ConnectDB();
            
            PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM Membre_Departement WHERE Id_professeur=? AND id_departement=?");
            stmt.setInt(1, getProfesseurBynom(coordinateur));
            stmt.setInt(2, getDepartementBynom(departement));
            ResultSet rs = stmt.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            con.close();
            return count > 0;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
