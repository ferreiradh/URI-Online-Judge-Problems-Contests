#include <stdio.h>

int main(){

    float a, b, c, d;

    scanf("%f %f %f", &a, &b, &c);

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

        printf("NAO FORMA TRIANGULO\n");
    }else{

        if((a * a) == (b * b) + (c * c)) printf("TRIANGULO RETANGULO\n");
        if((a * a) > (b * b) + (c * c)) printf("TRIANGULO OBTUSANGULO\n");
        if((a * a) < (b * b) + (c * c)) printf("TRIANGULO ACUTANGULO\n");
        if(a == b && a == c) printf("TRIANGULO EQUILATERO\n");
        if((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) printf("TRIANGULO ISOSCELES\n");

    }

    return 0;

}
