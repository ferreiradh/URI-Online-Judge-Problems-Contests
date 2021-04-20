import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner scanf = new Scanner(System.in);      
        
        double a = scanf.nextFloat();
        double b = scanf.nextFloat();
        double media = ((3.5 * a) + (7.5 * b)) / 11;        

        System.out.printf("MEDIA = %.5f\n", media);
 
    }
 
}
