package estruturacondicional.parte1;

// Enunciado problema Baskara

/*Problema "baskara"
Fazer um programa para ler os três coeficientes de uma equação do segundo
grau. Usando a fórmula de Baskara, calcular e mostrar os valores das raízes
x1 e x2 da equação com quatro casas decimais.

Se a equação não possuir raízes reais, mostrar uma mensagem.
*/

// fim do enunciado baskara

import java.util.Scanner;

public class Baskara {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // informamos o primeiro coeficiente
        System.out.print("Coeficiente a: ");
        double a = sc.nextDouble();

        // informamos o segundo coeficiente
        System.out.print("Coeficiente b: ");
        double b = sc.nextDouble();

        // informamos o terceiro coeficiente
        System.out.print("Coeficiente c: ");
        double c = sc.nextDouble();

        // calculamos o valor de delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // verificamos se a equação possui raízes reais
        if (delta < 0 || a == 0) {

            System.out.println("Esta equacao nao possui raizes reais");

        } else {

            // aqui calculamos a raiz quadrada de delta
            double raizDelta = Math.sqrt(delta);

            // aqui calculamos os valores de x1 e x2
            double x1 = (-b + raizDelta) / (2 * a);
            double x2 = (-b - raizDelta) / (2 * a);

            // essa parte mostra as duas raizes com quatro casas decimais
            System.out.printf("X1 = %.4f%n", x1);
            System.out.printf("X2 = %.4f%n", x2);
        }

        sc.close();
    }
}