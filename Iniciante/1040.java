import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("0.0");

        double n1 = scanf.nextDouble();
        double n2 = scanf.nextDouble();
        double n3 = scanf.nextDouble();
        double n4 = scanf.nextDouble();

        double media = ((n1*2) + (n2*3) + (n3*4) + (n4*1)) / 10;

        System.out.println("Media: " + dF.format(media));

        if(media >= 7.0){

            System.out.println("Aluno aprovado.");
        }else
        if(media >= 5.0){

            System.out.println("Aluno em exame.");
            double notaExam = scanf.nextDouble();
            System.out.println("Nota do exame: " + dF.format(notaExam));
            media = (media + notaExam) / 2;

            if(media >= 5.0){

                System.out.println("Aluno aprovado.");

            }else System.out.println("Aluno reprovado.");

            System.out.println("Media final: " + dF.format(media));


        }else
            System.out.println("Aluno reprovado.");       
    }
}