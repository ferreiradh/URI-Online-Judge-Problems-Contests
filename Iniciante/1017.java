import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        float dist, lit;
        int tempo = scanf.nextInt();
        int velocidade = scanf.nextInt();

        dist = tempo * velocidade;
	    lit = dist / 12;

        System.out.printf("%.3f\n", lit);

    }
    
}