import java.util.Scanner;

public class ex2_3_1_VerificadorCompra {

    /*
    
        Este programa verifica a quantidade de produtos a serem comprados em um sistema.

        Estrutura do laço for:
        for (inicialização; condição; incremento) {
            // Código a ser repetido
        }

        Algoritmo:
        1. Inicializar a variável quantidadeProdutos com um valor inicial.
        2. Usar a estrutura do-while para garantir que o usuário insira uma quantidade válida de produtos.
        3. Após garantir a entrada válida, usar um laço for para processar cada produto individualmente.
        4. Dentro do laço for, solicitar ao usuário detalhes de cada produto e calcular o total.
        5. Exibir o total calculado após a execução do laço for.
    
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE COMPRA DE PRODUTOS ===");

        int quantidadeProdutos = 0;

        // Validação da entrada usando do-while
        do {
            System.out.print("Digite a quantidade de produtos comprados (deve ser um número inteiro positivo): ");
            if (scanner.hasNextInt()) {
                quantidadeProdutos = scanner.nextInt();
            } else {
                scanner.next(); // Limpar entrada inválida
            }
            if (quantidadeProdutos <= 0) {
                System.out.println("Número inválido. Tente novamente.");
            }
        } while (quantidadeProdutos <= 0);

        double somaTotal = 0;
        double[] precos = new double[quantidadeProdutos];

        // Solicita o preço de cada produto usando um loop for
        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.print("Digite o preço do produto #" + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
            somaTotal += precos[i];
        }

        // Exibe os detalhes da compra
        System.out.println("\n=== DETALHES DA COMPRA ===");
        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.printf("Produto #%d: R$ %.2f\n", (i + 1), precos[i]);
        }
        System.out.printf("Total da compra: R$ %.2f\n", somaTotal);

        scanner.close();
    }
}

