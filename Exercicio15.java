/*
15) Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi 
aprovado se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota do 
recuperação, somar com o valor da média e obter a nova média. Se a nova média for maior ou igual a 7, apresentar 
uma mensagem informando que o aluno foi aprovado na recuperação. Se o aluno não foi aprovado, apresentar uma 
mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do aluno.
*/

import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float media=0, nota;
        int i;

        for(i=1;i<5;i++){
            System.out.printf("Digite a nota %d: ",i);
            nota= input.nextInt();
            media+=nota;
        }
        media/=--i;
        
        if(media<7){
            System.out.println("Qual a sua nota de recuperação?");
            nota = input.nextInt();
            media=(media+nota)/2;
            if(media<7){
                System.out.println("Você foi reprovado");
            }
        }
        else{
            System.out.println("Você foi aprovado");
        }
        System.out.printf("Sua media foi %.2f\n",media);
    }
}
