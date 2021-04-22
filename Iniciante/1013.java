import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int valor1 = scanf.nextInt();
        int valor2 = scanf.nextInt();
        int valor3 = scanf.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.printf("%d eh o maior\n", valor1);
        } else if (valor2 > valor3) {
            System.out.printf("%d eh o maior\n", valor2);
        } else {
            System.out.printf("%d eh o maior\n", valor3);
        }
    }
    
}