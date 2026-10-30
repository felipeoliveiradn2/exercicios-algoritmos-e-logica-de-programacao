package estruturasequencial.parte2;

//Enunciado problema pagamento

/*Problema "pagamento"
Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a
quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com
uma mensagem explicativa, conforme exemplo.

Exemplo 1:
Nome: Joao Silva
Valor por hora: 50.00
Horas trabalhadas: 60
O pagamento para Joao Silva deve ser 3000.00

Exemplo 2:
Nome: Maria Dias
Valor por hora: 60.00
Horas trabalhadas: 100
O pagamento para Maria Dias deve ser 6000.00 */

//fim do enunciado pagamento

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // permite ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);

        // le o nome do funcionario, incluindo espacos
        System.out.print("nome: ");
        String nome = sc.nextLine();

        // le o valor recebido por hora
        System.out.print("valor por hora: ");
        double valorPorHora = sc.nextDouble();

        // le a quantidade de horas trabalhadas
        System.out.print("horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        // calcula o pagamento multiplicando o valor por hora pelas horas trabalhadas
        double pagamento = valorPorHora * horasTrabalhadas;

        // exibe o pagamento com duas casas decimais %.2f exibe o pagamento com duas casas decimais
        System.out.printf("o pagamento para %s deve ser %.2f%n", nome, pagamento);

        // encerra a leitura dos dados
        sc.close();
    }
}
