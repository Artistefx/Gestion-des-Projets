package Metier.MetierPOJO;

import java.util.Date;


public class Etape {
	
	private int ID;
	private String Projet;
	private int Duree;
	private Date Date;
	private String Validite;

	//constructeur
	


    public Etape(int int1, String int2, int int3, java.sql.Date date) {
		// TODO Auto-generated constructor stub
		this.ID = int1;
		this.Projet = int2;
		this.Duree = int3;
		this.Date = date;
	}

	public Etape(int int1, String int2, int int3, java.sql.Date date, String string) {
		// TODO Auto-generated constructor stub
		this.ID = int1;
		this.Projet = int2;
		this.Duree = int3;
		this.Date = date;
		this.Validite = string;
	}

    public int getId() {
		return ID;
	}
	public void setId(int id_etape) {
		this.ID = id_etape;
	}
	public int getDuree() {
		return Duree;
	}
	public void setDuree(int duree) {
		this.Duree = duree;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date_depart) {
		this.Date = date_depart;
	}
	public String getProjet() {
		return Projet;
	}
	public void setProjet(String num_projet) {
		this.Projet = num_projet;
	}
	public String getValidite() {
		return Validite;
	}
	public void setValidite(String validite) {
		this.Validite = validite;
	}
	
	
	
	

	//to string
	@Override
	public String toString() {
		return "Etape [id_etape=" + ID +", numero de projet"+ Projet +", duree=" + Duree + ", date_depart=" + Date + "]";
	}
	
}
