#include <stdio.h>
 
int main() {
    
    int cont=0, i;
    float n;

    for(i = 0; i < 6; i++){
        scanf("%f", &n);
        if(n > 0) cont++;
    }

    printf("%d valores positivos\n", cont);

    return 0;
}