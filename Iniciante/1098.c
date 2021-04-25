#include <stdio.h>

int main(){

    int iInt;
    float i=0.0, j=1;

    for(i=0.0; i < 2.2; i+=0.2){
        iInt = i*10;
        for(j = 1; j < 4; j++){
            if(iInt % 10 == 0) printf("I=%.f J=%.f\n", i, j+i);
            else printf("I=%.1f J=%.1f\n", i, j+i);
        }
    }

    return 0;
}