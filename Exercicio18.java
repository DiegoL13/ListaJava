/*
18) Escreva um programa que leia um número inteiro (variável CODIGO). Verificar se o código é igual a 1, igual a 2 ou 
igual a 3. Caso não seja, apresentar a mensagem “Código inválido”. Ao ser verificado o código e constatado que é 
um valor válido, o programa deve verificar cada código em separado para determinar seu valor por extenso, ou seja, 
apresentar a mensagem “um”, ”dois” ou “três”. (Utilizar o comando Switch).
*/

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo;

        System.out.println("Digite um número :");
        codigo = input.nextInt();

        switch(codigo){
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            default:
                System.out.println("Código inválido");
                break;
        }
    }
}
