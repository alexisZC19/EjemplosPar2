/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eXCEPTION2;

/**
 *
 * @author labtecweb06
 */
public class Test {
    public static void main(String[] args) {
        int x=0;
        CMiClase obj= new CMiClase();
        try{
            obj.m(x);
        }
        catch(EvalorNoValido e){
        
            System.out.println(e.getMessage());
        }
        System.out.println("Continua la ejecucion");
    }
    
}
