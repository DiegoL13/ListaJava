/*
38) Faça um programa que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um
operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a
50, calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora
excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente. O
programa só deve parar de rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o
programa?".
 */
import java.util.Scanner;
public class Exercicio38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c=1, n;
        double salario,salario_total,e=0;
        char resposta='N';

        while(resposta=='N'){
            System.out.printf("Digite a quantidade de horas trabalhadas pelo funcionário %d.\n",c);
            n= input.nextInt();
            if(n>50){
                e=n-50;
                n-=e;
            }
            System.out.printf("O salário total do funcionário %d é R$%.2f, o salário excedente é: R$%.2f\n",c,salario_total=n*10+e*20,e*20);
            c++;
            System.out.println("Deseja encerrar o programa? S/N");
            input.nextLine();
            resposta=input.nextLine().toUpperCase().charAt(0);
        }
    }
}
