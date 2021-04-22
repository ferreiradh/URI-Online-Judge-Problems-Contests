#include <stdio.h>
 
int main(){
    
    int idadeD; 
 
    scanf("%d", &idadeD);
    
	printf("%d ano(s)\n", idadeD / 365); idadeD = idadeD % 365;
	printf("%d mes(es)\n", idadeD / 30); idadeD = idadeD % 30;
	printf("%d dia(s)\n", idadeD);
 
    return 0;
}