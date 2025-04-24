/*
28) Faça um programa que gera e escreve os números ímpares dos números lidos entre 100 e 200.
*/

public class Exercicio28 {
    public static void main(String[] args) {
        int num;

        for(num=100;num<=200;num++){
            if(num%2==1){
                System.out.println(num);
            }
        }
    }
}
