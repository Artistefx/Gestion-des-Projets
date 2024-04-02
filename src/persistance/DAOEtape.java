package persistance;

import java.util.ArrayList;
import java.util.List;

import Metier.MetierPOJO.Etape;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;

public class DAOEtape {
    public boolean isExisteByID(int id_etape) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Etape where Id_etape=?");
            stmt.setInt(1, id_etape);
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

    public boolean insertEtape(String num_projet, int duree, Date date_depart) {
        try{ 
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("insert into Etape(Id_etape,num_projet,Duree_etape,Date_depareEtape,validite) values(?,?,?,?,?)");
            stmt.setInt(1,0);
            stmt.setInt(2,getProjetIdByTitre(num_projet));
            stmt.setInt(3,duree);
            stmt.setDate(4,date_depart);
            stmt.setInt(5,0);
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

    private int getProjetIdByTitre(String titre_projet) {
        try (Connection con = Connexion.ConnectDB();
             PreparedStatement stmt = con.prepareStatement("SELECT num_projet FROM Projet WHERE titre_projet = ?")) {
            stmt.setString(1, titre_projet);
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

    public boolean deleteEtape(int id_etape) {
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("delete from Etape where Id_etape=?");  
            stmt.setInt(1,id_etape);  
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

    public boolean updateEtape(int id_etape, int num_projet, int duree, Date date_depart, 
        int id_livraison) {
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("update Etape set Id_etape=?,Num_projet=?,Duree=?,Date_depart=? where Id_etape=?");  
            stmt.setInt(1,id_etape);
            stmt.setInt(2,num_projet);
            stmt.setInt(3,duree);
            stmt.setDate(4,date_depart);
            
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

    public ArrayList<Etape> getAllEtape() {
        ArrayList<Etape> list = new ArrayList<Etape>();
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Etape");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                if(rs.getInt(5) == 0){
                    Etape e = new Etape(rs.getInt(1), GetNomByIDProjet(rs.getInt(4)), rs.getInt(2), rs.getDate(3) , "Non Validé");
                    list.add(e);
                }
                else{
                    Etape e = new Etape(rs.getInt(1), GetNomByIDProjet(rs.getInt(4)), rs.getInt(2), rs.getDate(3) , "Validé");
                    list.add(e);
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    private String GetNomByIDProjet(int int1) {
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

    public boolean insertDocument(String file_name, String file_path) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("INSERT INTO Documents (file_name, file_data) VALUES (?, ?)");
            stmt.setString(1, file_name);
            
            File file = new File(file_path);
            InputStream inputStream = new FileInputStream(file);
            stmt.setBinaryStream(2, inputStream, file.length());
    
            int i = stmt.executeUpdate();
            if (i > 0) {
                System.out.println(i + " records inserted");
                con.close();
                return true;
            } else {
                System.out.println("Error");
                con.close();
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean insertDocIntoEtape(String file_name , int id_etape){
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("UPDATE Etape SET id_doc = ? WHERE Id_etape = ?");
            stmt.setInt(1, GetFileIdByName(file_name));
            System.out.println(GetFileIdByName(file_name));
            stmt.setInt(2, id_etape);
            int i = stmt.executeUpdate();
            if (i > 0) {
                System.out.println(i + " records inserted");
                con.close();
                return true;
            } else {
                System.out.println("Error");
                con.close();
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    private int GetFileIdByName(String file_name) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select id from Documents where file_name=?");
            stmt.setString(1, file_name);
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

    public boolean retrieveDocument(String fileName, String saveDirectory) {
        try {
            // Prepare the SELECT statement
            Connection con = Connexion.ConnectDB();
            String sql = "SELECT file_data FROM Documents WHERE file_name = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, fileName);

            // Execute the query
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                // Retrieve the file data from the result set
                byte[] fileData = resultSet.getBytes("file_data");

                // Save the file to the specified directory
                File outputFile = new File(saveDirectory, fileName);
                try (OutputStream outputStream = new FileOutputStream(outputFile)) {
                    outputStream.write(fileData);
                }

                return true;
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public List<Etape> getAllEtapeByProjet(String titre) {
        List<Etape> list = new ArrayList<Etape>();
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Etape WHERE num_projet = ?");
            stmt.setInt(1, getProjetIdByTitre(titre));
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                // Check the condition and set the status string accordingly
                String status = rs.getBoolean(5) ? "Non Validé" : "Validé";
            
                // Create the Etape object and add it to the list
                Etape e = new Etape(rs.getInt(1), GetNomByIDProjet(rs.getInt(4)), rs.getInt(2), rs.getDate(3), status);
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public boolean ValiderEtape(String value, int parseInt) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("UPDATE Etape SET validite = ? WHERE Id_etape = ? and num_projet=?");
            stmt.setInt(1, 1);
            stmt.setInt(2, parseInt);
            stmt.setInt(3, getProjetIdByTitre(value));
            int i = stmt.executeUpdate();
            if (i > 0) {
                System.out.println(i + " records inserted");
                con.close();
                return true;
            } else {
                System.out.println("Error");
                con.close();
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}

