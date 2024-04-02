package Metier.MetierPOJO;

public class Etudiant {
	
	private int id_etudiant;
	private String CNE;
	private String nom_etudiant;
	private String prenom_etudiant;
	private String email;
	private String niveau;
	private String filiere ;
	
	public Etudiant(String cNE, String nom_etudiant, String prenom_etudiant, String email, String niveau,
			String filiere) {
		super();
		CNE = cNE;
		this.nom_etudiant = nom_etudiant;
		this.prenom_etudiant = prenom_etudiant;
		this.email = email;
		this.niveau = niveau;
		this.filiere = filiere;
	}
	
	public Etudiant(int id_etudiant, String cNE, String nom_etudiant, String prenom_etudiant, String email,
			String niveau, String filiere) {
		super();
		this.id_etudiant = id_etudiant;
		CNE = cNE;
		this.nom_etudiant = nom_etudiant;
		this.prenom_etudiant = prenom_etudiant;
		this.email = email;
		this.niveau = niveau;
		this.filiere = filiere;
	}

	public Etudiant() {
    }

    public String getCNE() {
		return CNE;
	}
	public void setCNE(String cNE) {
		CNE = cNE;
	}
	public String getNom_etudiant() {
		return nom_etudiant;
	}
	public void setNom_etudiant(String nom_etudiant) {
		this.nom_etudiant = nom_etudiant;
	}
	public String getPrenom_etudiant() {
		return prenom_etudiant;
	}
	public void setPrenom_etudiant(String prenom_etudiant) {
		this.prenom_etudiant = prenom_etudiant;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
	public int getId_etudiant() {
		return id_etudiant;
	}

	public void setId_etudiant(int id_etudiant) {
		this.id_etudiant = id_etudiant;
	}

	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	@Override
	public String toString() {
		return "Etudiant [CNE=" + CNE + ", nom_etudiant=" + nom_etudiant + ", prenom_etudiant=" + prenom_etudiant
				+ ", email=" + email + ", niveau=" + niveau + ", filiere=" + filiere + "]";
	}
	
	
	
	
}
