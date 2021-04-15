import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner scanf = new Scanner(System.in);
        int a = scanf.nextInt();
        int b = scanf.nextInt();
        int c = scanf.nextInt();
        int d = scanf.nextInt();
        int diferenca = a * b - c * d;
        System.out.printf("DIFERENCA = %d\n", diferenca);
 
    }
 
}
