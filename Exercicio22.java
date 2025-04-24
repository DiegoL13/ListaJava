/*
22) Faça um programa que leia um número. Se positivo armazene-o em A, se for negativo, em B. No final mostrar o 
resultado.
*/

import java.util.Scanner;
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=0,a,b;

        while(num==0) {
            System.out.println("Digite um número: ");
            num = input.nextInt();

            if (num > 0) {
                a = num;
            }
            if (num < 0) {
                b = num;
            }
        }
        System.out.println(num>0? "O número foi armazenado em A":"O número foi armazenado em B");
    }
}
