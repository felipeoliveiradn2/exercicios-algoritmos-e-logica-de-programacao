package estruturasequencial.parte1;

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