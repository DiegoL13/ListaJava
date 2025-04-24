/*
16) Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do 
menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.
*/

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.println("Digite o primeiro número :");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número :");
        n2 = input.nextInt();
        
        if(n1==n2){
            System.out.println("Os numeros são iguais");
        }
        else if(n1>n2){
            System.out.printf("%d é maior e %d é menor",n1,n2);
        }
        else{
            System.out.printf("%d é maior e %d é menor",n2,n1);
        }
    }
}
