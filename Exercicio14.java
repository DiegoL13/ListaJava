/*
14) Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
*/

import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.println("Digite o primeiro número :");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número :");
        n2 = input.nextInt();

        System.out.printf("A diferença entre os dois números é: %d", Math.abs(n1-n2));
    }
}
