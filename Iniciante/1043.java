import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        float perimetro, area;
        float a = scanf.nextFloat();
        float b = scanf.nextFloat();
        float c = scanf.nextFloat();

        if((a + b > c && c > a + b - c) || (a + c > b && b > a - c) || (b + c > a && a > b - c)){

            perimetro = a + b + c;
    
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }else{
    
            area = ((a + b) / 2) * c;
            System.out.printf("Area = %.1f\n", area);
        }
    }
}