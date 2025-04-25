/*
39) Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar,
e se é positivo ou negativo. O programa só deve parar de rodar quando o usuário responder "S" na seguinte
pergunta, "Deseja encerrar o programa?".
*/
import java.util.Scanner;
public class Exercicio39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char resposta = 'N';
        int num;

        while(resposta!='S'){
            System.out.println("Digite um número: ");
            num = input.nextInt();
            if(num%2==0){
                System.out.println(num+" é par");
            }
            else{
                System.out.println(num+" é impar");
            }
            if(num>0){
                System.out.println(num+" é positivo");
            }
            else if(num<0){
                System.out.println(num+" é negativo");
            }
            System.out.println("Deseja encerrar o programa? Digite \"S\"");
            input.nextLine();
            resposta=input.nextLine().toUpperCase().charAt(0);
        }
    }
}
