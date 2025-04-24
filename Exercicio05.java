/*
5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 
Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média. Desta 
forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o 
valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula: 
LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média, tempo gasto, 
a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distancia,tempo, litros, minutos;
        int horas, velocidadeMedia;

        System.out.println("Informe a quantidade de horas decorridas para a chegada até o destino da viagem desconsiderando os minutos: ");
        horas = input.nextInt();
        System.out.println("Informe a quantidade de minutos decorridos para a chegada até o destino da viagem: ");
        minutos = input.nextDouble();
        System.out.println("Informe a velocidade média em kilometros por hora durante a viagem: ");
        velocidadeMedia = input.nextInt();

        tempo=horas+(minutos/60);
        distancia = tempo*velocidadeMedia;
        litros=distancia/12;

        System.out.printf("A velocidade média da viagem foi de: %dkm/h\n" +
                "O tempo gasto foi de: %d hora(s) e %.0f minutos\n" +
                "A distância percorrida foi de: %.0f km\n" +
                "A quantidade de combustível gasta foi de: %.2f litros",velocidadeMedia,horas,minutos,distancia,litros);
    }
}
