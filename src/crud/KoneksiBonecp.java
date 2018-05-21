/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;

public class KoneksiBonecp {

    private static KoneksiBonecp koneksibonecp;
    private BoneCP connectionPool;

    public KoneksiBonecp() throws IOException, SQLException, PropertyVetoException {
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
            config.setJdbcUrl("jdbc:mysql://localhost:3306/coba"); // set the JDBC url
            config.setUsername("root"); // set the username
            config.setPassword(""); // set the password
            config.setMinConnectionsPerPartition(5);
            config.setMaxConnectionsPerPartition(10);
            config.setPartitionCount(1);

            // setup the connection pool
            connectionPool = new BoneCP(config);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

    }

    public static KoneksiBonecp getInstance() throws IOException, SQLException, PropertyVetoException {
        if (koneksibonecp == null) {
            koneksibonecp = new KoneksiBonecp();
            return koneksibonecp;
        } else {
            return koneksibonecp;
        }
    }

    public Connection getConnection() throws SQLException {
        return this.connectionPool.getConnection();
    }
}
