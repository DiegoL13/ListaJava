/*
23) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas: 
1 – Adição 
2 – Subtração 
3 – Multiplicação 
4 – Divisão 
*/

import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, n1,n2;
        System.out.println("Escolha uma das opções:\n" +
                "1. Adição\n" +
                "2. Subtração\n" +
                "3. Multiplicação\n" +
                "4. Divisão");

        menu = input.nextInt();
        System.out.println("Digite o primeiro número: ");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = input.nextInt();

        switch (menu){
            case 1:
                System.out.printf("O resultado da soma é: %d",n1+n2);
                break;
            case 2:
                System.out.printf("O resultado da subtração é: %d", n1-n2);
                break;
            case 3:
                System.out.printf("O resultado da multiplicação é: %d", n1*n2);
                break;
            case 4:
                while(n2==0){
                    System.out.println("Não é possível dividir um número por zero, digite outro número");
                    n2 = input.nextInt();
                }
                System.out.printf("O resultado da divisão é: %.2f", (float) n1/n2);
                break;
            default:
                System.out.println("Número inválido");
        }
    }
}
