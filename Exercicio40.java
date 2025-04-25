/*
40) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03 grupos de indústrias que são altamente
poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as
indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do
1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Faça um programa que leia o índice de poluição medido e emita a
notificação adequada aos diferentes grupos de empresas. O algoritmo só deve parar de rodar quando o usuário
responder "S" na seguinte pergunta, "Deseja encerrar o programa?".
 */

import java.util.Scanner;
public class Exercicio40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double indice_poluicao;
        char resposta = 'N';

        while(resposta!='S') {
            System.out.println("Qual o índice de poluição?");
            indice_poluicao = input.nextDouble();

            if (indice_poluicao >= 0.3) {
                System.out.println("O grupo 1 deve paralisar suas atividades.");
            }
            if (indice_poluicao >= 0.4) {
                System.out.println("O grupo 2 deve paralisar suas atividades.");
            }
            if (indice_poluicao >= 0.5) {
                System.out.println("O grupo 3 deve paralisar suas atividades.");
            }
            System.out.println("Digite \"S\" para encerrar o programa.");
            input.nextLine();
            resposta=input.nextLine().toUpperCase().charAt(0);
        }
    }
}
