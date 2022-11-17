/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ulivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pqd15
 */
public class DbConnection {
    private static Connection conn;
    
    public static Connection getConnection()
    {
        try {
            if (conn == null || conn.isClosed()) {
                String user = "sa", pwd = "1111",
                        url = "jdbc:sqlserver://localhost:1433;databaseName=DUAN1";

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                conn = DriverManager.getConnection(url, user, pwd);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        return conn;
    }
    public static void main(String[] args) {
        System.out.println(getConnection().toString());
    }
}
