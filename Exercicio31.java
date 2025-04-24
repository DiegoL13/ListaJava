/*
31) Escrever um programa que leia um conjunto de números positivos, e exiba se o número lido é par ou ímpar. Exiba 
ao final a soma total dos números pares lidos e também a soma dos números ímpares lidos. Suporemos que o 
número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o fim 
dos dados.
*/

import java.util.Scanner;
public class Exercicio31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=0, soma_par=0,soma_impar=0;

        while(num>=0){
            System.out.println("Digite um número");
            num = input.nextInt();
            if(num%2==0){
                soma_par+=num;
            }
            if(num%2==1){
                soma_impar+=num;
            }
        }
        System.out.printf("O resultado da soma dos números pares: %d\n",soma_par);
        System.out.printf("O resultado da soma dos números impares: %d",soma_impar);
    }
}
