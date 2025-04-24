/*
11) Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a 
possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
*/

import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,aux;
        System.out.println("Digite o valor do primeiro número :");
        a=input.nextInt();
        System.out.println("Digite o valor do segundo número :");
        b=input.nextInt();

        aux=a;
        a=b;
        b=aux;

        System.out.printf("O valor do primeiro número é: %d e o valor do segundo número é: %d",a,b);
    }
}
