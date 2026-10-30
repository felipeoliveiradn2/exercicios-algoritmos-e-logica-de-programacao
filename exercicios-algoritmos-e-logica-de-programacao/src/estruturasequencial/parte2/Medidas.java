package estruturasequencial.parte2;

//Enunciado problema Medidas

/*Problema "medidas"
Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados
com quatro casas decimais):
a) a área do quadrado que tem lado A
b) a área do triângulo retângulo que base A e altura B
c) a área do trapézio que tem bases A e B, e altura C

Exemplo 1:
Digite a medida A: 4.0
Digite a medida B: 3.5
Digite a medida C: 5.2
AREA DO QUADRADO = 16.0000
AREA DO TRIANGULO = 7.0000
AREA DO TRAPEZIO = 19.5000

Exemplo 2:
Digite a medida A: 7.13
Digite a medida B: 8.05
Digite a medida C: 11.912
AREA DO QUADRADO = 50.8369
AREA DO TRIANGULO = 28.6983
AREA DO TRAPEZIO = 90.4121 */

//fim do problema medidas

import java.util.Locale;
import java.util.Scanner;

public class Medidas {

    public static void main(String[] args) {

        // define o ponto como separador decimal
        Locale.setDefault(Locale.US);

        // permite ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);

        // le as tres medidas
        System.out.print("digite a medida a: ");
        double a = sc.nextDouble();

        System.out.print("digite a medida b: ");
        double b = sc.nextDouble();

        System.out.print("digite a medida c: ");
        double c = sc.nextDouble();

        // calcula a area do quadrado elevando o lado ao quadrado
        double areaQuadrado = a * a;

        // calcula a area do triangulo dividindo base vezes altura por dois
        double areaTriangulo = (a * b) / 2.0;

        // calcula a area do trapezio usando a soma das bases vezes a altura, dividido por dois
        double areaTrapezio = ((a + b) * c) / 2.0;

        // exibe as areas com quatro casas decimais
        System.out.printf("area do quadrado = %.4f%n", areaQuadrado);
        System.out.printf("area do triangulo = %.4f%n", areaTriangulo);
        System.out.printf("area do trapezio = %.4f%n", areaTrapezio);

        // encerra a leitura dos dados
        sc.close();
    }
}