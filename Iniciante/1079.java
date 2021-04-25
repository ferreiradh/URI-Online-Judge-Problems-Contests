import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int n = scanf.nextInt();

        for(int i=0; i < n; i++){
            float v1 = scanf.nextFloat();
            float v2 = scanf.nextFloat();
            float v3 = scanf.nextFloat();

            System.out.printf("%.1f\n", (v1*2 + v2*3 + v3*5) / 10);
        }
    }
}