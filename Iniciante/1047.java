import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int somaInicial, somaFinal, dif;
        int horaInicial = scanf.nextInt();
        int minutoInicial = scanf.nextInt();
        int horaFinal = scanf.nextInt();
        int minutoFinal = scanf.nextInt();

        somaInicial = minutoInicial + (horaInicial * 60);
        somaFinal = minutoFinal + (horaFinal * 60);
    
    	if(somaInicial < somaFinal){    	
    	dif = somaFinal - somaInicial;
    	System.out.printf("O JOGO DUROU %d HORA(S) E ", dif / 60); dif = dif % 60;
    	System.out.printf("%d MINUTO(S)\n", dif);
    	
	}else if(somaInicial > somaFinal){
		dif = (1440 - somaInicial) + somaFinal;
		System.out.printf("O JOGO DUROU %d HORA(S) E ", dif / 60); dif = dif % 60;
    	System.out.printf("%d MINUTO(S)\n", dif);
    	
	}else System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
    }
}