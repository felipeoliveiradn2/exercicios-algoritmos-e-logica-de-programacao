package estruturasequencial.parte2;

//Enunciado problema Consumo

/*Problema "consumo"
Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de
combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
médio do carro, com três casas decimais.

Exemplo 1:
Distancia percorrida: 500
Combustível gasto: 38.5
Consumo medio = 12.987

Exemplo 2:
Distancia percorrida: 1108
Combustível gasto: 71.4
Consumo medio = 15.518 */

//fim do problema consumo

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {

        // define o ponto como separador decimal
        Locale.setDefault(Locale.US);

        // permite ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);

        // le a distancia percorrida em quilometros
        System.out.print("distancia percorrida: ");
        double distancia = sc.nextDouble();

        // le a quantidade de combustivel gasto em litros
        System.out.print("combustivel gasto: ");
        double combustivel = sc.nextDouble();

        // calcula quantos quilometros o carro percorre por litro
        double consumoMedio = distancia / combustivel;

        // exibe o consumo medio com tres casas decimais
        System.out.printf("consumo medio = %.3f%n", consumoMedio);

        // encerra a leitura dos dados
        sc.close();
    }
}