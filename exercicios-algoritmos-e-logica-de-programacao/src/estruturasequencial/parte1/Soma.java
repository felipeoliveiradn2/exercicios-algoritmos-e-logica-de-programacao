package estruturasequencial.parte1;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // aqui informamos o primeiro valor inteiro
        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();

        // aqui informamos o segundo valor inteiro
        System.out.print("Digite o valor de Y: ");
        int y = sc.nextInt();

        // aqui somamos os dois valores
        int soma = x + y;

        // essa parte mostra o resultado da soma
        System.out.println("SOMA = " + soma);

        sc.close();
    }
}