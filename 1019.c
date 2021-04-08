#include <stdio.h>
 
int main(){
    
    int n, sec, min, hora; 
 
    scanf("%d", &n);
    
    hora = n / 3600;
    n -= hora * 3600;
	min = n / 60;
	n -= min * 60;
	sec = n;
	
	printf("%d:%d:%d\n", hora, min, sec);
 
    return 0;
}
