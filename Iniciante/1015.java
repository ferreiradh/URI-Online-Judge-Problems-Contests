import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        float distancia;

        float x1 = scanf.nextFloat();
        float y1 = scanf.nextFloat();
        float x2 = scanf.nextFloat();
        float y2 = scanf.nextFloat();

        distancia = (float) Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));

        System.out.printf("%.4f\n", distancia);
    }
    
}