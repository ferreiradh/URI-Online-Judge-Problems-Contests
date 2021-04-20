#include <stdio.h>

int main(){

float sal, sal2, sal3;

    scanf("%f", &sal);

    if(sal <= 2000){
        printf("Isento\n");

    }else
    if(sal <= 3000){
        sal = sal - 2000;
        sal = sal * 0.08;
        printf("R$ %.2f\n", sal);

    }else
    if(sal <= 4500){
        sal2 = sal - 3000;
        sal = sal - 2000;
        sal = sal - sal2;
        sal = sal * 0.08;
        sal2 = sal2 * 0.18;

        printf("R$ %.2f\n", sal+sal2);

    }else{
        sal3 = sal - 4500;
        sal2 = sal - 3000;
        sal2 = sal2 - sal3;
        sal = sal - 2000;
        sal = (sal - sal2) - sal3;
        sal = sal * 0.08;
        sal2 = sal2 * 0.18;
        sal3 = sal3 * 0.28;

        printf("R$ %.2f\n", sal+sal2+sal3);
    }


    return 0;

}
