#include <stdio.h>

int main() {

    int X, Y, i, somaImpar=0;

    scanf("%d %d", &X, &Y);

    if(X < Y){
        for(i = X + 1; i < Y; i++)
        if(i % 2 != 0) somaImpar += i;
    }else{
        if(X > Y){
        for(i = Y + 1; i < X; i++)
        if(i % 2 != 0) somaImpar += i;
        }
    }    

    printf("%d\n", somaImpar);    

    return 0;
}