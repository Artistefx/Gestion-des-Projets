package persistance;

import java.sql.*;


import Metier.MetierPOJO.User;

public class DAOUser {
    public String LogIn (User user1) {
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("select type from User where username=? and password=?");   
            stmt.setString(1, user1.getUserName());
            stmt.setString(2, user1.getPassWord());
            ResultSet rs=stmt.executeQuery(); 
            if(rs.next()){  
                String type = rs.getString(1);  
                return type;
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        return null;
    }
}
