import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        
        int somaImpar=0, i=0;

        int X = scanf.nextInt();
        int Y = scanf.nextInt();

        if(X < Y){
            for(i = X + 1; i < Y; i++){
            if(i % 2 != 0) somaImpar += i;
            }
        }else{

        if(X > Y){
            for(i = Y + 1; i < X; i++){
            if(i % 2 != 0) somaImpar += i;
            }
        }
        }    

        System.out.println(somaImpar); 
    }
}