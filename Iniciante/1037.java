import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        float n = scanf.nextFloat();

        if(n < 0 || n > 100){
            System.out.println("Fora de intervalo");

        }else
    
        if(n >= 0 && n <= 25){    
            System.out.println("Intervalo [0,25]");
    
        }else
        if(n <= 50){    
            System.out.println("Intervalo (25,50]");
    
        }else
        if(n <= 75){    
            System.out.println("Intervalo (50,75]");
    
        }else
        if(n <= 100){    
            System.out.println("Intervalo (75,100]");
        }

    }
}