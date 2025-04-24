/*
3) Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua 
comissão será de 5% do total da venda e que você tem os seguintes dados: 
- Identificação do vendedor 
- Código da peça 
- Preço unitário da peça 
- Quantidade vendida
  */
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeVendedor, peca;
        double valorUnit, valorTotal, comissao = 0.05;
        int qtdVendida;

        System.out.println("Digite o nome do vendedor: ");
        nomeVendedor = input.nextLine();
        System.out.println("Digite o nome da peça: ");
        peca = input.nextLine();
        System.out.println("Digite o valor unitário da peça: ");
        valorUnit = input.nextDouble();
        System.out.printf("Digite a quantidade de peças vendidas pelo vendedor %s: \n", nomeVendedor);
        qtdVendida = input.nextInt();
        valorTotal = valorUnit*qtdVendida;
        System.out.printf("A comissão de %s foi de: R$%.2f", nomeVendedor, valorTotal*comissao);
    }
}
