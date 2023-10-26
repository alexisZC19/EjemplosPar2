/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultaQuery;

/**
 *
 * @author labtecweb06
 */
import java.sql.*;


public class Conecction {

    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prueba01", "postgres", "informatica");
            Statement s = cn.createStatement();

            String createTable = "select * from grupo506";
            System.out.println(createTable);
            ResultSet rs = s.executeQuery(createTable);

            if(rs!= null){
                
                while(rs.next()){
                    System.out.println("id: " +rs.getInt(1));
                    System.out.println("nombre: " +rs.getString(2));
                    System.out.println("Matricula: " +rs.getInt(3));
                    System.out.println("Carrera : " +rs.getString(4));
                    System.out.println("\n");
                
                
                }
            
            
            }

        } catch (Exception e) {
            e.getMessage();
        }

    }

}
