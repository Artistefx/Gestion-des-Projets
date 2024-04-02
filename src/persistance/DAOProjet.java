package persistance;

import java.sql.*;
import java.util.ArrayList;


import Metier.MetierPOJO.Projet;

public class DAOProjet {
    public boolean IsExisteByID(int id) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Projet where num_projet=?");
            stmt.setInt(1, id);
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

    public boolean insertProjetPFaPFe(String titre, Date depart, String typeProjet, String lieu, int duree,
    String etudiant,String encadrant1) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("insert into Projet(num_projet , titre_projet , Date_departProjet ,Type_projet ,id_entreprise,duree_projet,id_etudiant ,Id_encadrant1) values(?,?,?,?,?,?,?,?)");
            stmt.setInt(1, 0);
            stmt.setString(2, titre);
            stmt.setDate(3, depart);
            stmt.setString(4, typeProjet);
            stmt.setInt(6,duree);
            stmt.setString(5, lieu);
            stmt.setInt(7, getEtudiantBynom(etudiant));
            stmt.setInt(8, getProfesseurBynom(encadrant1));
            stmt.executeUpdate();
            con.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    private int getEtudiantBynom(String etudiant) {
        DAOEtudiant daoEtudiant = new DAOEtudiant();
        return daoEtudiant.getIDByNom(etudiant);
    }

