package persistance;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Metier.MetierPOJO.Rendez_vous;

public class DAORendez_vous {

    public boolean InsertRendez(Date date, String lieu, String projet){
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement ps = con.prepareStatement("INSERT INTO rendez_vous (id_rendez_vous , Date_rendez_vous, lieu_rendez_vous, id_projet) VALUES (?,?,?,?)");
            ps.setInt(1, 0);
            ps.setDate(2, date);
            ps.setString(3, lieu);
            ps.setInt(4, GetProjetBytitre(projet));
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean AddDocToRendez_vous(String doc, int id_rendez_vous) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement ps = con.prepareStatement("UPDATE rendez_vous SET id_rapport = ? WHERE id_rendez_vous = ?");
            ps.setInt(1, GetDocByName(doc));
            ps.setInt(2, id_rendez_vous);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private String GetDocByID(int id) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select file_name from Documents where id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String s = rs.getString(1);
                con.close();
                return s;
            } else {
                con.close();
                return "none";
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
    }

    private int GetDocByName(String doc) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select id from Documents where file_name=?");
            stmt.setString(1, doc);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int s = rs.getInt(1);
                con.close();
                return s;
            } else {
                con.close();
                return -1;
            }
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }

    private int GetProjetBytitre(String projet) {
        try (Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("SELECT num_projet FROM Projet WHERE titre_projet = ?")) {
            stmt.setString(1, projet);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("num_projet");
                } else {
                    return -1;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    /*private String GetNomByIDProjet(int int1) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select titre_projet from Projet where num_projet=?");
            stmt.setInt(1, int1);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String s = rs.getString(1);
                con.close();
                return s;
            } else {
                con.close();
                return null;
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }*/

    public List<Rendez_vous> getAllRendez_vousByProf(String nom) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from rendez_vous where id_projet in (select num_projet from Projet where Id_encadrant1=? or Id_encadrant2=?);");
            stmt.setInt(1, GetProfByNom(nom));
            stmt.setInt(2, GetProfByNom(nom));
            ResultSet rs = stmt.executeQuery();
            List<Rendez_vous> list = new ArrayList<>();
            while (rs.next()) {
                Rendez_vous r = new Rendez_vous();
                r.setId(rs.getInt(1));
                r.setDate(rs.getDate(2));
                r.setLieu(rs.getString(3));
                r.setprojet(GetProjetById(rs.getInt(4)));
                if (rs.getString(5) != null) {
                    r.setdocument(GetDocByID(rs.getInt(5)));
                }
                else {
                    r.setdocument("none");
                }
                list.add(r);
            }
            con.close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    private int GetProfByNom(String nom) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select Id_professeur from Professeur where nom_professeur=?");
            stmt.setString(1, nom);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int s = rs.getInt(1);
                con.close();
                return s;
            } else {
                con.close();
                return -1;
            }
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }

    private String GetProjetById(int int1) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select titre_projet from Projet where num_projet=?");
            stmt.setInt(1, int1);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String s = rs.getString(1); 
                con.close();
                return s;
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
