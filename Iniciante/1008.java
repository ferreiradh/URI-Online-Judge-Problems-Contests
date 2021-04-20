import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner scanf = new Scanner(System.in);      
        
        int funcionarios = scanf.nextInt();
        int horas = scanf.nextInt();
        float valorPorHora = scanf.nextFloat();
        float salario = horas * valorPorHora;       

        System.out.printf("NUMBER = %d\n", funcionarios);
        System.out.printf("SALARY = U$ %.2f\n", salario);
 
    }
 
}
