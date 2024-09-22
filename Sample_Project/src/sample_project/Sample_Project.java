/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sample_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;

public class Sample_Project {
    
    private static final String dbuserName = "root";
    private static final String password = "";
    private static final String baseUrl = "jdbc:mysql://localhost:3306/sample_project";
    
    private Connection config = null;
    private PreparedStatement pst = null;
    private ResultSet result = null;
    private int number1;
    
    public static void main(String[] args) {
       
        Sample_Project db_config = new Sample_Project();
        db_config.db_Config();
         
    }
    
    public void db_Config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            config = DriverManager.getConnection(baseUrl, dbuserName, password);
            pst = config.prepareStatement("select * from users");
            result = pst.executeQuery();
            ResultSetMetaData setData = result.getMetaData();
            number1 = setData.getColumnCount();
            Login_Frame login = new Login_Frame();
            login.setVisible(true);
        
        } catch (Exception ex){
            Network_Erorr Erorr = new Network_Erorr();
            Erorr.setVisible(true);
        }
        
    }
}
