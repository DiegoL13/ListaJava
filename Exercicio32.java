/*
32) Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros números inteiros positivos 
ímpares a partir do número informado pelo usuário menor que 10 e maior que zero.
*/

import java.util.Scanner;
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador,num,potencia,soma_potencia=0;

        System.out.println("Digite um número:");
        num = input.nextInt();
        for(contador=1;contador<=20;contador++){
            if(num%2==1){
                potencia=num*num;
                soma_potencia += potencia;
            }
            num++;
        }
        System.out.printf("O resultado da soma das potências é: %d",soma_potencia);
    }
}
