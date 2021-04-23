import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        float percent;
        float nSal;
        float sal = scanf.nextFloat();

        if(sal <= 400){
            nSal = (float) (sal + (sal*0.15));
        }else
        if(sal <= 800){
            nSal = (float) (sal + (sal*0.12));
        }else
        if(sal <= 1200){
            nSal = (float) (sal + (sal*0.10));
        }else
        if(sal <= 2000){
            nSal = (float) (sal + (sal*0.07));
        }else{
            nSal = (float) (sal + (sal*0.04));
        }
        
        percent = (float) ((nSal - sal) / sal * 100);
        
        System.out.printf("Novo salario: %.2f\n", nSal);
        System.out.printf("Reajuste ganho: %.2f\n", nSal - sal);
        System.out.printf("Em percentual: %d %%\n", Math.round(percent));

    }
}