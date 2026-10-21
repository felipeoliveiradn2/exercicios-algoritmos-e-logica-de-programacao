package estruturasequencial.parte1;

import java.util.Scanner;

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