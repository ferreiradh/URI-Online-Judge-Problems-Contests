import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner scanf = new Scanner(System.in);      
        


        int cod1 = scanf.nextInt();
        int n1 = scanf.nextInt();
        float valor1 = scanf.nextFloat();
        int cod2 = scanf.nextInt();
        int n2 = scanf.nextInt();
        float valor2 = scanf.nextFloat();
        
        float total = (n1 * valor1) + (n2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
 
    }
 
}
