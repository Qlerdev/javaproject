package login.page;
import java.sql.*;
public class DBconnection {
    Connection con = null;
    public static Connection connectionDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:loginAccountsDB.db");
            System.out.println("Connection Success");
            return con;
        }
        catch(Exception e){
            System.out.println("Connection failed "+e);
            return null;
        }
    }
}
