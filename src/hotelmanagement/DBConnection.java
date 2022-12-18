package hotelmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
class DBConnection {

    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    public Connection newDBConnection()
    {Connection con=null;
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel" , "root","");
        
       
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        finally
        {
            return con;
        }
    }

    Object createConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
