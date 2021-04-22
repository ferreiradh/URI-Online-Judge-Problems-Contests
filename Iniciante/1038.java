import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int cod = scanf.nextInt();
        int qtd = scanf.nextInt();
        float total=0;

        if(cod == 1){

            total = (float) (qtd * 4.00);
        }else
        if(cod == 2){
    
            total = (float) (qtd * 4.50);
        }else
        if(cod == 3){
    
            total = (float) (qtd * 5.00);
        }else
        if(cod == 4){
    
            total = (float) (qtd * 2.00);
        }else
        if(cod == 5){
    
            total = (float) (qtd * 1.5);
        }
    
        System.out.printf("Total: R$ %.2f\n", total);

    }
}