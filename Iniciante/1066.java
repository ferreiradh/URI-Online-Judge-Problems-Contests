import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int contPar=0, contImpar=0, contPos=0, contNeg=0;
        
        for(int i=0; i < 5; i++){
            int n = scanf.nextInt();
            if(n > 0) contPos++;
            else if(n < 0) contNeg++;
            if(n % 2 == 0){
                contPar++;
            }else contImpar++;
        }
            System.out.printf("%d valor(es) par(es)\n", contPar);
            System.out.printf("%d valor(es) impar(es)\n", contImpar);
            System.out.printf("%d valor(es) positivo(s)\n", contPos);
            System.out.printf("%d valor(es) negativo(s)\n", contNeg);
    }
}