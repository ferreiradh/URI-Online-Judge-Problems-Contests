#include <stdio.h>
#include <math.h>

int main(){

    float sal, nSal, percent;

    scanf("%f", &sal);

    if(sal <= 400){
        nSal = sal + (sal*0.15);
    }else
    if(sal <= 800){
        nSal = sal + (sal*0.12);
    }else
    if(sal <= 1200){
        nSal = sal + (sal*0.10);
    }else
    if(sal <= 2000){
        nSal = sal + (sal*0.07);
    }else{
        nSal = sal + (sal*0.04);
    }
    
    percent = (nSal - sal) / sal * 100;
    
    printf("Novo salario: %.2f\n", nSal);
    printf("Reajuste ganho: %.2f\n", nSal - sal);
    printf("Em percentual: %.0f %%\n", round(percent));

    return 0;

}
