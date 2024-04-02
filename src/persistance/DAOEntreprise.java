package persistance;

import java.util.ArrayList;

import Metier.MetierPOJO.Entreprise;

import java.sql.*;

public class DAOEntreprise {
    public boolean isExisteByID(String raison_sociale) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Entreprise where raison_sociale=?");
            stmt.setString(1, raison_sociale);
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

	public boolean insertEntreprise(String raison_sociale, String adresse, String telephone, 
        String email ,String nom_Responsable) {
        try{ 
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("insert into Entreprise values(?,?,?,?,?)");
            stmt.setString(1,raison_sociale);
            stmt.setString(2,adresse);
            stmt.setString(3,telephone);
            stmt.setString(4,email);
            stmt.setString(5,nom_Responsable);
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
        catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean deleteEntreprise(String raison_sociale) {
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("delete from Entreprise where raison_sociale=?");  
            stmt.setString(1,raison_sociale);  
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

    public boolean updateEntreprise(String raison_sociale, String adresse, String telephone, 
        String email ,String nom_Responsable) {
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("update Entreprise set Adresse_Entreprise=?,Telephone_Entreprise=?,Email_entreprise=?,Responsable_entreprise=? where raison_sociale=?");  
            stmt.setString(1,adresse);
            stmt.setString(2,telephone);
            stmt.setString(3,email);
            stmt.setString(4,nom_Responsable);
            stmt.setString(5,raison_sociale);
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

    public ArrayList<Entreprise> getAllEntreprise() {
        ArrayList<Entreprise> list = new ArrayList<Entreprise>();
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Entreprise");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Entreprise e = new Entreprise(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public int getIDByNom(String nom) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Entreprise where raison_sociale=?");
            stmt.setString(1, nom);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt(1);
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

    public String getNomById(String id) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Entreprise where raison_sociale=?");
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String nom = rs.getString(2);
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
}
