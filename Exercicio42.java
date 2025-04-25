/*
42) Faça um programa que determine o maior e o menor entre N números lidos. A condição de parada é a entrada de
um valor 0, ou seja, o programa deve ficar executando até que a entrada seja igual a 0 (ZERO).
 */
import java.util.Scanner;

public class Exercicio42 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num,maior,menor,contador=0;

        System.out.print("Digite um número, se desejar sair digite \"0\":");
        num = input.nextInt();

        if(num !=0){
            maior = num;
            menor = num;
            while(num != 0) {
                System.out.print("Digite outro número: ");
                num = input.nextInt();
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    if (num != 0)
                        menor = num;
                }
            }
            System.out.printf("O maior número é: %d e o menor é: %d",maior,menor);
        }
    }
}
