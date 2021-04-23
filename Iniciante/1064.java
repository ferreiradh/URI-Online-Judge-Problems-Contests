import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int nPos=0;
        float somaN=0;

        for(int i=0; i < 6; i++){
            float n = scanf.nextFloat();
            if(n > 0){
                somaN = somaN + n;
                nPos++;
            }
        }
            System.out.printf("%d valores positivos\n", nPos);
            System.out.printf("%.1f\n", somaN / nPos);
    }
}