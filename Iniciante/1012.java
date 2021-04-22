import java.util.Scanner;

public class Main {
 
    public static void main(String[] args){
 
        Scanner scanf = new Scanner(System.in);

        float triangulo, circulo, trapezio, quadrado, retangulo;
        float a = scanf.nextFloat();
        float b = scanf.nextFloat();
        float c = scanf.nextFloat();

    triangulo = (float) (a * c / 2.0);
    circulo = (float) (3.14159 * (c * c));
    trapezio = (float) (((a + b) * c) / 2.0);
    quadrado = (float) b * b;
    retangulo = (float) a * b;

    System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", triangulo, circulo, trapezio, quadrado, retangulo);
 
    }
 
}