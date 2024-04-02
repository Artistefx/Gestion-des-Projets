package persistance;

import java.util.ArrayList;



import java.sql.*;



import Metier.MetierPOJO.Etudiant;



public class DAOEtudiant {
	
	
    public int getFiliereByNom(String filiere) {
        DAOFiliere dao = new DAOFiliere();
        return dao.getIDByNomfiliere(filiere);
    }     
    public String getFiliereById(int id_filiere) {
        DAOFiliere dao = new DAOFiliere();
        return dao.getNomFiliereByID(id_filiere);
    }
	public boolean insertEtudiant(String CNE ,String nom, String prenom, String email,
            String niveau , String filiere) {
        try {
            Connection con = Connexion.ConnectDB();
            String sql ="insert into Etudiant values(?,?,?,?,?,?,?)" ;
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, 0);
            stmt.setString(2, CNE);
            stmt.setString(3, nom);
            stmt.setString(4, prenom);
            stmt.setString(5, email);
            stmt.setString(6, niveau);
            stmt.setInt(7, getFiliereByNom(filiere));
            int i = stmt.executeUpdate();
            con.close();
            return i > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
	 }

     public boolean deleteEtudiant(int id) {
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("delete from Membre_Laboratoire_doctorants where id_doctorant=?");  
             stmt.setInt(1,id); 
            int k = stmt.executeUpdate();
            stmt=con.prepareStatement("delete from Projet where id_etudiant=?");  
            stmt.setInt(1,id); 
            int i = stmt.executeUpdate();
             stmt=con.prepareStatement("delete from Etudiant where id_etudiant=?");  
            stmt.setInt(1,id); 
            int j = stmt.executeUpdate();
            
            
            con.close();
            if(k>0 || i>0  || j>0) {
            System.out.println("Enregistrements supprimes avec succes.");  
            con.close();  
            return true; 
        }      
            else{
            System.out.println("Aucun enregistrement trouvé avec cet ID.");
            con.close();  
            return false; 
        
    }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
	public ArrayList<Etudiant> getAll(){
		ArrayList<Etudiant> etudiant = new ArrayList<Etudiant>();
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("select * from Etudiant");  
            ResultSet rs=stmt.executeQuery();  
            while(rs.next()){  
            	Etudiant etd = new Etudiant(rs.getInt(1) ,rs.getString(2), rs.getString(3), rs.getString(4) , rs.getString(5), rs.getString(6) , getFiliereById(rs.getInt(7)));
                etudiant.add(etd);
            }  
            con.close();
            System.out.println("All records selected");
            return etudiant;  
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
	
	


    public boolean updateEtudiant(int id,String CNE ,String nom, String prenom, String email, 
    String niveau , String filiere) {
    try{  
        Connection con=Connexion.ConnectDB();
        PreparedStatement stmt=con.prepareStatement("update Etudiant set CNE=?,nom_etudiant=?,prenom_etudiant=?,Email_etudiant=?,Niveau_etudiant=?,id_filiere=? where id_etudiant=?");  
        stmt.setString(1,CNE);
        stmt.setString(2, nom);
        stmt.setString(3,prenom);
        stmt.setString(4,email);
        stmt.setString(5,niveau);
        stmt.setInt(6,getFiliereByNom(filiere));
        stmt.setInt(7,id); 
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

public String getnomById(int id) {
    try {
        Connection con = Connexion.ConnectDB();
        PreparedStatement stmt = con.prepareStatement("select * from Etudiant where id_etudiant=?");
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            String nom = rs.getString("nom_etudiant");
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
        PreparedStatement stmt = con.prepareStatement("select * from Etudiant where nom_etudiant=?");
        stmt.setString(1, nom);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            int id = rs.getInt("id_etudiant");
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
public boolean isExisteByID(int id) {
    try {
        Connection con = Connexion.ConnectDB();
        PreparedStatement stmt = con.prepareStatement("select * from Etudiant where id_etudiant=?");
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
public boolean isExisteByNomAndPrenom(String nom , String prenom){
    try {
        Connection con = Connexion.ConnectDB();
        PreparedStatement stmt = con.prepareStatement("select * from Etudiant where nom_etudiant=? and prenom_etudiant=?");
        stmt.setString(1, nom);
        stmt.setString(2, prenom);
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

public int getEtudiantIdByCNE(String cne) {
    int etudiantId = -1;
    try {
        Connection con = Connexion.ConnectDB();
        PreparedStatement pstmt = con.prepareStatement("SELECT id_etudiant FROM Etudiant WHERE cne = ?");
        pstmt.setString(1, cne);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            etudiantId = rs.getInt("id_etudiant");
        }
        rs.close();
        pstmt.close();
    } catch (SQLException ex) {
        System.out.println("Erreur lors de la récupération de l'ID de l'étudiant : " + ex.getMessage());
    }
    return etudiantId;
}

}

