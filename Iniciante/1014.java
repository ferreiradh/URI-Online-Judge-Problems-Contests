import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int x = scanf.nextInt();
        float y = scanf.nextFloat();
        float media = (float) x / y;

        System.out.printf("%.3f km/l\n", media);
    }
    
}