#include <stdio.h>

int main(){
	
	int n, nota100, nota50, nota20, nota10, nota5, nota2, nota1;
	
		scanf("%d", &n);
		printf("%d\n", n);
		
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
			nota1 = n;
		
		printf("%d nota(s) de R$ 100,00\n", nota100);
		printf("%d nota(s) de R$ 50,00\n", nota50);
		printf("%d nota(s) de R$ 20,00\n", nota20);
		printf("%d nota(s) de R$ 10,00\n", nota10);
		printf("%d nota(s) de R$ 5,00\n", nota5);
		printf("%d nota(s) de R$ 2,00\n", nota2);
		printf("%d nota(s) de R$ 1,00\n", nota1);
		
		return 0;
		
}
