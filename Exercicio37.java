/*
37) Faça um programa de conversão de base numérica. O programa deverá apresentar uma tela de entrada com as
seguintes opções:
1 – Adição
2 – Subtração
3 – Multiplicação
4 – Divisão
Informe a opção:
A partir da opção escolhida, o programa deverá solicitar para que o usuário digite dois números. Em seguida, o
programa deve exibir o resultado da opção indicada pelo usuário e perguntar ao usuário se ele deseja voltar ao
menu principal. Caso a resposta seja ´S´ ou ´s´, deverá voltar ao menu, caso contrário deverá encerrar o programa.
*/

import java.util.Scanner;
public class Exercicio37 {
    static Scanner input = new Scanner(System.in);
    static int menu=0,n1,n2;
    static char resposta='S';
    public static void main(String[] args) {
        exibirMenu();
        recebeNum();

    }
    public static void exibirMenu() {
        while (menu < 1 || menu > 4) {
            System.out.println("Escolha uma opção:\n" +
                    "1. Adição\n" +
                    "2. Subtração\n" +
                    "3. Multiplicação\n" +
                    "4. Divisão\n");
            menu = input.nextInt();
            if(menu<1 || menu>4){
                System.out.println("Valor inválido.");
            }
            else{
                recebeNum();
            }
        }
    }

    public static void recebeNum(){
        while(resposta=='S') {
            System.out.println("Digite o primeiro número: ");
            n1 = input.nextInt();

            System.out.println("Digite o segundo número: ");
            n2 = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.printf("A soma do primeiro e segundo número é: %d\n", n1 + n2);
                    break;
                case 2:
                    System.out.printf("A subtração do primeiro pelo segundo número é: %d\n", n1 - n2);
                    break;
                case 3:
                    System.out.printf("A multiplicação do primeiro e segundo número é: %d\n", n1 * n2);
                    break;
                case 4:
                    while (n2 == 0) {
                        System.out.println("Número não pode ser dividido por zero, digite novamente.");
                        n2 = input.nextInt();
                    }
                    System.out.printf("A divisão do primeiro pelo segundo número é: %.2f\n", (float) n1 / n2);
                    break;
            }
            System.out.println("Se desejar voltar para o meu principal digite \"S\".");
            input.nextLine();
            resposta = input.nextLine().toUpperCase().charAt(0);
            menu=0;
            if(resposta=='S'){
                exibirMenu();
            }
            else{
                resposta='N';
                menu=1;
                System.out.println("Saindo...");
            }
        }
    }
}
