#include <stdio.h>
 
int main() {

    char dia[4];
    int d1, h1, m1, s1, d2, h2, m2, s2, total1, total2, dif;

    scanf("%s %d", dia, &d1);
    scanf("%d %s %d %s %d", &h1, dia, &m1, dia, &s1);
    scanf("%s %d", dia, &d2);
    scanf("%d %s %d %s %d", &h2, dia, &m2, dia, &s2);

    total1 = s1 + m1 * 60 + h1 * 3600 + d1 * 86400;
    total2 = s2 + m2 * 60 + h2 * 3600 + d2 * 86400;
    dif = total2 - total1;
    
    printf("%d dia(s)\n", dif / 86400); dif = dif % 86400;
    printf("%d hora(s)\n", dif / 3600); dif = dif % 3600;
    printf("%d minuto(s)\n", dif / 60); dif = dif % 60;
    printf("%d segundo(s)\n", dif);

    return 0;
}