#include <stdio.h>

int main(){

    int i, j, c=7;

    for(i=1; i < 10; i+=2){
        for(j = 0; j < 3; j++){
            printf("I=%d J=%d\n", i, c);
            c--;
        }
        c += 5;
    }

    return 0;
}