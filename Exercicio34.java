/*
34) Escreva um programa que leia um conjunto de números positivos e exiba o menor e o maior. Suporemos que o 
número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o fim 
dos dados.
*/

import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num,maior,menor;

        System.out.print("Digite um número positivo ou digite um número negativo para sair: ");
        num = input.nextInt();

        if(num >=0){
            menor = num;
            maior = num;
        while(num >=0) {
            System.out.print("Digite outro número: ");
            num = input.nextInt();
            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                if (num >= 0)
                    menor = num;
                }
            }
            System.out.printf("O maior número é: %d e o menor é: %d",maior,menor);
        }
    }
}
