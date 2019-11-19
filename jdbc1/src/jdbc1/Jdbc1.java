/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc1;
import java.sql.*;
/**
 *
 * @author User
 */
public class Jdbc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dbURL = "jdbc:mySQL://localhost:3306/chealife";
        String user = "root";
        String pass = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(dbURL,user,pass);
            
            Statement st = con.createStatement();
            
            st.execute("insert into gf(id,name)value(\"30\",\"Motodub\")");
            
            ResultSet rs = st.executeQuery("select * from gf");
            
            while(rs.next()){
                String id = rs.getString("id");
                String name = rs.getString("name");
                System.out.println(name+" date: "+id);
            }
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
    
}