    public boolean insertProjetDoctorat(String titre, Date depart, String typeProjet, String lieu, int duree,
    String doctorant,String encadrant1, String encadrant2) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("insert into Projet(num_projet , titre_projet , Date_departProjet ,Type_projet ,id_labo,duree_projet,id_etudiant ,Id_encadrant1,Id_encadrant2) values(?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, 0);
            stmt.setString(2, titre);
            stmt.setDate(3, depart);
            stmt.setString(4, typeProjet);
            stmt.setInt(6,duree);
            stmt.setInt(5, getidbynomLabo(lieu));
            stmt.setInt(7, getEtudiantBynom(doctorant));
            stmt.setInt(8, getProfesseurBynom(encadrant1));
            stmt.setInt(9, getProfesseurBynom(encadrant2));
            stmt.executeUpdate();
            con.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean DeleteProjet(int id) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("delete from Projet where num_projet=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            con.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public ArrayList<Projet> getAllProjet() {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Projet");
            ResultSet rs = stmt.executeQuery();
            ArrayList<Projet> list = new ArrayList<Projet>();
            while (rs.next()) {
                Projet p = new Projet();
                p.setNum_projet(rs.getInt(1));
                p.setTitre(rs.getString(2));
                p.setDepart(rs.getString(3));
                p.setType(rs.getString(4));
                p.setDuree(rs.getInt(7));
                if(rs.getString(6) == null){
                    p.setLieu(getnombyidLabo(rs.getInt(5)));
                }
                else{
                    p.setLieu(getnombyidEntr(rs.getString(6)));
                }
                p.setEtudiant(getEtudiantByID(rs.getInt(8)));
                p.setEncadrant1(getProfesseurById(rs.getInt(9)));
                if(getProfesseurById(rs.getInt(10)) != null){
                    p.setEncadrant2(getProfesseurById(rs.getInt(10)));
                }
                else{
                    p.setEncadrant2("null");
                }
                list.add(p);
            }
            con.close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    private String getEtudiantByID(int int1) {
        DAOEtudiant daoEtudiant = new DAOEtudiant();
        return daoEtudiant.getnomById(int1);
    }

    public int getidbynomLabo(String nom) {
        DAOLaboratoire dao = new DAOLaboratoire();
        return dao.getIDByNom(nom);
    }

    public String getnombyidLabo(int id) {
        DAOLaboratoire dao = new DAOLaboratoire();
        return dao.getNomById(id);
    }

    public int getidbynomEntr(String nom) {
        DAOEntreprise dao = new DAOEntreprise();
        return dao.getIDByNom(nom);
    }

    public String getnombyidEntr(String id) {
        DAOEntreprise dao = new DAOEntreprise();
        return dao.getNomById(id);
    }

    public int getProfesseurBynom(String nom) {
        DAOProfesseur dao = new DAOProfesseur();
        return dao.getIDByNom(nom);
    }
    public String getProfesseurById(int id) {
        DAOProfesseur dao = new DAOProfesseur();
        return dao.getnomById(id);
    }

    public ArrayList<Projet> getAllProjetPFA() {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Projet where Type_projet='PFA'");
            ResultSet rs = stmt.executeQuery();
            ArrayList<Projet> list = new ArrayList<Projet>();
            while (rs.next()) {
                Projet p = new Projet();
                p.setNum_projet(rs.getInt(1));
                p.setTitre(rs.getString(2));
                p.setDepart(rs.getString(3));
                p.setType(rs.getString(4));
                p.setDuree(rs.getInt(7));
                p.setLieu(rs.getString(6));
                p.setEtudiant(getEtudiantByID(rs.getInt(8)));
                p.setEncadrant1(getProfesseurById(rs.getInt(9)));
                list.add(p);
            }
            con.close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public ArrayList<Projet> getAllProjetPFE() {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Projet where Type_projet='PFE'");
            ResultSet rs = stmt.executeQuery();
            ArrayList<Projet> list = new ArrayList<Projet>();
            while (rs.next()) {
                Projet p = new Projet();
                p.setNum_projet(rs.getInt(1));
                p.setTitre(rs.getString(2));
                p.setDepart(rs.getString(3));
                p.setType(rs.getString(4));
                p.setDuree(rs.getInt(7));
                p.setLieu(rs.getString(6));
                p.setEtudiant(getEtudiantByID(rs.getInt(8)));
                p.setEncadrant1(getProfesseurById(rs.getInt(9)));
                list.add(p);
            }
            con.close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public ArrayList<Projet> getAllProjetDoctorat() {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Projet where Type_projet='doctorat'");
            ResultSet rs = stmt.executeQuery();
            ArrayList<Projet> list = new ArrayList<Projet>();
            while (rs.next()) {
                Projet p = new Projet();
                p.setNum_projet(rs.getInt(1));
                p.setTitre(rs.getString(2));
                p.setDepart(rs.getString(3));
                p.setType(rs.getString(4));
                p.setDuree(rs.getInt(7));
                p.setLieu(getnombyidLabo(rs.getInt(5)));
                p.setEtudiant(getEtudiantByID(rs.getInt(8)));
                p.setEncadrant1(getProfesseurById(rs.getInt(9)));
                p.setEncadrant2(getProfesseurById(rs.getInt(10)));
                list.add(p);
            }
            con.close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public ArrayList<Projet> getAllProjetEncdrantByNomAndPrenom(String nom) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Projet where Id_encadrant1=? or Id_encadrant2=?");
            stmt.setInt(1, getProfesseurBynom(nom));
            stmt.setInt(2, getProfesseurBynom(nom));
            ResultSet rs = stmt.executeQuery();
            ArrayList<Projet> list = new ArrayList<Projet>();
            while (rs.next()) {
                Projet p = new Projet();
                p.setNum_projet(rs.getInt(1));
                p.setTitre(rs.getString(2));
                p.setDepart(rs.getString(3));
                p.setType(rs.getString(4));
                p.setDuree(rs.getInt(7));
                if(rs.getString(6) == null){
                    p.setLieu(getnombyidLabo(rs.getInt(5)));
                }
                else{
                    p.setLieu(getnombyidEntr(rs.getString(6)));
                }
                p.setEtudiant(getEtudiantByID(rs.getInt(8)));
                p.setEncadrant1(getProfesseurById(rs.getInt(9)));
                if(getProfesseurById(rs.getInt(10)) != null){
                    p.setEncadrant2(getProfesseurById(rs.getInt(10)));
                }
                else{
                    p.setEncadrant2("null");
                }
                list.add(p);
            }
            con.close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public ArrayList<String> getAllTitreProjet() {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select titre_projet from Projet");
            ResultSet rs = stmt.executeQuery();
            ArrayList<String> list = new ArrayList<String>();
            while (rs.next()) {
                list.add(rs.getString(1));
            }
            con.close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}

