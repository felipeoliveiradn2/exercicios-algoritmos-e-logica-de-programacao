package estruturasequencial.parte1;

// Enunciado problema Troco

/* Problema "troco"

Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
mostrar o valor do troco a ser devolvido ao cliente.

Exemplo 1:
Preço unitário do produto: 8.00
Quantidade comprada: 2
Dinheiro recebido: 20.00
TROCO = 4.00

Exemplo 2:
Preço unitário do produto: 30.00
Quantidade comprada: 3
Dinheiro recebido: 100.00
TROCO = 10.00 */

//fim do enunciado
import java.util.Scanner;

public class Troco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // aqui informamos o preco de uma unidade do produto
        System.out.print("Preco unitario do produto: ");
        double preco = sc.nextDouble();

        // aqui informamos a quantidade de unidades compradas
        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        // aqui informamos o dinheiro recebido do cliente
        System.out.print("Dinheiro recebido: ");
        double dinheiro = sc.nextDouble();

        // aqui calculamos o valor total da compra
        double total = preco * quantidade;

        // aqui calculamos quanto deve ser devolvido ao cliente
        double troco = dinheiro - total;

        // essa parte mostra o troco com duas casas decimais
        System.out.printf("TROCO = %.2f%n", troco);

        sc.close();
    }
}