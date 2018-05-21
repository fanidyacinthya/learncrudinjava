/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;

public class KoneksiBonecp2 {
   public static void main(String[] args) {
	BoneCP connectionPool = null;
	Connection connection = null;

        try {
            // load the database driver (make sure this is in your classpath!)
            Class.forName("com.mysql.jdbc.Driver"); // load the DB driver
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        try {
            // setup the connection pool using BoneCP Configuration
            BoneCPConfig config = new BoneCPConfig(); // create a new configuration object
            // jdbc url specific to your database, eg jdbc:mysql://127.0.0.1/yourdb
            config.setJdbcUrl("jdbc:mysql://localhost/coba"); // set the JDBC url
            config.setUsername("root"); // set the username
            config.setPassword(""); // set the password
            config.setMinConnectionsPerPartition(5);
            config.setMaxConnectionsPerPartition(10);
            config.setPartitionCount(1);
            
           
            connectionPool = new BoneCP(config); // setup the connection pool
            
            connection = connectionPool.getConnection(); // fetch a connection
            
            
      if (connection != null){
	System.out.println("Connection successful!");
	Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT 1 FROM INFORMATION_SCHEMA.SYSTEM_USERS"); // do something with the connection.
		while(rs.next()){
			System.out.println(rs.getString(1)); // should print out "1"'
		}
	}
			connectionPool.shutdown(); // shutdown connection pool.
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
	