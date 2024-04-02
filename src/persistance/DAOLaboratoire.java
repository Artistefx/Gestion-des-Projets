package persistance;

import java.sql.*;
import java.util.ArrayList;

import Metier.MetierPOJO.Etudiant;
import Metier.MetierPOJO.Laboratoire;
import Metier.MetierPOJO.Professeur;


public class DAOLaboratoire {
	public int getProfesseurBynom(String nom) {
        DAOProfesseur dao = new DAOProfesseur();
        return dao.getIDByNom(nom);
    }
    public String getProfesseurById(int id) {
        DAOProfesseur dao = new DAOProfesseur();
        return dao.getnomById(id);
    }

	public boolean isExisteByID(int id_laboratoire) {
		try {
			Connection con = Connexion.ConnectDB();
			PreparedStatement stmt = con.prepareStatement("select * from Laboratoire where id_laboratoire=?");
			stmt.setInt(1, id_laboratoire);
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

	public boolean insertLaboratoire(String Nom_laboratoire,String email, String Coordonateur) {
		try {
			Connection con = Connexion.ConnectDB();
			PreparedStatement stmt = con.prepareStatement("insert into Laboratoire values(?,?,?,?)");
			stmt.setInt(1, 0);
			stmt.setString(2, Nom_laboratoire);
			stmt.setString(3, email);
			stmt.setInt(4, getProfesseurBynom(Coordonateur));
			stmt.executeUpdate();
			con.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean deleteLaboratoire(int id_laboratoire) {
		try {
			Connection con = Connexion.ConnectDB();
			PreparedStatement stmt = con.prepareStatement("delete from Laboratoire where id_laboratoire=?");
			stmt.setInt(1, id_laboratoire);
			stmt.executeUpdate();
			con.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean updateLaboratoire(int id_laboratoire, String Nom_laboratoire,String email, String Coordonateur) {
		try {
			Connection con = Connexion.ConnectDB();
			PreparedStatement stmt = con.prepareStatement("update Laboratoire set Nom_laboratoire=?,email=?,Coordonateur=? where id_laboratoire=?");
			stmt.setString(1, Nom_laboratoire);
			stmt.setString(2, email);
			stmt.setInt(3, getProfesseurBynom(Coordonateur));
			stmt.setInt(4, id_laboratoire);
			stmt.executeUpdate();
			con.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public ArrayList<Laboratoire> getAllLaboratoire() {
		try {
			Connection con = Connexion.ConnectDB();
			PreparedStatement stmt = con.prepareStatement("select * from Laboratoire");
			ResultSet rs = stmt.executeQuery();
			ArrayList<Laboratoire> list = new ArrayList<Laboratoire>();
			while (rs.next()) {
				Laboratoire l = new Laboratoire( rs.getInt(1), rs.getString(2), rs.getString(3), getProfesseurById(rs.getInt(4)));
				list.add(l);
			}
			con.close();
			return list;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public ArrayList<Etudiant> getMembresDoctorant() {
		try {
			Connection con = Connexion.ConnectDB();
			PreparedStatement stmt = con.prepareStatement("select * from Etudiant where id_doctorant in (select id_doctorant from Membre_Laboratoire_doctorants)");
			ResultSet rs = stmt.executeQuery();
			ArrayList<Etudiant> list = new ArrayList<Etudiant>();
			while (rs.next()) {
				Etudiant l = new Etudiant(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),getNomFiliereByID(rs.getInt(7)));
				list.add(l);
			}
			con.close();
			return list;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public ArrayList<Professeur> getMembresProfesseur() {
		try {
			Connection con = Connexion.ConnectDB();
			PreparedStatement stmt = con.prepareStatement("select * from Professeur where id_professeur in (select id_professeur from Membre_Laboratoire_professeurs)");
			ResultSet rs = stmt.executeQuery();
			ArrayList<Professeur> list = new ArrayList<Professeur>();
			while (rs.next()) {
				Professeur l = new Professeur(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), getnomById(rs.getInt(7)));
				list.add(l);
			}
			con.close();
			return list;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public String getnomById(int id){
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Departement where id_departement=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String nom = rs.getString("Nom_departement");
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
	public int getIDByNom(String nom) {
		try {
			Connection con = Connexion.ConnectDB();
			PreparedStatement stmt = con.prepareStatement("select * from Departement where Nom_departement=?");
			stmt.setString(1, nom);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("id_departement");
				con.close();
				return id;
			} else {
				con.close();
				return 0;
			}
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	public String getNomById(int id) {
		try {
			Connection con = Connexion.ConnectDB();
			PreparedStatement stmt = con.prepareStatement("select * from Professeur where id_professeur=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				String nom = rs.getString("Nom_professeur");
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
public ArrayList<Etudiant> getAllEtudiant(String laboratoire) {
    ArrayList<Etudiant> etd = new ArrayList<Etudiant>();
    try{  
        Connection con=Connexion.ConnectDB();
        PreparedStatement stmt=con.prepareStatement("SELECT e.* FROM Etudiant e INNER JOIN Membre_Laboratoire_doctorants m ON e.id_etudiant = m.id_membre INNER JOIN Laboratoire l ON m.id_laboratoire = l.id_laboratoire WHERE l.nom_laboratoire = ?");/*la requête SQL utilise la jointure interne pour récupérer les étudiants doctorants qui sont membres du laboratoire spécifié. Le paramètre laboratoire est utilisé pour spécifier le nom du laboratoire*/
        stmt.setString(1, laboratoire);//La méthode setString() est utilisée pour affecter la valeur du paramètre à la requête SQL.
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
public boolean ajouterMembreLaboDoctorant(int idDoctorant, int idLabo) {
    try {
        Connection con=Connexion.ConnectDB();
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO Membre_Laboratoire_doctorants (id_doctorant, id_laboratoire) VALUES (?, ?)");
        pstmt.setInt(1, idDoctorant);
        pstmt.setInt(2, idLabo);
        pstmt.executeUpdate();
        pstmt.close();
        			return true;

    } catch (SQLException ex) {
        System.out.println("Erreur lors de l'insertion dans la table Membre_Laboratoire_doctorants : " + ex.getMessage());
    }
    			return false;

}
public ArrayList<Professeur> getAllProfesseur(String laboratoire) {
    ArrayList<Professeur> etd = new ArrayList<Professeur>();
    try{  
        Connection con=Connexion.ConnectDB();
        PreparedStatement stmt=con.prepareStatement("SELECT e.* FROM Professeur e INNER JOIN Membre_Laboratoire_professeurs m ON e.Id_professeur = m.id_membre INNER JOIN Laboratoire l ON m.id_laboratoire = l.id_laboratoire WHERE l.nom_laboratoire = ?");/*la requête SQL utilise la jointure interne pour récupérer les étudiants doctorants qui sont membres du laboratoire spécifié. Le paramètre laboratoire est utilisé pour spécifier le nom du laboratoire*/
        stmt.setString(1, laboratoire);//La méthode setString() est utilisée pour affecter la valeur du paramètre à la requête SQL.
        ResultSet rs=stmt.executeQuery();  
        while(rs.next()){  
            Professeur etudiant = new Professeur(rs.getInt(1) ,rs.getString(2), rs.getString(3), rs.getString(4) , rs.getString(5),rs.getString(6));
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


}	
	
