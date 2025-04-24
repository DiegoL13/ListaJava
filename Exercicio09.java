/*
9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa 
expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
*/

import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade, anos, meses, dias;

        System.out.println("Informe quantos anos você tem: ");
        anos = input.nextInt();
        System.out.println("Informe quantos meses você tem: ");
        meses = input.nextInt();
        System.out.println("Informe quantos dias você tem: ");
        dias = input.nextInt();

        idade = anos*365+meses*30+dias;
        System.out.printf("Você viveu %d dias",idade);
    }
}
