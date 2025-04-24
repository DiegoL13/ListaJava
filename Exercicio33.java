/*
33) Escreva um programa que calcule e exiba a média da nota dos alunos de uma turma em uma prova. O número de
alunos é desconhecido. Os dados de um aluno são: número de matrícula e a sua nota na prova em questão. 
*/

import java.util.Scanner;
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota, media=0;
        int qtd_alunos;

        System.out.println("Informe a quantidade de alunos");
        qtd_alunos = input.nextInt();

        for(int i=1;i<=qtd_alunos;i++){
            System.out.printf("Informe a nota do %d° aluno: \n",i);
            nota = input.nextDouble();
            media+=nota;
        }
        System.out.printf("A média da turma foi: %.2f",media/qtd_alunos);
    }
}
