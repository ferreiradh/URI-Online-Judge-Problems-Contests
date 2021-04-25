import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        
        int n[] = new int[100], maior=0, i, pos=0;

        for(i=0; i < 100; i++){
            n[i] = scanf.nextInt();
        
            if(n[i] > maior){
                maior = n[i];
                pos = i+1;
            }
        }

        System.out.println(maior);
        System.out.println(pos);
    }
}