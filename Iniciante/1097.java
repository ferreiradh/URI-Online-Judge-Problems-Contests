public class Main {

    public static void main(String[] args) {

        int c=7;

        for(int i=1; i < 10; i+=2){
            for(int j = 0; j < 3; j++){
                System.out.printf("I=%d J=%d\n", i, c);
                c--;
            }
            c += 5;
        }        
    }
}