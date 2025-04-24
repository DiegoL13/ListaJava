/*
30) Faça um programa para imprimir uma tabuada.
*/

import java.util.Scanner;
public class Exercicio30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, tabuada;

        System.out.println("Escolha um número para exibir a sua tabuada");
        tabuada = input.nextInt();
        for(num=1;num<=10;num++){
            System.out.printf("%d X %d = %d\n",tabuada,num,tabuada*num);
        }
    }
}
