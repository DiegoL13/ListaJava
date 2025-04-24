/*
19) Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C). Verificar se cada lado 
é menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C, sendo verdade o triângulo é eqüilátero; 
Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso contrário, o 
triângulo será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a ocorrência.
*/

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;

        System.out.println("Digite o tamanho do lado A do triângulo :");
        a= input.nextInt();
        System.out.println("Digite o tamanho do lado B do triângulo :");
        b= input.nextInt();
        System.out.println("Digite o tamanho do lado C do triângulo :");
        c= input.nextInt();

        if((a+b>c) && (a+c>b) && (b+c>a)){
            if(a==b && b==c){
                System.out.println("As medidas formam um triangulo equilátero");
            }
            else if((a==b) | (a==c) | (b==c)){
                System.out.println("As medidas formam um triângulo é isósceles");
            }
            else{
                System.out.println("As medidas formam um triangulo escaleno");
            }
        }
        else{
            System.out.println("As medidas não formam um triangulo");
        }
    }
}
