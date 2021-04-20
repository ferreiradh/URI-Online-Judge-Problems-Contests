import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner scanf = new Scanner(System.in);      
        
        double a = scanf.nextFloat();
        double b = scanf.nextFloat();
        double c = scanf.nextFloat();
        double media = ((a * 2) + (b * 3) + (c * 5)) / 10;        

        System.out.printf("MEDIA = %.1f\n", media);
 
    }
 
}
