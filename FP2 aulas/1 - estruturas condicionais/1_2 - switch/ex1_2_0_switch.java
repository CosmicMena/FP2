import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class ex1_2_0_switch {

    /*
        A estrutura switch serve para tomar decisões com base no valor de uma variável, especialmente quando você tem muitas opções (casos) a considerar.

        Ela é usada no lugar de vários if...else if...else seguidos, quando a verificação é feita sobre um mesmo valor fixo, como um número, caractere ou string.

        Estrutura 
        escolha (variável) {
            caso 1: 
                faça isto;
                pare por aqui;
            caso 2:
                faça isto;
                pare por aqui;
            default:
                faça isto;
        }

        1 - Analisa o valor de uma variável
        2 - Verifica se a primeira é igual ao valor da variável
            2.1 - Se sim, executa o bloco correspondente e pára o código
            2.2 - Se não, prosseguir para a linha de baixo
        3 - Verifica se a segunda é igual ao valor da variável
            3.1 - Se sim, executa o bloco correspondente e pára o código
            3.2 - Se não, prosseguir para a linha de baixo
        4 - Executa o bloco padrão (usado quando não há correspondência)
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria o scanner para ler do teclado

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número de 1 a 7: ");
        int dia = entrada.nextInt(); // Lê o número inteiro

        // Usa switch para decidir qual dia da semana corresponde ao número
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
            default:
                // Se o número não for de 1 a 7
                System.out.println("Número inválido. Digite um número de 1 a 7.");
        }

        entrada.close(); // Fecha o scanner
    }
}
