#include <stdio.h>

int main(){

    int I=1, J=60, i;

    printf("I=%d J=%d\n", I, J);

    for(i=0; i < 12; i++){
        I = I + 3;
        J = J - 5;
        printf("I=%d J=%d\n", I, J);
    }

    return 0;
}