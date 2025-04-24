/*
12) Escreva um programa que leia um número inteiro e exiba o seu módulo. O módulo de um número x é: x se x é maior 
ou igual a zero 
x * (-1) se x é menor que zero
*/

import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,modulo;
        System.out.println("Digite um número: ");
        num=input.nextInt();
        System.out.printf("O módulo de %d é: ",num);
        num=(num>0)? num : num*-1;
        System.out.println(num);
    }
}
