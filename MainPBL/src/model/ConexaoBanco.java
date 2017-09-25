
package model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class ConexaoBanco {
    
    

    public java.sql.Connection getConnection() {
        try {
	    	Class.forName("com.mysql.jdbc.Driver");
	         return (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pbl4", "root", "");
	     } catch (Exception e) {
	         throw new RuntimeException(e);
	     }
    }
}
