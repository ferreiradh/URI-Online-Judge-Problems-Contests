import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner scanf = new Scanner(System.in);      
        
        String nome = scanf.nextLine();
        double salarioFixo = scanf.nextDouble();
        double vendas = scanf.nextDouble();
        double total = salarioFixo + (vendas * 0.15);       

        System.out.printf("TOTAL = R$ %.2f\n", total);
 
    }
 
}
