package estruturasequencial.parte1;
//Enunciado problema Idades

/* Problema "idades"

Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.

Exemplo:
Dados da primeira pessoa:
Nome: Maria Silva
Idade: 19
Dados da segunda pessoa:
Nome: Joao Melo
Idade 20
A idade média de Maria Silva e Joao Melo é de 19.5 anos */

//fim do enunciado
import java.util.Scanner;

public class Idades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // aqui informamos o nome da primeira pessoa
        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome1 = sc.nextLine();

        // aqui informamos a idade da primeira pessoa
        System.out.print("Idade: ");
        int idade1 = sc.nextInt();
        sc.nextLine();

        // aqui informamos o nome da segunda pessoa
        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();

        // aqui informamos a idade da segunda pessoa
        System.out.print("Idade: ");
        int idade2 = sc.nextInt();

        // aqui calculamos a media das duas idades
        double media = (double) (idade1 + idade2) / 2;

        // essa parte mostra os nomes e a idade media
        System.out.printf(
                "A idade media de %s e %s e de %.1f anos%n",
                nome1, nome2, media
        );

        sc.close();
    }
}