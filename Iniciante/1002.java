import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner scanf = new Scanner(System.in);      
        
        double n = 3.14159d;
        double raio = scanf.nextDouble();
        double area = n * (raio * raio);        

        System.out.printf("A=%.4f\n", area);
 
    }
 
}
