/*
17) Escreva um programa que leia um número inteiro. Verificar por meio de condição se o valor fornecido está na faixa 
entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”. Caso 
contrário, apresentar a mensagem “valor inválido”.
*/

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,i;

        System.out.println("Digite um número :");
        n1 = input.nextInt();

        for(i=0;i<=9;i++){
            if (i==n1){
                System.out.println("valor válido");
            }
            else if(i==9){
                System.out.println("valor invalido");
            }
        }
    }
}
