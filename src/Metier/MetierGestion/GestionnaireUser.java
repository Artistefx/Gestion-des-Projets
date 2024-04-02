package Metier.MetierGestion;

import Metier.MetierPOJO.User;
import persistance.DAOUser;

public class GestionnaireUser {
	private User user1;
    public String LogIn(String user, String pass) {
    	this.user1 = new User(user, pass);
    	DAOUser dao = new DAOUser();
        return dao.LogIn(this.user1);
    }

	}

