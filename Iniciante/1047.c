#include <stdio.h>

int main(){

    int horaInicial, minutoInicial, horaFinal, minutoFinal, somaInicial, somaFinal, dif;

    scanf("%d %d %d %d", &horaInicial, &minutoInicial, &horaFinal, &minutoFinal);
    
    somaInicial = minutoInicial + (horaInicial * 60);
    somaFinal = minutoFinal + (horaFinal * 60);
    
    	if(somaInicial < somaFinal){    	
    	dif = somaFinal - somaInicial;
    	printf("O JOGO DUROU %d HORA(S) E ", dif / 60); dif = dif % 60;
    	printf("%d MINUTO(S)\n", dif);
    	
	}else if(somaInicial > somaFinal){
		dif = (1440 - somaInicial) + somaFinal;
		printf("O JOGO DUROU %d HORA(S) E ", dif / 60); dif = dif % 60;
    	printf("%d MINUTO(S)\n", dif);
    	
	}else printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");

    return 0;

}