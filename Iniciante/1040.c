#include <stdio.h>

int main(){

    float n1, n2, n3, n4, notaExam, media;

    scanf("%f %f %f %f", &n1, &n2, &n3, &n4);

    n1 = n1 * 2 / 10;
    n2 = n2 * 3 / 10;
    n3 = n3 * 4 / 10;
    n4 = n4 * 1 / 10;
    media = n1 + n2 + n3 + n4;

        printf("Media: %0.1f\n", media);

        if(media >= 7.0){

            printf("Aluno aprovado.\n");
        }else
        if(media >= 5.0){

            printf("Aluno em exame.\n");
            scanf("%f", &notaExam);
            printf("Nota do exame: %0.1f\n", notaExam);
            media = (media + notaExam) / 2;

            if(media >= 5.0){

                printf("Aluno aprovado.\n");

            }else   printf("Aluno reprovado.\n");

            printf("Media final: %0.1f\n", media);


        }else
            printf("Aluno reprovado.\n");


    return 0;

}
