#include <stdio.h>

int main(){

    char class1[13], class2[9], class3[11];

    scanf("%s", class1);
    scanf("%s", class2);
    scanf("%s", class3);

    if(class1[0] == 'v'){
        if(class2[0] == 'a'){
            if(class3[0] == 'c'){
                printf("aguia\n");
            }else printf("pomba\n");

        }else if(class3[0] == 'o'){
            printf("homem\n");
        }else printf("vaca\n");

    }else if(class2[0] == 'i'){
        if(class3[2] == 'm'){
            printf("pulga\n");
        }else printf("lagarta\n");

    }else if(class3[0] == 'h'){
        printf("sanguessuga\n");
    }else printf("minhoca\n");

    return 0;

}
