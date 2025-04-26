/*
44) Faça um programa que exiba as opções:
1 – Conversão de Graus Celsius em Graus Fahrenheit
2 – Conversão de Graus Fahrenheit em Graus Celsius
3 – Peso ideal do homem
4 – Peso ideal da mulher
O programa só deve encerrar quando o usuário digitar ´S´ para a pergunta “Deseja encerrar o programa?” Obs.:
Nas opções 3 e 4 informar se o usuário está acima ou abaixo do peso ideal.
*/
import java.util.Scanner;
public class Exercicio44{
    static Scanner input = new Scanner(System.in);
    static int menu,grau;
    static double peso, peso_ideal, altura;

    public static void main(String[] args) {
        char resposta=' ';
        while(resposta!='S'){
            System.out.println("Escolha uma das seguintes opções:\n" +
                    "1. Converter graus celsius para fahrenheit\n" +
                    "2. Converter graus fahrenheit para celsius\n" +
                    "3. Conferir peso ideal masculino\n" +
                    "4. Conferir peso ideal feminino");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    converterParaFahrenheit();
                    break;
                case 2:
                    converterParaCelsius();
                    break;
                case 3:
                    pesoIdealHomem();
                    break;
                case 4:
                    pesoIdealMulher();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("Deseja encerrar o programa? Digite: \"S\"");
            input.nextLine();
            resposta = input.nextLine().toUpperCase().charAt(0);
        }
    }

    public static void converterParaFahrenheit(){
        System.out.println("Informe o valor em graus celsius que deseja converter para fahrenheit.");
        grau = input.nextInt();
        System.out.printf("%d graus celsius equivale a %d graus fahrenheint. ",grau,(9 * grau + 160) / 5);

    }

    public static void converterParaCelsius(){
        System.out.println("Informe o valor em graus fahrenheit que deseja converter para celsius.");
        grau = input.nextInt();
        System.out.printf("%d graus fahrenheint equivale a %d graus celsius. ",grau, (grau - 32) * 5 / 9);
    }

    public static void pesoIdealHomem(){
        System.out.println("Informe seu peso:");
        peso = input.nextDouble();
        System.out.println("Informe sua altura:");
        altura = input.nextDouble();
        peso_ideal = 72.7 * altura - 58;
        if(peso>peso_ideal){
            System.out.println("Você está acima do peso ideal.");
        }
        else if(peso<peso_ideal){
            System.out.println("Você está abaixo do peso ideal.");
        }
        else{
            System.out.println("Você tem o peso ideal.");
        }
    }

    public static void pesoIdealMulher(){
        System.out.println("Informe seu peso:");
        peso = input.nextDouble();
        System.out.println("Informe sua altura:");
        altura = input.nextDouble();
        peso_ideal = 62.1 * altura - 44.7 ;
        if(peso>peso_ideal){
            System.out.println("Você está acima do peso ideal.");
        }
        else if(peso<peso_ideal){
            System.out.println("Você está abaixo do peso ideal.");
        }
        else{
            System.out.println("Você tem o peso ideal.");
        }
    }
}
