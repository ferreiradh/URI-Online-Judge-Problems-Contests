#include <stdio.h>

int main(){

    int i, n, valor;

    scanf("%d", &n);

    for(i=0; i < n; i++){
        scanf("%d", &valor);

        if(valor > 0){
            if(valor % 2 == 0) printf("EVEN POSITIVE\n");
            else printf("ODD POSITIVE\n");

        }else if(valor < 0){
            if(valor % 2 == 0) printf("EVEN NEGATIVE\n");
            else printf("ODD NEGATIVE\n");

        }else printf("NULL\n");
    }

    return 0;
}