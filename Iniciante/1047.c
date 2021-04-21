#include <stdio.h>

int main(){

    int horaInicial, minutoInicial, horaFinal, minutoFinal, somaInicial, somaFinal, dif, horaDif, minDif;

    scanf("%d %d %d %d", &horaInicial, &minutoInicial, &horaFinal, &minutoFinal);

    horaInicial = horaInicial * 60;
    horaFinal = horaFinal * 60;
    somaInicial = horaInicial + minutoInicial;
    somaFinal = horaFinal + minutoFinal;

     if(somaInicial < somaFinal){

        dif = somaFinal - somaInicial;

        horaDif = dif / 60;
        minDif = dif % 60;

        printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horaDif, minDif);
     }else{

    if(somaInicial > somaFinal){

        dif = (1440 - somaInicial) + somaFinal;

        horaDif = dif / 60;
        minDif = dif % 60;

        printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horaDif, minDif);
    }else{

        printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
    }
    }

    return 0;

}