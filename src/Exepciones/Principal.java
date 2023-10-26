
package Exepciones;


public class Principal extends Exepciones{
    int Resultado;
    public Principal() {
    }

    public Principal(int num1, int num2) {
        super(num1, num2);
    }
    

    @Override
    int calcularProducto() {
        return (num1/num2);
    }
    
    
    
}
