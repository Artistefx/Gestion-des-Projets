package Metier.MetierPOJO;

public class Professeur {
	
	private int id_professeur;
	private String nom;
	private String prenom;
	private String email;
	private String grade;
	private String departement;

    public Professeur() {
    }
        
	public Professeur(String nom, String prenom, String email, String grade, String departement) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.grade = grade;
		this.departement = departement;
	}
	public Professeur(int id_professeur, String nom, String prenom, String email, String grade, String departement) {
		super();
		this.id_professeur = id_professeur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.grade = grade;
		this.departement = departement;
	}
	public int getId_professeur() {
		return id_professeur;
	}
	public void setId_professeur(int id_professeur) {
		this.id_professeur = id_professeur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getgrade() {
		return grade;
	}
	public void setgrade(String grade) {
		this.grade = grade;
	}

    public String getDepartement() {
        return departement;
    }



    public void setDepartement(String departement) {
        this.departement = departement;
    }
        
	//to string
	@Override
	public String toString() {
		return "Professeur [id_professeur=" + id_professeur + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", grade=" + grade + ", departement=" + departement + "]";
	}
	
	
	
}