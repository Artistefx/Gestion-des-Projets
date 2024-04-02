package Metier.MetierGestion;

import java.sql.Date;
import java.util.List;

import Metier.MetierPOJO.Rendez_vous;
import persistance.DAORendez_vous;

public class GestionnaireRendez_vous {
    
    DAORendez_vous rendez_vous;

    public GestionnaireRendez_vous(DAORendez_vous rendez_vous) {
        this.rendez_vous = rendez_vous;
    }

    public GestionnaireRendez_vous() {
    }

    public boolean insertRendez_vous(Date date, String lieu, String projet) {
        this.rendez_vous = new DAORendez_vous();
        return rendez_vous.InsertRendez(date, lieu, projet);
    }

    public List<Rendez_vous> getAllRendez_vousByProf(String nom) {
        this.rendez_vous = new DAORendez_vous();
        return rendez_vous.getAllRendez_vousByProf(nom);
    }


}
