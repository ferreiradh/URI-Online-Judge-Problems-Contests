#include <stdio.h>
 
int main() {

    int i, nPos=0;
    float n, somaN;

    for(i=0; i < 6; i++){
        scanf("%f", &n);
        if(n > 0){
            somaN = somaN + n;
            nPos++;
        }
    }
        printf("%d valores positivos\n", nPos);
        printf("%.1f\n", somaN / nPos);
    

    return 0;
}