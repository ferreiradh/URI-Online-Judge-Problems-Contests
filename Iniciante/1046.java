import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int horaInicial = scanf.nextInt();
        int horaFinal = scanf.nextInt();

        if(horaInicial < horaFinal){

            System.out.printf("O JOGO DUROU %d HORA(S)\n", horaFinal - horaInicial);
        }else{

        if(horaInicial > horaFinal){

            System.out.printf("O JOGO DUROU %d HORA(S)\n", (24 - horaInicial) + horaFinal);
        }else{

            System.out.printf("O JOGO DUROU 24 HORA(S)\n");
            }
        }
    }
}