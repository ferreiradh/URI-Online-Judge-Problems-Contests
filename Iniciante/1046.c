#include <stdio.h>

int main(){

    int horaInicial, horaFinal;

    scanf("%d %d", &horaInicial, &horaFinal);

    if(horaInicial < horaFinal){

            printf("O JOGO DUROU %d HORA(S)\n", horaFinal - horaInicial);
        }else{

        if(horaInicial > horaFinal){

            printf("O JOGO DUROU %d HORA(S)\n", (24 - horaInicial) + horaFinal);
        }else{

            printf("O JOGO DUROU 24 HORA(S)\n");
        }
    }
    
    return 0;

}
