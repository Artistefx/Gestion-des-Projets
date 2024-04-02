package presentation.BackOffice;

import presentation.BackOffice.Controlleur.ControlleurConnexion;

public class DemarerBackOffice {
    public static void main(String[] args) {
       /* ControlleurMenuDirectLabo controlleur = new ControlleurMenuDirectLabo();
        controlleur.demmarrerApplication();
       ControlleurProjetDoctorat controlleur = new ControlleurProjetDoctorat();
        controlleur.demarrerApplication();*/
        ControlleurConnexion controlleur = new ControlleurConnexion();
        controlleur.demmarrerApplication();
       // Connexion à la base de données
}}