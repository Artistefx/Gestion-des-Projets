package Metier.MetierPOJO;



public class Departement {
	private int id_departement;
	private String nom_departement;
	private String chef_département ;
	

	public Departement(int id_departement, String nom_departement, String chef_département) {
		super();
		this.id_departement = id_departement;
		this.nom_departement = nom_departement;
		this.chef_département = chef_département;
	}

	public Departement() {
    }

    public String getNom_departement() {
		return nom_departement;
	}

	public void setNom_departement(String nom_departement) {
		this.nom_departement = nom_departement;
	}

	public String getChef_département() {
		return chef_département;
	}

	public void setChef_département(String chef_département) {
		this.chef_département = chef_département;
	}

	public int getId_departement() {
		return id_departement;
	}

	public void setId_departement(int id_departement) {
		this.id_departement = id_departement;
	}

	@Override
	public String toString() {
		return "Departement [id_departement=" + id_departement + ", nom_departement=" + nom_departement
				+ ", chef_département=" + chef_département + "]";
	}
	
	
	
}
