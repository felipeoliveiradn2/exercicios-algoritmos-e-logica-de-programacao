package estruturasequencial.parte2;

//Enunciado problema Duração

/*Problema "duracao"
Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
formato horas:minutos:segundos.

Exemplo 1:
Digite a duracao em segundos: 300
0:5:0

Exemplo 2:
Digite a duracao em segundos: 12506
3:28:26

Exemplo 3:
Digite a duracao em segundos: 140811
39:6:51 */

//fim do problema duração

import java.util.Scanner;

public class Duracao {

    public static void main(String[] args) {

        // permite ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);

        // le a duracao total em segundos
        System.out.print("digite a duracao em segundos: ");
        int duracao = sc.nextInt();

        // calcula as horas inteiras dividindo o total de segundos por 3600
        int horas = duracao / 3600;

        // calcula os minutos restantes depois de retirar as horas completas
        int minutos = (duracao % 3600) / 60;

        // calcula os segundos restantes depois de retirar as horas e os minutos
        int segundos = duracao % 60;

        // exibe a duracao no formato horas:minutos:segundos
        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

        // encerra a leitura dos dados
        sc.close();
    }
}