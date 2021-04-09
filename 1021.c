#include<stdio.h>

int main(){
	
	double n;
	int nota100, nota50, nota20, nota10, nota5, nota2, moeda1, moeda050, moeda025, moeda010, moeda005, moeda001;
	
		scanf("%lf", &n);
		
			nota100 = n / 100;
			n -= nota100 * 100;
			nota50 = n / 50;
			n -= nota50 * 50;
			nota20 = n / 20;
			n -= nota20 * 20;
			nota10 = n / 10;
			n -= nota10 * 10;
			nota5 = n / 5;
			n -= nota5 * 5;
			nota2 = n / 2;
			n -= nota2 * 2;
			moeda1 = n;
			n -= moeda1 * 1;

			n = n * 100;
			moeda050 = n / 50;
			n -= moeda050 * 50;
			moeda025 = n / 25;
			n -= moeda025 * 25;
			moeda010 = n / 10;
			n -= moeda010 * 10;
			moeda005 = n / 5;
			n -= moeda005 * 5;
			moeda001 = n;
			
		
		
		printf("NOTAS:\n");
		printf("%d nota(s) de R$ 100.00\n", nota100);
		printf("%d nota(s) de R$ 50.00\n", nota50);
		printf("%d nota(s) de R$ 20.00\n", nota20);
		printf("%d nota(s) de R$ 10.00\n", nota10);
		printf("%d nota(s) de R$ 5.00\n", nota5);
		printf("%d nota(s) de R$ 2.00\n", nota2);
		
		printf("MOEDAS:\n");
		printf("%d moeda(s) de R$ 1.00\n", moeda1);
		printf("%d moeda(s) de R$ 0.50\n", moeda050);
		printf("%d moeda(s) de R$ 0.25\n", moeda025);
		printf("%d moeda(s) de R$ 0.10\n", moeda010);
		printf("%d moeda(s) de R$ 0.05\n", moeda005);
		printf("%d moeda(s) de R$ 0.01\n", moeda001);
	
		
		return 0;
		
}
