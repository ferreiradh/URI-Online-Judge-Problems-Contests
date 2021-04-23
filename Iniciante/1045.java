import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        float a = scanf.nextFloat();
        float b = scanf.nextFloat();
        float c = scanf.nextFloat();
        float d;

        if(b > a && b > c){

            d = a;
            a = b;
            b = d;
        }else
        if(c > a){
    
            d = a;
            a = c;
            c = d;
        }
    
        if(a >= (b+c)){
    
            System.out.println("NAO FORMA TRIANGULO");
        }else{
    
            if((a * a) == (b * b) + (c * c)) System.out.println("TRIANGULO RETANGULO");
            if((a * a) > (b * b) + (c * c)) System.out.println("TRIANGULO OBTUSANGULO");
            if((a * a) < (b * b) + (c * c)) System.out.println("TRIANGULO ACUTANGULO");
            if(a == b && a == c) System.out.println("TRIANGULO EQUILATERO");
            if((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) System.out.println("TRIANGULO ISOSCELES");    
        }
    }
}