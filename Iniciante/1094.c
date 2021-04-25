#include <stdio.h>

int main(){

    int n, qtd, i, totalC=0, totalR=0, totalS=0;
    char type;

    scanf("%d", &n);

    for(i=0; i < n; i++){
        scanf("%d %c", &qtd, &type);
        switch(type){
            case 'C': totalC = totalC + qtd; break;
            case 'R': totalR = totalR + qtd; break;
            case 'S': totalS = totalS + qtd; break;
        }
    }
    
    printf("Total: %d cobaias\n", totalC + totalR + totalS);
    printf("Total de coelhos: %d\n", totalC);
    printf("Total de ratos: %d\n", totalR);
    printf("Total de sapos: %d\n", totalS);
    printf("Percentual de coelhos: %.2f %%\n", totalC*100.0 / (totalC+totalR+totalS));
    printf("Percentual de ratos: %.2f %%\n", totalR*100.0 / (totalC+totalR+totalS));
    printf("Percentual de sapos: %.2f %%\n", totalS*100.0 / (totalC+totalR+totalS));

    return 0;
}