/*
6) Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de 
temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus 
Fahrenheit e a variável C representa é a temperatura em graus Celsius.
*/
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grausCelsius, grausFarenheit;

        System.out.println("Informe o valor de graus celsius para conversão: ");
        grausCelsius = input.nextDouble();

        grausFarenheit = (9 * grausCelsius + 160) / 5;

        System.out.printf("%.0f graus celsius é igual a %.0f graus farenheit.",grausCelsius,grausFarenheit);
    }
}
