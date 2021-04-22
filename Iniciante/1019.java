import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int sec, min, hora;
        int n = scanf.nextInt();

        hora = n / 3600;
        n -= hora * 3600;
	    min = n / 60;
	    n -= min * 60;
	    sec = n;

        System.out.printf("%d:%d:%d\n", hora, min, sec);
    }
    
}