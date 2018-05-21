/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import com.jolbox.bonecp.BoneCP;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PT DJI
 */
public class ConnectionManagerTest {
    
    public ConnectionManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of configureConnPool method, of class ConnectionManager.
     */
    @Test
    public void testConfigureConnPool() {
        System.out.println("configureConnPool");
        ConnectionManager.configureConnPool();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shutdownConnPool method, of class ConnectionManager.
     */
    @Test
    public void testShutdownConnPool() {
        System.out.println("shutdownConnPool");
        ConnectionManager.shutdownConnPool();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class ConnectionManager.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        Connection expResult = null;
        Connection result = ConnectionManager.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeStatement method, of class ConnectionManager.
     */
    @Test
    public void testCloseStatement() {
        System.out.println("closeStatement");
        Statement stmt = null;
        ConnectionManager.closeStatement(stmt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeResultSet method, of class ConnectionManager.
     */
    @Test
    public void testCloseResultSet() {
        System.out.println("closeResultSet");
        ResultSet rSet = null;
        ConnectionManager.closeResultSet(rSet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnection method, of class ConnectionManager.
     */
    @Test
    public void testCloseConnection() {
        System.out.println("closeConnection");
        Connection conn = null;
        ConnectionManager.closeConnection(conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnectionPool method, of class ConnectionManager.
     */
    @Test
    public void testGetConnectionPool() {
        System.out.println("getConnectionPool");
        BoneCP expResult = null;
        BoneCP result = ConnectionManager.getConnectionPool();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConnectionPool method, of class ConnectionManager.
     */
    @Test
    public void testSetConnectionPool() {
        System.out.println("setConnectionPool");
        BoneCP connectionPool = null;
        ConnectionManager.setConnectionPool(connectionPool);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}