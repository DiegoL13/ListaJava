/*
13) Escreva um programa que leia 3 números inteiros e imprima na tela os valores em ordem decrescente.
*/

import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3,aux;

        System.out.println("Digite o primeiro número :");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número :");
        n2 = input.nextInt();
        System.out.println("Digite o terceiro número :");
        n3 = input.nextInt();

        if(n1<n2){
            aux=n1;
            n1=n2;
            n2=aux;
        }
        if(n1<n3){
            aux=n1;
            n1=n3;
            n3=aux;
        }
        if(n2<n3){
            aux=n2;
            n2=n3;
            n3=aux;
        }
        System.out.printf("%d %d %d",n1,n2,n3);
    }
}
