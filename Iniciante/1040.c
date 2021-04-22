#include <stdio.h>

int main(){

    float n1, n2, n3, n4, notaExam, media;

    scanf("%f %f %f %f", &n1, &n2, &n3, &n4);

    media = ((n1*2) + (n2*3) + (n3*4) + (n4*1)) / 10;

        printf("Media: %.1f\n", media);

        if(media >= 7.0){
            printf("Aluno aprovado.\n");

        }else
        if(media >= 5.0){
            printf("Aluno em exame.\n");
            scanf("%f", &notaExam);
            printf("Nota do exame: %.1f\n", notaExam);
            media = (media + notaExam) / 2;

            if(media >= 5.0){
                printf("Aluno aprovado.\n");

            }else   printf("Aluno reprovado.\n");

            printf("Media final: %.1f\n", media);


        }else
            printf("Aluno reprovado.\n");


    return 0;

}
