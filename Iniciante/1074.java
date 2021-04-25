import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        
        int i, valor;
        int n = scanf.nextInt();

        for(i=0; i < n; i++){
            valor = scanf.nextInt();

            if(valor > 0){
                if(valor % 2 == 0) System.out.println("EVEN POSITIVE");
                else System.out.println("ODD POSITIVE");

            }else if(valor < 0){
                if(valor % 2 == 0) System.out.println("EVEN NEGATIVE");
                else System.out.println("ODD NEGATIVE");

            }else System.out.println("NULL");
        }
    }
}