/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asserciones;

/**
 *
 * @author labtecweb06
 */
public class Main {
    
    static void procesa(int num){
    
        assert(num>0):num+"no es positivo";
    }
    
    
    public static void main(String[] args) {
        int x = -4;
        procesa(x);
        System.out.println("Hola si funciono");
    }
}
