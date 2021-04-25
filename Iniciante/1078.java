import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int n = scanf.nextInt();

        for(int i=1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", i, n, i*n);
        }
    }
}