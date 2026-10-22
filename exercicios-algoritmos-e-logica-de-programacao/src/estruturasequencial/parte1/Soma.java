package estruturasequencial.parte1;
// Enunciado problema Soma

/* Problema "soma"

Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes
números.

Exemplo 1:
Digite o valor de X: 8
Digite o valor de Y: 10
SOMA = 18

Exemplo 2:
Digite o valor de X: 12
Digite o valor de Y: 31
SOMA = 43 */

//fim do enunciado
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