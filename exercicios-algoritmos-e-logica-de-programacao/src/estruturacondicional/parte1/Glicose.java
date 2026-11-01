package estruturacondicional.parte1;

// Enunciado problema Glicose

/*Problema "glicose"
Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa
e depois mostrar na tela a classificação desta glicose de acordo com a
tabela de referência.

Classificação:
Normal: até 100 mg/dl
Elevado: maior que 100 até 140 mg/dl
Diabetes: maior que 140 mg/dl
*/

// fim do enunciado glicose

import java.util.Scanner;

public class Glicose {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // informamos a medida da glicose no sangue
        System.out.print("Digite a medida da glicose: ");
        double glicose = sc.nextDouble();

        // verificamos se a glicose está dentro do nível normal
        if (glicose <= 100.0) {

            System.out.println("Classificacao: normal");

            // verificamos se a glicose está elevada
        } else if (glicose <= 140.0) {

            System.out.println("Classificacao: elevado");

            // se não atender às condições anteriores, indica diabetes
        } else {

            System.out.println("Classificacao: diabetes");
        }

        sc.close();
    }
}