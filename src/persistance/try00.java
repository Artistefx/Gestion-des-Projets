package persistance;



import Metier.MetierPOJO.Rendez_vous;

public class try00 {

	    public static void main(String[] args) {
			
			DAORendez_vous daoRendez_vous = new DAORendez_vous();
			for (Rendez_vous r : daoRendez_vous.getAllRendez_vousByProf("chef")) {
				System.out.println(r.toString());
			}

	}
}

