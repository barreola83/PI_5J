package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionManager {
    
    //Uncomment this line for remote access to database in server
    //private static final String URL = "jdbc:mysql://getacar.ddns.net:3306/PI_5J?useServerPrepStmts=true&useSSL=false&verifyServerCertificate=false";
    
    //This line is for connecto to localhost database
    private static final String URL = "jdbc:mysql://localhost/PI_5J?useServerPrepStmts=true&verifyServerCertificate=true";
     
    private static final String USERNAME = "root";   
    private static final String PASSWORD = "root"; //root for localhost //4688 for remote
    private static Connection con;

    public static Connection getConnection() {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            try {
                con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
