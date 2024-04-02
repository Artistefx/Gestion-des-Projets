package Metier.MetierPOJO;

import java.util.ArrayList;

public class Laboratoire {
	private int id_laboratoire; 
	private String nom_labo;
	private String email;
	private String responsable ;
    private ArrayList<Professeur> membresProf;
    private ArrayList<Etudiant> membresDoc;
	
	public Laboratoire(String nom_labo, String email, String responsable) {
		super();
		this.nom_labo = nom_labo;
		this.email = email;
		this.responsable = responsable;
	}
	
	public Laboratoire(int id_laboratoire, String nom_labo, String email, String responsable,
			ArrayList<Professeur> membresProf, ArrayList<Etudiant> membresDoc) {
		super();
		this.id_laboratoire = id_laboratoire;
		this.nom_labo = nom_labo;
		this.email = email;
		this.responsable = responsable;
		this.membresProf = membresProf;
		this.membresDoc = membresDoc;
	}

	public Laboratoire(int id_laboratoire, String nom_labo, String email, String responsable) {
		super();
		this.id_laboratoire = id_laboratoire;
		this.nom_labo = nom_labo;
		this.email = email;
		this.responsable = responsable;
	}
	

	public Laboratoire() {
    }

    public String getNom_labo() {
		return nom_labo;
	}
	public void setNom_labo(String nom_labo) {
		this.nom_labo = nom_labo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getId_laboratoire() {
		return id_laboratoire;
	}

	public void setId_laboratoire(int id_laboratoire) {
		this.id_laboratoire = id_laboratoire;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	

	public ArrayList<Professeur> getMembresProf() {
		return membresProf;
	}

	public void setMembresProf(ArrayList<Professeur> membresProf) {
		this.membresProf = membresProf;
	}

	public ArrayList<Etudiant> getMembresDoc() {
		return membresDoc;
	}

	public void setMembresDoc(ArrayList<Etudiant> membresDoc) {
		this.membresDoc = membresDoc;
	}

	@Override
	public String toString() {
		return "Laboratoire [id_laboratoire=" + id_laboratoire + ", nom_labo=" + nom_labo + ", email=" + email
				+ ", responsable=" + responsable + "]";
	}
	
	
	
}
