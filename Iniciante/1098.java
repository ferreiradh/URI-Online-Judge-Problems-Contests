import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        DecimalFormat dF = new DecimalFormat("0.0");
    
        for(double i = 0.0; i < 2.0; i+=0.2){
            for(double j = 1; j < 4; j++){
                if(dF.format(i).endsWith("0")) System.out.printf("I=%s J=%s\n", dF.format(i).substring(0, 1), dF.format(i+j).substring(0, 1));
                else System.out.printf("I=%s J=%s\n", dF.format(i), dF.format(j+i));
            }
        }     
    }
}