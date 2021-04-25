public class Main {

    public static void main(String[] args) {

        int I=1, J=60;

        System.out.printf("I=%d J=%d\n", I, J);

        for(int i=0; i < 12; i++){
            I = I + 3;
            J = J - 5;
            System.out.printf("I=%d J=%d\n", I, J);
        }
    }
}