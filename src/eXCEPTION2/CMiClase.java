/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eXCEPTION2;

/**
 *
 * @author labtecweb06
 */
public class CMiClase {
    
    public void m(int a) throws EvalorNoValido{
    
        if(a==0){
            throw new EvalorNoValido("Error: valor cero");
        }
    }
    
}
