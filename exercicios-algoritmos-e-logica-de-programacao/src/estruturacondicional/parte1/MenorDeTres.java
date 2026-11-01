package estruturacondicional.parte1;

// Enunciado problema Menor_de_tres

/*Problema "menor_de_tres"
Fazer um programa para ler três números inteiros. Em seguida, mostrar
qual o menor dentre os três números lidos.

Em caso de empate, mostrar apenas uma vez.
*/

// fim do enunciado menor_de_tres

import java.util.Scanner;

public class MenorDeTres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // informamos o primeiro valor inteiro
        System.out.print("Primeiro valor: ");
        int primeiro = sc.nextInt();

        // informamos o segundo valor inteiro
        System.out.print("Segundo valor: ");
        int segundo = sc.nextInt();

        // informamos o terceiro valor inteiro
        System.out.print("Terceiro valor: ");
        int terceiro = sc.nextInt();

        // aqui verificamos qual dos três valores é o menor
        int menor = Math.min(primeiro, Math.min(segundo, terceiro));

        // essa parte mostra o menor valor encontrado
        System.out.println("MENOR = " + menor);

        sc.close();
    }
}