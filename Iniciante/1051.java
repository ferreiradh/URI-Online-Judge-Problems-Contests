import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        float sal = scanf.nextFloat();

        if(sal <= 2000) System.out.println("Isento");

        else if(sal <= 3000) System.out.printf("R$ %.2f\n", (sal - 2000) * 0.08);

        else if(sal <= 4500) System.out.printf("R$ %.2f\n", ((sal - 3000) * 0.18) + 80);

        else System.out.printf("R$ %.2f\n", ((sal - 4500) * 0.28) + 350);

    }
}