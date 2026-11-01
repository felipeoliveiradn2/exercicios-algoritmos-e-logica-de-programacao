package estruturacondicional.parte1;

// Enunciado problema Troco_verificado

/*Problema "troco_verificado"
Fazer um programa para calcular o troco no processo de pagamento de um
produto de uma mercearia.

O programa deve ler o preço unitário do produto, a quantidade de unidades
compradas deste produto e o valor em dinheiro dado pelo cliente.

Seu programa deve mostrar o valor do troco a ser devolvido ao cliente.
Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem
informando o valor restante.
*/

// fim do enunciado troco_verificado

import java.util.Scanner;

public class TrocoVerificado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // aqui informamos o preço unitário do produto
        System.out.print("Preço unitário do produto: ");
        double preco = sc.nextDouble();

        // informamos a quantidade de unidades compradas
        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        // informamos o dinheiro recebido do cliente
        System.out.print("Dinheiro recebido: ");
        double dinheiro = sc.nextDouble();

        // calculamos o valor total da compra
        double total = preco * quantidade;

        // aqui verificamos se o dinheiro é suficiente para pagar a compra
        if (dinheiro >= total) {

            // aqui calculamos o troco do cliente
            double troco = dinheiro - total;

            // essa parte mostra o valor do troco com duas casas decimais
            System.out.printf("TROCO = %.2f%n", troco);

        } else {

            // aqui calculamos quanto falta para completar o pagamento
            double faltante = total - dinheiro;

            // essa parte mostra o valor que falta para pagar a compra
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", faltante);
        }

        sc.close();
    }
}