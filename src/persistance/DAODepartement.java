package persistance;

import java.util.ArrayList;


import Metier.MetierPOJO.Departement;
import Metier.MetierPOJO.Etudiant;
import Metier.MetierPOJO.Professeur;

import java.sql.*;

public class DAODepartement {
    DAOEtudiant etdDAO;
    
    public boolean isExistByID(int id) {
        boolean exist = false;
        try {
            Connection connection = Connexion.ConnectDB();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM departement WHERE id_departement=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                exist = true;
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return exist;
    }

    public boolean insertDepartement(int id_departement, String nom_departement, String chef_departement) {
        try {
            Connection connection = Connexion.ConnectDB();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO departement VALUES(?,?,?)");
            ps.setInt(1, id_departement);
            ps.setString(2, nom_departement);
            ps.setInt(3, getProfesseurBynom(chef_departement));
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println(i + " records inserted");
                connection.close();
                return true;
            } else {
                System.out.println("Error");
                connection.close();
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean deleteDepartement(int id) {
        try {
            Connection connection = Connexion.ConnectDB();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM departement WHERE id_departement=?");
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println(i + " records deleted");
                connection.close();
                return true;
            } else {
                System.out.println("Error");
                connection.close();
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean updateDepartement(int id, String nom, String chef) {
        try {
            Connection connection = Connexion.ConnectDB();
            PreparedStatement ps = connection.prepareStatement("UPDATE departement SET Nom_departement=?, chef_departement=? WHERE id_departement=?");
            ps.setString(1, nom);
            ps.setInt(2, getProfesseurBynom(chef));
            ps.setInt(3, id);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println(i + " records updated");
                connection.close();
                return true;
            } else {
                System.out.println("Error");
                connection.close();
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public ArrayList<Departement> getAllDepartement() {
        ArrayList<Departement> list = new ArrayList<Departement>();
        try {
            Connection connection = Connexion.ConnectDB();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM departement");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Departement departement = new Departement( rs.getInt("id_departement"), rs.getString("Nom_departement"), getProfesseurById(rs.getInt("chef_departement")));
                list.add(departement);
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public ArrayList<Professeur> getMembreDepartement() {
        ArrayList<Professeur> list = new ArrayList<Professeur>();
        try {
            Connection connection = Connexion.ConnectDB();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM professeur WHERE id_professeur IN (SELECT id_professeur FROM Membre_Departement)");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Professeur professeur = new Professeur(rs.getInt(1) ,rs.getString(2), rs.getString(3), rs.getString(4) , rs.getString(5), getDepartementById(rs.getInt(6)));
                list.add(professeur);
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public int getDepartementBynom(String departement) {
        DAODepartement dao = new DAODepartement();
        return dao.getIDByNom(departement);
    }
    public String getDepartementById(int departement) {
        DAODepartement dao = new DAODepartement();
        return dao.getnomById(departement);
    }
    
    public int getIDByNom(String nom) {
        int id = 0;
        try {
            Connection connection = Connexion.ConnectDB();
            PreparedStatement ps = connection.prepareStatement("SELECT id_departement FROM departement WHERE Nom_departement=?");
            ps.setString(1, nom);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id_departement");
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return id;
    }

    public String getnomById(int id) {
        String nom = "";
        try {
            Connection connection = Connexion.ConnectDB();
            PreparedStatement ps = connection.prepareStatement("SELECT Nom_departement FROM departement WHERE id_departement=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nom = rs.getString("Nom_departement");
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return nom;
    }

    public int getProfesseurBynom(String nom) {
        DAOProfesseur dao = new DAOProfesseur();
        return dao.getIDByNom(nom);
    }
    public String getProfesseurById(int id) {
        DAOProfesseur dao = new DAOProfesseur();
        return dao.getnomById(id);
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
    public ArrayList<Etudiant> getAllEtudiant(String departement) {
        ArrayList<Etudiant> etudiants = new ArrayList<>();

        try {
            // Prepare the SQL query
             Connection con=Connexion.ConnectDB();

            String query = "SELECT e.id_etudiant, e.CNE, e.nom_etudiant, e.prenom_etudiant, e.Email_etudiant, e.Niveau_etudiant " +
                           "FROM Etudiant e " +
                           "JOIN Filiere f ON e.id_filiere = f.id_filiere " +
                           "JOIN Departement d ON f.id_departementFiliere = d.id_departement " +
                           "WHERE d.Nom_departement = ?";
            
            // Create a prepared statement
            PreparedStatement statement = con.prepareStatement(query);
            
            // Set the parameter
            statement.setString(1, departement);
            
            // Execute the query
            ResultSet resultSet = statement.executeQuery();
            
            // Iterate through the result set
            while (resultSet.next()) {
                // Retrieve the values from the result set
                int id = resultSet.getInt("id_etudiant");
                String cne = resultSet.getString("CNE");
                String nom = resultSet.getString("nom_etudiant");
                String prenom = resultSet.getString("prenom_etudiant");
                String email = resultSet.getString("Email_etudiant");
                String niveau = resultSet.getString("Niveau_etudiant");
                int filiere = resultSet.getInt(("id_filiere"));
                String filier = etdDAO.getFiliereById(filiere);


                
                // Create a new Etudiant object
                Etudiant etudiant = new Etudiant( id,cne, nom, prenom, email, niveau , filier );
                
                // Add the Etudiant object to the ArrayList
                etudiants.add(etudiant);
            }
            
            // Close the statement and result set
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return etudiants;
    }

    public Departement getDepartement(String nom) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM departement WHERE Nom_departement = ?");
            ps.setString(1, nom);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                // Retrieve the values from the result set
                int id = resultSet.getInt("id_departement");
                String nomDepartement = resultSet.getString("Nom_departement");
                String idChefDepartement = resultSet.getString("chef_departement");
                //String nomChefDepartement = getProfesseurById(idChefDepartement);            // Create and return a new Departement object with the retrieved values
                Departement departement = new Departement(id, nomDepartement,idChefDepartement);
                return departement;
            }
        } catch (SQLException e) {
            // Handle any SQL errors here
            e.printStackTrace();
        }
        // Return null if the department was not found
        return null;
    }
}
