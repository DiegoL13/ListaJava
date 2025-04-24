/*
1) Faça um programa para calcular o estoque médio de uma peça, sendo que: 
ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2. 
*/

import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double estoqueMedio;
        int qtdMinima, qtdMaxima;

        System.out.println("Digite a quantidade minima do estoque: ");
        qtdMinima = input.nextInt();
        System.out.println("Digite a quantidade maxima do estoque: ");
        qtdMaxima = input.nextInt();

        System.out.printf("O estoque médio é: %.1f", estoqueMedio = (qtdMinima + qtdMaxima)/2);
    }
}
