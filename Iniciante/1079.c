#include <stdio.h>

int main(){

    int i, n;
    float v1, v2, v3;

    scanf("%d", &n);

        for(i=0; i < n; i++){
            scanf("%f %f %f", &v1, &v2, &v3);
            printf("%.1f\n", (v1*2 + v2*3 + v3*5) / 10);
        }
        
    return 0;
}