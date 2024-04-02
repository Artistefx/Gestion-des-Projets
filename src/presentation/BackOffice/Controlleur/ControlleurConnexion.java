package presentation.BackOffice.Controlleur;

import javax.swing.JOptionPane;


import Metier.MetierGestion.GestionnaireUser;
import presentation.BackOffice.Vues.Connexion;



public class ControlleurConnexion {
	private Connexion con;
	
	public void demmarrerApplication() {
		this.con = new Connexion(this);
		this.con.setVisible(true);
	}
	
	public void HandleLogIn(String user,String pass) {
		try {
			GestionnaireUser gestionnaire = new GestionnaireUser();
			String type = gestionnaire.LogIn(user, pass);
			if (type.equals("Super User")) {
				System.out.println("admin");
				this.con.dispose();
				ControlleurMenuAdmin controlleur = new ControlleurMenuAdmin();
				controlleur.demmarrerApplication();
			}
			else if (type.equals("chef")) {
				System.out.println("chef");
				this.con.dispose();
				ControlleurMenuChef controlleur = new ControlleurMenuChef();
				controlleur.demmarrerApplication();
			}
			else if(type.equals("coordinateur")) {
				System.out.println("coordinateur");
				this.con.dispose();
				ControlleurMenuCoordinateur controlleur = new ControlleurMenuCoordinateur();
				controlleur.demmarrerApplication();
			}
			else if(type.equals("directeur")) {
				System.out.println("directeur");
				this.con.dispose();
				ControlleurMenuDirectLabo controlleur = new ControlleurMenuDirectLabo();
				controlleur.demmarrerApplication();
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Erreur de connexion");
		}
		
	}
}

