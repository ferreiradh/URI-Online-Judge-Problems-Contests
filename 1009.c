#include <stdio.h>
 
int main() { 
    char nome;
    double salarioFixo, vendas, total;

    scanf("%s %lf %lf", &nome, &salarioFixo, &vendas);
    total = salarioFixo + (vendas * 0.15);
    printf("TOTAL = R$ %.2f\n", total);

    return 0;
}
