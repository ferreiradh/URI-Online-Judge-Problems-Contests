import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        
        int X = scanf.nextInt();
        int aux = X;
        X = X - (aux-1);

        for(int i=0; i < aux; i++){      
            if(X % 2 != 0) System.out.println(X);
            X++;
        }
    }
}