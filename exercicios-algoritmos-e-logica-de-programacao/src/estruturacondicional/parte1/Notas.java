package estruturacondicional.parte1;

// Enunciado problema Notas

/*Problema "notas"
Fazer um programa para ler as duas notas que um aluno obteve no primeiro
e segundo semestres de uma disciplina anual. Em seguida, mostrar a nota
final que o aluno obteve (com uma casa decimal) no ano juntamente com
um texto explicativo.

Caso a nota final do aluno seja inferior a 60.00, mostrar a mensagem
"REPROVADO".
*/

// fim do enunciado notas

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // informamos a primeira nota do aluno
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        // aqui informamos a segunda nota do aluno
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        // somamos as duas notas para obter a nota final
        double notaFinal = nota1 + nota2;

        // essa parte mostra a nota final com uma casa decimal
        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

        // aqui verificamos se a nota final foi menor que 60
        if (notaFinal < 60.0) {
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}