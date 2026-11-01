package estruturacondicional.parte1;

// Enunciado problema Operadora

/*Problema "operadora"
Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá
direito a 100 minutos de telefone.

Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00.

Fazer um programa para ler a quantidade de minutos que uma pessoa
consumiu, daí mostrar o valor a ser pago.
*/

// fim do enunciado operadora

import java.util.Scanner;

public class Operadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // informamos a quantidade de minutos consumidos
        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();

        // definimos o valor inicial do plano básico
        double valorPagar = 50.0;

        // aqui verificamos se o consumo ultrapassou os 100 minutos
        if (minutos > 100) {

            // aqui calculamos o valor dos minutos excedentes
            valorPagar += (minutos - 100) * 2.0;
        }

        // essa parte mostra o valor total a pagar com duas casas decimais
        System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);

        sc.close();
    }
}