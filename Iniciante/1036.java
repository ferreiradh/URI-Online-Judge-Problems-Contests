import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        double x1, x2, delta;
        double a = scanf.nextDouble();
        double b = scanf.nextDouble();
        double c = scanf.nextDouble();

        if((a == 0) | (b * b - 4 * a * c < 0)){
            System.out.printf("Impossivel calcular\n");
        } else{
    
        delta = b*b - 4*a*c;
        x1 = (-b + Math.sqrt(delta)) / (2*a);
        x2 = (-b - Math.sqrt(delta)) / (2*a);    
    
        System.out.printf("R1 = %.5f\n", x1);
        System.out.printf("R2 = %.5f\n", x2);
        }

    }
}