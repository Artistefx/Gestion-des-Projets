package Metier.MetierPOJO;

import java.sql.Date;

public class Rendez_vous {

    private int id;
    private Date date;
    private String lieu;
    private String projet;
    private String document;

    public Rendez_vous() {
    }

    public Rendez_vous(int id, Date date, String lieu, String id_projet, String id_doc) {
        this.id = id;
        this.date = date;
        this.lieu = lieu;
        this.projet = id_projet;
        this.document = id_doc;
    }

    public Rendez_vous(Date date, String lieu, String id_projet) {
        this.date = date;
        this.lieu = lieu;
        this.projet = id_projet;
    }

    public Rendez_vous(Date date, String lieu, String id_projet, String id_doc) {
        this.date = date;
        this.lieu = lieu;
        this.projet = id_projet;
        this.document = id_doc;
    }

    //Getters

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getLieu() {
        return lieu;
    }

    public String getProjet() {
        return projet;
    }

    public String getDocument() {
        return document;
    }

    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setprojet(String projet) {
        this.projet = projet;
    }

    public void setdocument(String id_doc) {
        this.document = id_doc;
    }

    @Override
    public String toString() {
        return "Rendez_vous{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", lieu='" + lieu + '\'' +
                ", projet=" + projet +
                ", rapport=" + document +
                '}';
    }



    
}
