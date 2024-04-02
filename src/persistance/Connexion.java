package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import presentation.BackOffice.Controlleur.ControlleurConnexion;

public class Connexion {
    public Connexion(ControlleurConnexion controlleurConnexion) {
    }

    public static Connection ConnectDB(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
             
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projetjava","root","pass123");   
            return con ;
        }catch(SQLException e ){
            System.out.println(e);
            //JOptionPane.showMessageDialog(null, "Connexion est echouee avec BD mySQL");
            return null ;
        }
    }
    
}
