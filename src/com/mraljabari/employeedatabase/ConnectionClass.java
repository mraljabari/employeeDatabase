/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mraljabari.employeedatabase;

//import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author M RIZKI AL
 */
public class ConnectionClass {
    private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/employeedatabase";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
            
        } catch (SQLException e) {
            System.out.println("Connection to Databases Failed " + e.getMessage());
        }
        return MySQLConfig;
    }
    
}
