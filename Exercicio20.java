/*
20) Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor maior que zero para cada 
variável (se o valor digitado não é válido, mostrar mensagem e ler novamente). Exibe o menor valor lido multiplicado 
pelo maior e o maior valor dividido pelo menor.
*/

import java.util.Scanner;
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0,b=0,c=0, aux;
        boolean permitido=false;

        System.out.println("Digite o primeiro número :");
        a = input.nextInt();

        while(permitido==false){
            if(a<=0){
                System.out.println("Valor inválido, digite novamente :");
                a = input.nextInt();
            }

            if(b<=0 && a>0){
                System.out.println("Digite o segundo número :");
                b = input.nextInt();
            }
            else if(a>0){
                System.out.print("Valor inválido, ");
            }

            if(c<=0 && b>0){
                System.out.println("Digite o terceiro número :");
                c = input.nextInt();
            }
            else if(a>0){
                System.out.print("Valor inválido, ");
            }

            if(c>0){
                permitido=true;
            }
        }

        if(a<b){
            aux=a;
            a=b;
            b=aux;
        }
        if(a<c){
            aux=a;
            a=c;
            c=aux;
        }
        if(b<c){
            aux=b;
            b=c;
            c=aux;
        }

        System.out.printf("O resultado do maior número multiplicado pelo menor é: %d\n",a*c);
        System.out.printf("O resultado do maior número dividido pelo menor é: %.2f",(float)a/c);

    }
}
