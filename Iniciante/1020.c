#include <stdio.h>
 
int main(){
    
    int idadeD, dia, mes, ano; 
 
    scanf("%d", &idadeD);
    
    ano = idadeD / 365;
    idadeD -= ano * 365;
    mes = idadeD / 30;
    idadeD -= mes * 30;
    dia = idadeD;
    
	printf("%d ano(s)\n", ano);
	printf("%d mes(es)\n", mes);
	printf("%d dia(s)\n", dia);
 
    return 0;
}
