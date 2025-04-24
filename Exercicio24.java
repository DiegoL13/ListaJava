/*
24) Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja 
realizar: 
1 – Verificar se um dos números lidos é ou não múltiplo do outro 
2 – Verificar se os dois números lidos são pares 
3 – Verificar se a média dos dois números é maior ou igual a 7. 
4 – Sair
*/

import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2, menu;
        String resultado;

        System.out.println("Digite o primeiro número: ");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = input.nextInt();

        System.out.println("Escolha uma das opções: \n" +
                "1. Verificar se os números são multiplos um do outro\n" +
                "2. Verificar se os dois números são pares\n" +
                "3. verificar se a média dos dois números é maior ou igual a 7\n" +
                "4. Sair");
        menu = input.nextInt();

        switch (menu){
            case 1:
                if(n1%n2==0){
                    System.out.println("O primeiro número é multiplo do segundo");
                }
                else{
                    System.out.println("O primeiro número não é multiplo do segundo");
                }
                if(n2%n1==0){
                    System.out.println("E o segundo número é multiplo do segundo");
                }
                else{
                    System.out.println("E o segundo número não é multiplo do primeiro");
                }
                break;
            case 2:
                if(n1%2==0){
                    System.out.println("O primeiro número é par");
                }
                else{
                    System.out.println("O primeiro número é impar");
                }

                if(n2%2==0){
                    System.out.println("O segundo número é par");
                }
                else{
                    System.out.println("O segundo número é impar");
                }
                break;
            case 3:
                System.out.println(resultado = (float)(n1+n2)/2 >= 7 ? "A média é maior ou igual a 7" : "A média é inferior a 7");
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
