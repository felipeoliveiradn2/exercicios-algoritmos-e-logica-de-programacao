# Algoritmos e Lógica de Programação (Professor Nélio Alves)

Exercícios e exemplos desenvolvidos durante o curso **Algoritmos e Lógica de Programação**, do professor Dr. Nélio Alves, na Udemy.

O objetivo deste repositório é registrar os exercícios realizados durante o curso e praticar fundamentos de programação e resolução de problemas.

As principais tecnologias utilizadas nos estudos são **Portugol, C, C# e Java**. Portugol e C foram utilizados principalmente para o aprendizado inicial de lógica de programação, enquanto C# foi utilizado anteriormente durante o curso Técnico em Desenvolvimento de Sistemas da ETEC Getúlio Vargas. Atualmente, **Java é a linguagem de maior interesse para meus estudos e desenvolvimento profissional**.

## Conteúdos

* Algoritmos e lógica de programação
* Variáveis e tipos de dados
* Operadores
* Entrada e saída de dados
* Estruturas condicionais
* Estruturas de repetição
* Vetores
* Matrizes
* Processamento de dados
* Casting
* Debug

## Tecnologias

* VisualG
* C
* Java
* C#

## Estrutura

```text
README.md

01-fundamentos/
02-operadores/
03-entrada-saida/
04-estruturas-condicionais/
05-estruturas-repeticao/
06-vetores/
07-matrizes/
08-debug/
```

## Sobre o curso

O curso trabalha inicialmente a construção de algoritmos e lógica de programação em Portugol e posteriormente utiliza esses conceitos em linguagens de programação.

Os materiais utilizados no curso apresentam exemplos envolvendo variáveis, operadores, entrada e saída de dados, estruturas condicionais, estruturas de repetição, vetores e matrizes.

### Exemplo em Portugol

```text
programa
{
    funcao inicio()
    {
        real raio, area
        real pi = 3.14159

        escreva("Digite o raio: ")
        leia(raio)

        area = pi * raio * raio

        escreva("Área = ", area)
    }
}
```

### Exemplo em Java

```java
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area;
        double pi = 3.14159;

        System.out.print("Digite o raio: ");
        raio = sc.nextDouble();

        area = pi * raio * raio;

        System.out.printf("Área = %.2f%n", area);

        sc.close();
    }
}
```

A lógica utilizada no exemplo é a mesma em ambas as linguagens, porém a implementação muda de acordo com a sintaxe e os recursos disponíveis em cada uma.

## Objetivo

Consolidar os fundamentos de lógica de programação por meio da leitura dos slides, acompanhamento das aulas em vídeo e resolução das listas de exercícios propostas durante o curso.
