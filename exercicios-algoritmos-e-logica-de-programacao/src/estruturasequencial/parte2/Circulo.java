package estruturasequencial.parte2;

//Enunciado problema Círculo

/*Problema "circulo"
Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do
círculo com três casas decimais. A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟^2 Você pode
usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use
diretamente o valor 3.14159.

Exemplo 1:
Digite o valor do raio do circulo: 2.0
AREA = 12.566

Exemplo 2:
Digite o valor do raio do circulo: 13.2
AREA = 547.391 */

//fim do problema circulo

import java.util.Locale;
import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {

        // define o ponto como separador decimal
        Locale.setDefault(Locale.US);

        // permite ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);

        // le o valor do raio do circulo
        System.out.print("digite o valor do raio do circulo: ");
        double raio = sc.nextDouble();

        // usa math.pi para obter o valor de pi com precisao
        // multiplica pi pelo raio ao quadrado para calcular a area
        double area = Math.PI * raio * raio;

        // exibe a area com tres casas decimais usando %.3f
        System.out.printf("area = %.3f%n", area);

        // encerra a leitura dos dados
        sc.close();
    }
}
