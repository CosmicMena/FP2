import java.util.Scanner;  // Importa a classe Scanner para leitura de dados do teclado

/*
 * Programa: ComprasComArray
 * Objetivo: Simular o cálculo do valor total de uma compra.
 * O usuário informa quantos produtos comprou.
 * O programa pede o preço de cada produto e armazena em um array.
 * Depois, mostra todos os preços informados e o total da compra.
 *
 * Estrutura usada:
 * - Array (vetor) para armazenar os preços
 * - Loop for para preencher o array
 * - Loop for para calcular e mostrar os resultados
 * 
 * Esse exemplo mostra o uso real do for com arrays e entrada de dados.
 */

public class ex3_1_ComprasComArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler do teclado

        System.out.print("Quantos produtos você comprou? ");
        int quantidade = scanner.nextInt(); // Lê a quantidade de produtos que o usuário comprou

        // Cria um array para armazenar os preços de acordo com a quantidade informada
        double[] precos = new double[quantidade];

        // Loop para preencher o array com os preços informados pelo usuário
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble(); // Armazena o preço no índice correspondente do array
        }

        // Exibe os preços e calcula o total
        System.out.println("\nPreço dos produtos:");
        double total = 0; // Inicializa o total como zero

        // Loop para percorrer o array, mostrar os preços e somar o total
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Produto %d: R$ %.2f\n", (i + 1), precos[i]);
            total += precos[i]; // Acumula o preço no total
        }

        // Exibe o valor total da compra
        System.out.printf("\nTotal da compra: R$ %.2f\n", total);

        scanner.close(); // Fecha o Scanner
    }
}
