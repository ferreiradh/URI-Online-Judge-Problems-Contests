import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        String class1 = scanf.nextLine();
        String class2 = scanf.nextLine();
        String class3 = scanf.nextLine();

        if(class1.intern() == "vertebrado"){
            if(class2.intern() == "ave"){
                if(class3.intern() == "carnivoro"){
                    System.out.println("aguia");
                }else System.out.println("pomba");
    
            }else if(class3.intern() == "onivoro"){
                System.out.println("homem");
            }else System.out.println("vaca");
    
        }else if(class2.intern() == "inseto"){
            if(class3.intern() == "hematofago"){
                System.out.println("pulga");
            }else System.out.println("lagarta");
    
        }else if(class3.intern() == "hematofago"){
            System.out.println("sanguessuga");
        }else System.out.println("minhoca");

    }
}