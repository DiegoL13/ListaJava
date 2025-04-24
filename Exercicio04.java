/*
4) Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os valores 
lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis A, B, C e 
D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B com D e por 
último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo, devem ser 
realizadas doze operações de processamento, sendo seis para as adições e seis para as multiplicações.
*/

import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d;

        System.out.println("Informe o valor de A: ");
        a = input.nextInt();
        System.out.println("Informe o valor de B: ");
        b = input.nextInt();
        System.out.println("Informe o valor de C: ");
        c = input.nextInt();
        System.out.println("Informe o valor de D: ");
        d = input.nextInt();

        System.out.printf("O resultado da multiplicação dos valores é:\n A x B = %d , A x C = %d , A x D = %d , B x C = %d , B x D = %d , C x D = %d\n",a*b,a*c,a*d,b*c,b*d,c*d);
        System.out.printf("O resultado da soma dos valores é:\n A + B = %d , A + C = %d , A + D = %d , B + C = %d , B + D = %d , C + D = %d",a+b,a+c,a+d,b+c,b+d,c+d);
    }
}
