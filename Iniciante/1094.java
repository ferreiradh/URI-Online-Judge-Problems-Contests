import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        
        int totalC=0, totalR=0, totalS=0;        
        int n = scanf.nextInt();

    for(int i=0; i < n; i++){
        int qtd = scanf.nextInt();
        char type = scanf.next().charAt(0);
        switch(type){
            case 'C': totalC = totalC + qtd; break;
            case 'R': totalR = totalR + qtd; break;
            case 'S': totalS = totalS + qtd; break;
        }
    }
    
    System.out.printf("Total: %d cobaias\n", totalC + totalR + totalS);
    System.out.printf("Total de coelhos: %d\n", totalC);
    System.out.printf("Total de ratos: %d\n", totalR);
    System.out.printf("Total de sapos: %d\n", totalS);
    System.out.printf("Percentual de coelhos: %.2f %%\n", totalC*100.0 / (totalC+totalR+totalS));
    System.out.printf("Percentual de ratos: %.2f %%\n", totalR*100.0 / (totalC+totalR+totalS));
    System.out.printf("Percentual de sapos: %.2f %%\n", totalS*100.0 / (totalC+totalR+totalS));
    }
}