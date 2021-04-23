import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int a = scanf.nextInt();
        int b = scanf.nextInt();
        int c = scanf.nextInt();

        if(a < b && a < c){
            if(b < c){
                System.out.printf("%d\n%d\n%d\n", a, b, c);
            }else System.out.printf("%d\n%d\n%d\n", a, c, b);
        }else
        if(b < a && b < c){
            if(a < c){
                System.out.printf("%d\n%d\n%d\n", b, a, c);
            }else System.out.printf("%d\n%d\n%d\n", b, c, a);
        }else
        if(c < a && c < b){
            if(a < b){
                System.out.printf("%d\n%d\n%d\n", c, a, b);
            }else System.out.printf("%d\n%d\n%d\n", c, b, a);
        }
    
        System.out.printf("\n%d\n%d\n%d\n", a, b, c);


    }
}