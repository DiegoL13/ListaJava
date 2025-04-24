/*
25) Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um programa que calcule seu peso ideal, 
utilizando as seguintes fórmulas: (h = altura) 
- Para homens: (72.7*h) - 58 
- Para mulheres: (62.1 *h) - 44.7
*/

import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char sexo=' ';
        double altura, peso_ideal;

        while (sexo!='M' && sexo!='F'){
            System.out.println("Informe seu sexo, digite \"M\" para masculino ou \"F\" para feminino");
            sexo = input.nextLine().toUpperCase().charAt(0);
        }
        System.out.println("Informe sua altura:");
        altura = input.nextDouble();

        peso_ideal = (sexo=='M') ? 72.7 * altura - 58 : 62.1 * altura - 44.7;
        System.out.printf("Seu peso ideal é: %.2f kilos",peso_ideal);
    }
}
