#include <stdio.h>

int main(){

    int cod, qtd;
    float total;

    scanf("%d %d", &cod, &qtd);

    switch (cod){
    case 1:
        total = qtd * 4.00;
        break;

    case 2:
        total = qtd * 4.50;
        break;

    case 3:
        total = qtd * 5.00;
        break;

    case 4:
        total = qtd * 2.00;
        break;

    case 5:
        total = qtd * 1.5;
        break;
    }

    printf("Total: R$ %.2f\n", total);

    return 0;

}