/*
2) Faça um programa que: 
- Leia a cotação do dólar 
- Leia um valor em dólares 
- Converta esse valor para Real 
- Mostre o resultado
*/
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cotacaoDolar, valor, conversao;

        System.out.println("Digite a cotação do dólar: ");
        cotacaoDolar = input.nextDouble();
        System.out.println("Digite a quantiade de dólares que você possui: ");
        valor = input.nextDouble();

        System.out.printf("Seus dólares convertidos dá o total de R$%.2f", conversao = valor/cotacaoDolar);
    }
}
