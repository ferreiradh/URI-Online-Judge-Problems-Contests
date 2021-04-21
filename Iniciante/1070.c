#include <stdio.h>
 
int main() {

    int X, i=0;

    scanf("%d", &X);
    if(X % 2 != 0) {
        printf("%d\n", X);
        i++;
    }

    while(i < 6){   
        X++;   
        if(X % 2 != 0){ 
            printf("%d\n", X);
            i++;
        } 
    }

    return 0;
}