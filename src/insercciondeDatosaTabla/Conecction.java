/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insercciondeDatosaTabla;

/**
 *
 * @author labtecweb06
 */

import java.sql.*;

import javax.swing.JOptionPane;
public class Conecction {
    
    public static void main(String[] args) {
        
        String idStr = JOptionPane.showInputDialog("Ingrese el id:");
        int id = Integer.parseInt(idStr);
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        String matriculaStr = JOptionPane.showInputDialog("Ingrese la matrícula:");
        int matricula = Integer.parseInt(matriculaStr);
        String carrera = JOptionPane.showInputDialog("Ingrese la carrera:");
        try{
            Class.forName("org.postgresql.Driver");
            Connection cn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/prueba01","postgres","informatica");
            Statement s = cn.createStatement();
  
      
            String createTable= "insert into grupo506(id,nombre,matricula,carrera) VALUES ('" + id+ "',' " + nombre+ "', '" + matricula + "','" + carrera + "')";
            System.out.println(createTable);
            int rs = s.executeUpdate(createTable);
            cn.close();
        
        
                
        
      
        }catch(Exception e){
           e.getMessage();
        }
    
    }
    
    
}
