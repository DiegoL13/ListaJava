/*
21) Faça um programa que leia um número inteiro e mostre uma mensagem na tela indicando se este número é positivo 
ou negativo. Pare a execução do programa quando o usuário requisitar.
*/

import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=1;

        while(num!=0){
            System.out.println("Digite qualquer número ou digite zero para sair:");
            num = input.nextInt();
            if(num>0){
                System.out.println("O número é positivo");
            }
            else if(num<0){
                System.out.println("O número é negativo");
            }
        }
    }
}
