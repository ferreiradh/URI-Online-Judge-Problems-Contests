#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){

    double a, b, c, x1, x2, delta;

    scanf("%lf %lf %lf", &a, &b, &c);

    if((a == 0) | (b * b - 4 * a * c < 0)){
        printf("Impossivel calcular\n");
    } else{

    delta = b*b - 4*a*c;
    x1 = (-b + sqrt(delta)) / (2*a);
    x2 = (-b - sqrt(delta)) / (2*a);    

    printf("R1 = %0.5lf\n", x1);
    printf("R2 = %0.5lf\n", x2);
    }

    return 0;

}