import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        
        int N = scanf.nextInt();

        for(int i = N - (N-1); i <= N; i++){
        if(i % 2 == 0) System.out.printf("%d^2 = %d\n", i, i*i);
        }    
    }
}