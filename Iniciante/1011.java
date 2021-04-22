import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        
        double raio, volume, pi = 3.14159;

        raio = scanf.nextDouble();
        volume = (4.0 / 3) * pi * (raio*raio*raio);
        System.out.printf("VOLUME = %.3f\n", volume);

        
    }
    
}