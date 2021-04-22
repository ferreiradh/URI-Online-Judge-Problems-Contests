import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int minutos;
        int km = scanf.nextInt();

        minutos = (60 * km) / 30;

        System.out.printf("%d minutos\n", minutos);
    }
    
}