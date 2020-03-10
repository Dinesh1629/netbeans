/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Dinesh.V
 */
class MysqlConnect {

    static Connection connectDB;
    Connection conn=null;
    public static Connection connectDB(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/login","root","dinesh1629");
        JOptionPane.showMessageDialog(null,"connected to database");
        return conn;
        
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}
    
}
