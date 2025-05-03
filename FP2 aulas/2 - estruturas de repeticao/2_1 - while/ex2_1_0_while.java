import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class ex2_1_0_while {

    /*
        A estrutura while executa um bloco de código repetidamente enquanto a condição for verdadeira.

        while (condição) {
            // Executa esse bloco enquanto a condição for verdadeira
        }
        A condição é testada antes de executar o bloco.

        - Primeiro verifica a condição
        - Se for verdadeira, executa o bloco
        - Repete o processo até que a condição seja falsa

        Neste exemplo, vamos continuar pedindo um número de 1 a 7 até que o usuário digite corretamente.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria o scanner para ler do teclado

        int dia = 0; // Inicializa a variável

        // Enquanto o valor for inválido (menor que 1 ou maior que 7), repete
        while (dia < 1 || dia > 7) {
            System.out.print("Digite um número de 1 a 7: ");
            dia = entrada.nextInt(); // Lê o número inteiro

            if (dia < 1 || dia > 7) {
                System.out.println("Número inválido. Tente novamente.");
            }
        }

        // Agora que o número é válido, mostra o dia correspondente
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }

        entrada.close(); // Fecha o scanner
    }
}
