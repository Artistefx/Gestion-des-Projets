package Metier.MetierPOJO;

public class Entreprise {
	
	private String raison_sociale;
	private String adresse;
	private String telephone;
	private String email;
	private String nom_Responsable;

	//constructeur
	public Entreprise(String raison_sociale, String adresse, String telephone, String email, String nom_Responsable) {
		super();
		this.raison_sociale = raison_sociale;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.nom_Responsable = nom_Responsable;
	}

    public Entreprise() {
    }

    public String getRaison_sociale() {
		return raison_sociale;
	}
	public void setRaison_sociale(String raison_sociale) {
		this.raison_sociale = raison_sociale;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String string) {
		this.telephone = string;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNom_Responsable() {
		return nom_Responsable;
	}
	public void setNom_Responsable(String nom_Responsable) {
		this.nom_Responsable = nom_Responsable;
	}
	//toString
	@Override
	public String toString() {
		return "Entreprise [raison_sociale=" + raison_sociale + ", adresse=" + adresse + ", telephone=" + telephone
				+ ", email=" + email + ", nom_Responsable=" + nom_Responsable + "]";
	}
	
	
	 
}
