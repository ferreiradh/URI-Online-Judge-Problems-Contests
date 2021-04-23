import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        
        int i=0;
        int X = scanf.nextInt();
        if(X % 2 != 0) {
        System.out.println(X);
        i++;
        }

        while(i < 6){   
            X++;   
            if(X % 2 != 0){ 
                System.out.println(X);
                i++;
            } 
        }
    }
}