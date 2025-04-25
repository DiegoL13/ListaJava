/*
41) Faça um programa que dada a idade de um nadador, classifique-o em uma das seguintes categorias:
- Infantil A = 5 a 7 anos
- Infantil B = 8 a 11 anos
- Juvenil A = 12 a 13 anos
- Juvenil B = 14 a 17 anos
- Adultos = Maiores de 18 anos
 */

import java.util.Scanner;
public class Exercicio41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        String [] categorias  = {"Infantil A", "Infantil B", "Juvenil A", "Juvenil B","Adultos"};
        String categoria="";

        System.out.println("Digite a idade do nadador.");
        idade=input.nextInt();

        if(idade>=5 && idade<8){
            categoria=categorias[0];
        }
        if(idade>=8 && idade<12){
            categoria=categorias[1];
        }
        if(idade>=12 && idade<14){
            categoria=categorias[2];
        }
        if(idade>=14 && idade<18){
            categoria=categorias[3];
        }
        if(idade>=18){
            categoria=categorias[4];
        }
        System.out.printf("O nadador pertence a categoria: %s",categoria);
    }
}
