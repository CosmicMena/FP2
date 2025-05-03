import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class ex3_0_arrays {

    /*
        Arrays são usados para armazenar múltiplos valores em uma única variável, ao invés de declarar variáveis separadas para cada valor.

        // Declaração de um array
        tipo[] nomeArray = new tipo[tamanho];
        eles ficam em posições exatas dentro dessa variável.
        Neste exemplo, vamos criar um array para armazenar 7 números inteiros.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria o scanner para ler do teclado

        int[] numeros = new int[7]; // Inicializa o array com 7 posições

        // Preenche o array com números de 1 a 7 inseridos pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt(); // Lê o número inteiro para a posição i do array

            if (numeros[i] < 1 || numeros[i] > 7) {
                System.out.println("Número inválido. Tente novamente.");
                i--; // Decrementa i para repetir a entrada atual
            }
        }

        // Agora que o array está preenchido, mostra os números armazenados
        System.out.println("Números armazenados no array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }

        entrada.close(); // Fecha o scanner
    }
}

