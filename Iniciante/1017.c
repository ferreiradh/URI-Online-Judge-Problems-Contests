#include <stdio.h>
 
int main(){ 
    float dist, lit;
    int tempo, velocidade;
	
    scanf("%d %d", &tempo, &velocidade);
    dist = tempo * velocidade;
	lit = dist / 12;
    printf("%.3lf\n", lit);

    return 0;
}
