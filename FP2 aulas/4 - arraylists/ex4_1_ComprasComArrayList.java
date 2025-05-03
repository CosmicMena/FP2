import java.util.Scanner;
import java.util.ArrayList;

/*
    * Programa: ComprasComArrayList
    * Objetivo: Simular o cálculo do valor total de uma compra.
    * O usuário informa quantos produtos comprou.
    * O programa pede o preço de cada produto e armazena em um ArrayList.
    * Depois, mostra todos os preços informados e o total da compra.
    *
    * Estrutura usada:
    * - ArrayList para armazenar os preços
    * - Loop for para preencher o ArrayList
    * - Loop for para calcular e mostrar os resultados
    * 
    * Esse exemplo mostra o uso real do for com ArrayList e entrada de dados.
 */

public class ex4_1_ComprasComArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos produtos você comprou? ");
        int quantidade = scanner.nextInt();

        ArrayList<Double> precos = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos.add(scanner.nextDouble());
        }

        System.out.println("\nPreço dos produtos:");
        double total = 0;

        for (int i = 0; i < precos.size(); i++) {
            System.out.printf("Produto %d: R$ %.2f\n", (i + 1), precos.get(i));
            total += precos.get(i);
        }

        System.out.printf("\nTotal da compra: R$ %.2f\n", total);

        scanner.close();
    }
}

