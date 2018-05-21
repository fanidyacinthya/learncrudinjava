/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoneCpExample {
     public static void main(String[] args) throws PropertyVetoException, SQLException, IOException, ClassNotFoundException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            // fetch a connection
            connection = KoneksiBonecp.getInstance().getConnection();

            if (connection != null) {
                statement = connection.createStatement();
                resultSet = statement.executeQuery("select * from latihan");
                while (resultSet.next()) {
                    System.out.println("id: " + resultSet.getString("id"));
                    System.out.println("nama: " + resultSet.getString("nama"));
                    System.out.println("telepon: " + resultSet.getString("telepon"));
                    System.out.println("alamat: " + resultSet.getString("alamat"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) try { resultSet.close(); } catch (SQLException e) {e.printStackTrace();}
            if (statement != null) try { statement.close(); } catch (SQLException e) {e.printStackTrace();}
            if (connection != null) try { connection.close(); } catch (SQLException e) {e.printStackTrace();}
        }
    }
}
