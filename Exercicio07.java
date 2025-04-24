/*
) Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de 
temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a 
variável C é a temperatura em graus Celsius.
*/

import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double grausCelsius, grausFarenheit;

        System.out.println("Informe o valor de graus farenheit para conversão: ");
        grausFarenheit = input.nextDouble();

        grausCelsius = (grausFarenheit - 32) * 5 / 9;

        System.out.printf("%.0f graus farenheit é igual a %.0f graus celsius.",grausFarenheit,grausCelsius);
    }
}
