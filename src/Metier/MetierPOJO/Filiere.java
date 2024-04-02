package Metier.MetierPOJO;

public class Filiere {
	
	private int id_filiere;
	private String nom_filiere;
	private String departement;
	private String coordinateur;
	
	//constructeur
	public Filiere(int id_filiere, String nom_filiere, String departement, String coordinateur) {
		super();
		this.id_filiere = id_filiere;
		this.nom_filiere = nom_filiere;
		this.departement = departement;
		this.coordinateur = coordinateur;
	}

	public Filiere() {
    }

    public String getNom_filiere() {
		return nom_filiere;
	}

	public void setNom_filiere(String nom_filiere) {
		this.nom_filiere = nom_filiere;
	}

	public int getId_filiere() {
		return id_filiere;
	}

	public void setId_filiere(int id_filiere) {
		this.id_filiere = id_filiere;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getCoordinateur() {
		return coordinateur;
	}

	public void setCoordinateur(String coordinateur) {
		this.coordinateur = coordinateur;
	}
	
	//to string
	@Override
	public String toString() {
		return "Filiere [id_filiere=" + id_filiere + ", nom_filiere=" + nom_filiere + ", Departement=" + departement
				+ ", coordinateur=" + coordinateur + "]";
	}
}
