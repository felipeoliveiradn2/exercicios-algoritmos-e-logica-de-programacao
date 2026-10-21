package estruturasequencial.parte1;

import java.util.Scanner;

public class Idades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // aqui informamos o nome da primeira pessoa
        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome1 = sc.nextLine();

        // aqui informamos a idade da primeira pessoa
        System.out.print("Idade: ");
        int idade1 = sc.nextInt();
        sc.nextLine();

        // aqui informamos o nome da segunda pessoa
        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();

        // aqui informamos a idade da segunda pessoa
        System.out.print("Idade: ");
        int idade2 = sc.nextInt();

        // aqui calculamos a media das duas idades
        double media = (double) (idade1 + idade2) / 2;

        // essa parte mostra os nomes e a idade media
        System.out.printf(
                "A idade media de %s e %s e de %.1f anos%n",
                nome1, nome2, media
        );

        sc.close();
    }
}