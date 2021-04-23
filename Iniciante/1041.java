import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        float x = scanf.nextFloat();
        float y = scanf.nextFloat();

        if(x == 0 && y == 0){

            System.out.println("Origem");
        }else
        if(y > 0){
            
            if(x == 0) System.out.println("Eixo Y");
            else if(x > 0) System.out.println("Q1");
            else System.out.println("Q2");
    
        }else
        if(y < 0){
    
            if(x == 0) System.out.println("Eixo Y");
            else if(x > 0) System.out.println("Q4");
            else System.out.println("Q3");
        }else
        if(y == 0) System.out.println("Eixo X");

    }
}