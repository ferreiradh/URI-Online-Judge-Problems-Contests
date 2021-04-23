import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int contN=0;

        for(int i=0; i < 5; i++){
            int n = scanf.nextInt();
            if(n % 2 == 0){
                contN++;
            }
        }
            System.out.printf("%d valores pares\n", contN);
    }
}