/*
36) Faça um programa que leia 10 valores inteiros e positivos e:
- Encontre o maior valor
- Encontre o menor valor
- Calcule a média dos números lidos
 */
import java.util.Scanner;
public class Exercicio36{
    static Scanner input = new Scanner(System.in);
    static int num,maior,menor,contador=0,soma=0;
    public static void main(String[] args) {
        solicitarNum();

        System.out.printf("O maior número é: %d e o menor é: %d\n",maior,menor);
        System.out.printf("A média de todos os valores é %.2f",(float)soma/10);

    }

    public static void solicitarNum() {
        while (contador <=10) {
            System.out.print("Digite um número: ");
            num = input.nextInt();
            if (num <= 0) {
                solicitarNum();
            } else if(contador==0){
                menor = num;
                maior = num;
                contador++;
            }
            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                if (num >= 0)
                    menor = num;
            }
            if(contador<=10) {
                soma += num;
            }
            contador++;

        }
    }
}
