package estruturasequencial.parte1;

import java.util.Scanner;

// Enunciado do Problema Terreno

/* Problema "terreno" Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
duas casas decimais, conforme exemplo.

Exemplo 1:
Digite a largura do terreno: 10.0
Digite o comprimento do terreno: 30.0
Digite o valor do metro quadrado: 200.00
Area do terreno = 300.00
Preco do terreno = 60000.00

Exemplo 2:
Digite a largura do terreno: 12.0
Digite o comprimento do terrano: 20.0
Digite o valor do metro quadrado: 150.00
Area do terreno = 240.00
Preco do terreno = 36000.00 */

//fim do enunciado

public class Terreno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // aqui o usuario informa a largura do terreno
        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        // aqui o usuario informa o comprimento do terreno
        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        // aqui o usuario informa o valor de cada metro quadrado
        System.out.print("Digite o valor do metro quadrado: ");
        double valorMetroQuadrado = sc.nextDouble();

        // aqui calculamos a area multiplicando a largura pelo comprimento
        double area = largura * comprimento;

        // aqui calculamos o preco total do terreno
        double preco = area * valorMetroQuadrado;

        // essa parte mostra os resultados com duas casas decimais
        System.out.printf("Area do terreno = %.2f%n", area);
        System.out.printf("Preco do terreno = %.2f%n", preco);

        sc.close();
    }
}