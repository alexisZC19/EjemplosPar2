
package Exepciones;

public abstract class Exepciones {
    
    int num1;
    int num2;

    public Exepciones() {
    }

    
    public Exepciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    
    
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
     int calcularProducto(){
     return 0;
     };
}
