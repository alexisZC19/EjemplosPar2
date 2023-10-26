/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author labtecweb06
 */
public class Externa{

    Operaciones op=new Operaciones(){

        //Definicion de la clase anónima
        public void imprimir(){
            System.out.println("Impresion Anonima");
        }
    };  // la linea de definición y creación ;

    void proceso(){// llamada al metodo imprimir de la clase anonima
        op.imprimir();
    }
}