#include <stdio.h>

int main(){

   int n[99], maior=0, i, pos;

    for(i=0; i < 100; i++){
        scanf("%d", &n[i]);
        
        if(n[i] > maior){
        maior = n[i];
        pos = i+1;
        }
    }

    printf("%d\n", maior);
    printf("%d\n", pos);

        
    return 0;
}