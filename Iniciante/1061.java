import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        String d = scanf.nextLine();
        d = d.replace("Dia ", "");
        int d1 = Integer.parseInt(d);
        String tempo1 = scanf.nextLine();
        tempo1 = tempo1.replace(" :", "");
        String[] tempo = tempo1.split(" ");

        int h1 = Integer.parseInt(tempo[0]);
        int m1 = Integer.parseInt(tempo[1]);
        int s1 = Integer.parseInt(tempo[2]);   
        
        String d3 = scanf.nextLine();
        d3 = d3.replace("Dia ", "");
        int d2 = Integer.parseInt(d3);
        String tempo2 = scanf.nextLine();
        tempo2 = tempo2.replace(" :", "");
        String[] tempo3 = tempo2.split(" ");

        int h2 = Integer.parseInt(tempo3[0]);
        int m2 = Integer.parseInt(tempo3[1]);
        int s2 = Integer.parseInt(tempo3[2]);

        int dif = (s2 + m2 * 60 + h2 * 3600 + d2 * 86400) - (s1 + m1 * 60 + h1 * 3600 + d1 * 86400);

        System.out.printf("%d dia(s)\n", dif / 86400); dif = dif % 86400;
        System.out.printf("%d hora(s)\n", dif / 3600); dif = dif % 3600;
        System.out.printf("%d minuto(s)\n", dif / 60); dif = dif % 60;
        System.out.printf("%d segundo(s)\n", dif);
    }
}