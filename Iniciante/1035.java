import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int a = scanf.nextInt();
        int b = scanf.nextInt();
        int c = scanf.nextInt();
        int d = scanf.nextInt();

        if(b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && a%2 == 0){
            System.out.printf("Valores aceitos\n");

        }else System.out.printf("Valores nao aceitos\n");

    }
}