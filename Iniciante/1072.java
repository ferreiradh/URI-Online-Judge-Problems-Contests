import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        
        int in=0, out=0;
        int N = scanf.nextInt();

        for(int i = 0; i < N; i++){
        int X = scanf.nextInt();
        if(X >= 10 && X <= 20) in++;
        else out++;
        }

    System.out.printf("%d in\n", in);
    System.out.printf("%d out\n", out);
    }
}