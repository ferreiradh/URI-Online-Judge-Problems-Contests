import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int cont=0;
        
        for(int i = 0; i < 6; i++){
            float n = scanf.nextFloat();
            if(n > 0) cont++;
        }

        System.out.printf("%d valores positivos\n", cont);

    }
}