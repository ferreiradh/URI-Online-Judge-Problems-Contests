#include <stdio.h>
 
int main() {

    int X, i, aux;

    scanf("%d", &X);
    aux = X;
    X = X - (aux-1);

    for(i=0; i < aux; i++){      
        if(X % 2 != 0) printf("%d\n", X);
        X++;
    }

    return 0;
}