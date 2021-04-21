#include <stdio.h>
 
int main() {

    int i, n, contN=0;

    for(i=0; i < 5; i++){
        scanf("%d", &n);
        if(n % 2 == 0){
            contN++;
        }
    }
        printf("%d valores pares\n", contN);

    return 0;
}