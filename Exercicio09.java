/*
9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa
expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
*/

import java.util.Scanner;
import java.time.LocalDate;

public class Teste{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ano_aniv, mes_aniv, dia_aniv, idade;
        int ano_atual, mes_atual, dia_atual;

        dia_atual=LocalDate.now().getDayOfMonth();
        mes_atual=LocalDate.now().getMonthValue();
        ano_atual=LocalDate.now().getYear();


        System.out.println("Digite o número do dia que você nasceu:");
        dia_aniv= input.nextInt();

        System.out.println("Digite o número do mês que você nasceu:");
        mes_aniv = input.nextInt();

        System.out.println("Digite o ano que você nasceu:");
        ano_aniv = input.nextInt();

        idade = (ano_atual - ano_aniv) * 365 + (mes_atual - mes_aniv) * 30 + (dia_atual - dia_aniv);
        System.out.printf("Você viveu %d dias",idade);
    }
}
