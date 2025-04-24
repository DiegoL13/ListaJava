/*
8) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: 
V = 3.14159 * R * R * A 
Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
*/

import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double volume, raio, altura;
        final double PI = 3.14159;

        System.out.println("Informe o raio da lata: ");
        raio = input.nextDouble();
        System.out.println("Informe a altura da lata: ");
        altura = input.nextDouble();

        volume= PI * raio * raio * altura;
        System.out.printf("O volume da lata de óleo é: %.2f",volume);
    }
}
