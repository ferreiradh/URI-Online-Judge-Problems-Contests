#include<stdio.h>

int main(){
	
	double n;
	
		scanf("%lf", &n);	
		
		printf("NOTAS:\n");
		printf("%d nota(s) de R$ 100.00\n", (int) n / 100); n -= ((long int) n/100) * 100;
		printf("%d nota(s) de R$ 50.00\n", (int) n / 50); n -= ((long int) n/50) * 50;
		printf("%d nota(s) de R$ 20.00\n", (int) n / 20); n -= ((long int) n/20) * 20;
		printf("%d nota(s) de R$ 10.00\n", (int) n / 10); n -= ((long int) n/10) * 10;
		printf("%d nota(s) de R$ 5.00\n", (int) n / 5); n -= ((long int) n/5) * 5;
		printf("%d nota(s) de R$ 2.00\n", (int) n / 2); n -= ((long int) n/2) * 2;
		
		printf("MOEDAS:\n");
		printf("%d moeda(s) de R$ 1.00\n", (int) n); n -= ((long int) n/1) * 1;
		n = n * 100;		
		printf("%d moeda(s) de R$ 0.50\n", (int) n / 50); n -= ((long int) n/50) * 50;
		printf("%d moeda(s) de R$ 0.25\n", (int) n / 25); n -= ((long int) n/25) * 25;
		printf("%d moeda(s) de R$ 0.10\n", (int) n / 10); n -= ((long int) n/10) * 10;
		printf("%d moeda(s) de R$ 0.05\n", (int) n / 5); n -= ((long int) n/5) * 5;
		printf("%d moeda(s) de R$ 0.01\n", (int) n);
		
		return 0;
		
}