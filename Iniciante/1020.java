import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int idadeD = scanf.nextInt();

        System.out.printf("%d ano(s)\n", idadeD / 365); idadeD = idadeD % 365;
        System.out.printf("%d mes(es)\n", idadeD / 30); idadeD = idadeD % 30;
        System.out.printf("%d dia(s)\n", idadeD);
    }
    
}