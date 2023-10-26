/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo2;

/**
 *
 * @author labtecweb06
 */
public class Externa{
    String s="mio";
    
    public void proceso(){
        int p=6;
        class Interna{
            public void imprime(){
            
                System.out.println("Objeto interno "+s);

                //p++;
            }
        
        }
        
        Interna in=new Interna();
            in.imprime();
    }
    
    
}


class Principal{

    public static void main(String[] args) {
        Externa ex = new Externa();
        ex.proceso();
    }
}


