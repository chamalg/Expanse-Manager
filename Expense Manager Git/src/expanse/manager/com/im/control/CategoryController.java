/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expanse.manager.com.im.control;

import expanse.manager.model.Category;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Chamal Gunasinghe
 */
public class CategoryController {
    
    public static boolean create(Category category){
        try {
            String query = "INSERT INTO category(name) VALUES('"+category.getName()+"')";
            String url = "jdbc:mysql://localhost:3306/dbexpense";
            String un = "root";
            String pw = "12345";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection(url,un,pw);
            Statement statement = c.createStatement();
            statement.executeUpdate(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static Category retrive(int id){
        Category category = new Category();
        try {
            String query = "SELECT * FROM category WHERE id = '"+id+"'";
            String url = "jdbc:mysql://localhost:3306/dbexpense";
            String un = "root";
            String pw = "12345";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection(url,un,pw);
            Statement statement = c.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if(rs.next()){
               String name = rs.getString("name");
               category.setName(name);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return category;
    }
}
