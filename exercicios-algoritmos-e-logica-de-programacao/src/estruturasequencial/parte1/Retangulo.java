package estruturasequencial.parte1;
// Enunciado problema Retângulo

/* Problema "retangulo"

Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.

Exemplo 1:
Base do retangulo: 4.0
Altura do retangulo: 5.0
AREA = 20.0000
PERIMETRO = 18.0000
DIAGONAL = 6.4031

Exemplo 2:
Base do retangulo: 10.3
Altura do retangulo: 13.1
AREA = 134.9300
PERIMETRO = 46.8000
DIAGONAL = 16.6643 */

//fim do enunciado
import java.util.Scanner;

public class Retangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // aqui o usuario informa a base do retangulo
        System.out.print("Base do retangulo: ");
        double base = sc.nextDouble();

        // aqui o usuario informa a altura do retangulo
        System.out.print("Altura do retangulo: ");
        double altura = sc.nextDouble();

        // aqui calculamos a area multiplicando a base pela altura
        double area = base * altura;

        // aqui calculamos o perimetro somando os lados do retangulo
        double perimetro = 2 * (base + altura);

        // aqui calculamos a diagonal usando o teorema de pitagoras
        double diagonal = Math.sqrt(
                Math.pow(base, 2) + Math.pow(altura, 2)
        );

        // essa parte mostra os resultados com quatro casas decimais
        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);

        sc.close();
    }
}