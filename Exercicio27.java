/*
27) Escreva um programa que leia: 
- a quantidade de números que deverá processar; 
- os números que deverá processar,e calcule e exiba, para cada número a ser processado o seu fatorial. Lembrete: 
O fatorial de um número N é dado pela fórmula: N! = 1 * 2 * 3 * 4 * 5 * ... * N
*/

import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtd_num, fatorial, num, resultado;

        System.out.println("Informe a quantidade de números a serem processaos: ");
        qtd_num = input.nextInt();

        for(fatorial=qtd_num; fatorial>=1; fatorial--){
            resultado=1;
            System.out.println("Informe o número para processar o fatorial");
            num = input.nextInt();
            for(int i=num; num>=1; num--) {
                resultado = resultado * num;
                if (num == 1) {
                    System.out.printf("O fatorial de %d  é: %d\n", i, resultado);
                }
            }
        }
    }
}
