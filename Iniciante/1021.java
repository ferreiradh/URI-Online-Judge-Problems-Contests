import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        double n = scanf.nextDouble();

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", (int) n / 100); n -= ((long) n/100) * 100;
        System.out.printf("%d nota(s) de R$ 50.00\n", (int) n / 50); n -= ((long) n/50) * 50;
        System.out.printf("%d nota(s) de R$ 20.00\n", (int) n / 20); n -= ((long) n/20) * 20;
        System.out.printf("%d nota(s) de R$ 10.00\n", (int) n / 10); n -= ((long) n/10) * 10;
        System.out.printf("%d nota(s) de R$ 5.00\n", (int) n / 5); n -= ((long) n/5) * 5;
        System.out.printf("%d nota(s) de R$ 2.00\n", (int) n / 2); n -= ((long) n/2) * 2;

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", (int) n); n -= ((long) n/1) * 1;
        n = n * 100;
        System.out.printf("%d moeda(s) de R$ 0.50\n", (int) n / 50); n -= ((long) n/50) * 50;
        System.out.printf("%d moeda(s) de R$ 0.25\n", (int) n / 25); n -= ((long) n/25) * 25;
        System.out.printf("%d moeda(s) de R$ 0.10\n", (int) n / 10); n -= ((long) n/10) * 10;
        System.out.printf("%d moeda(s) de R$ 0.05\n", (int) n / 5); n -= ((long) n/5) * 5;
        System.out.printf("%d moeda(s) de R$ 0.01\n", (int) n);
        
    }
}