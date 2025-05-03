/**
 * Calculadora Simples com Switch
 * 
 * Este programa demonstra o uso básico da estrutura switch em Java
 * através de uma calculadora simples que realiza operações aritméticas
 * básicas (adição, subtração, multiplicação e divisão).
 * 
 * Algoritmo:
 * 1. Solicitar ao usuário que insira dois números
 * 2. Solicitar ao usuário que escolha uma operação (+, -, *, /)
 * 3. Usar switch para executar a operação escolhida
 * 4. Exibir o resultado da operação
 */

import java.util.Scanner;

public class ex1_2_1_CalculadoraSimples {
    public static void main(String[] args) {
        // Criar um objeto Scanner para capturar entrada do usuário
        // Scanner é uma classe que permite ler dados de entrada
        Scanner scanner = new Scanner(System.in);
        
        // Exibir título do programa
        System.out.println("=== CALCULADORA SIMPLES ===");
        
        // Solicitar e ler o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        // Solicitar e ler o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        // Limpar o buffer do scanner (consumir a quebra de linha)
        scanner.nextLine();
        
        // Mostrar as opções de operações disponíveis
        System.out.println("\nOperações disponíveis:");
        System.out.println("+ : Adição");
        System.out.println("- : Subtração");
        System.out.println("* : Multiplicação");
        System.out.println("/ : Divisão");
        
        // Solicitar e ler a operação desejada
        System.out.print("\nEscolha a operação (digite o símbolo): ");
        char operacao = scanner.nextLine().charAt(0);
        
        // Variável para armazenar o resultado da operação
        double resultado = 0;
        
        // Variável para controlar se a operação é válida
        boolean operacaoValida = true;
        
        // ESTRUTURA SWITCH
        // O switch avalia a variável 'operacao' e executa o bloco de código
        // correspondente ao caso que corresponde ao valor desta variável
        switch (operacao) {
            // Caso a operação seja '+'
            case '+':
                // Executa a adição dos dois números
                resultado = numero1 + numero2;
                // O break indica o fim deste caso e impede que o código 
                // continue executando os próximos cases
                break;
                
            // Caso a operação seja '-'
            case '-':
                // Executa a subtração dos dois números
                resultado = numero1 - numero2;
                break;
                
            // Caso a operação seja '*'
            case '*':
                // Executa a multiplicação dos dois números
                resultado = numero1 * numero2;
                break;
                
            // Caso a operação seja '/'
            case '/':
                // Verifica se o segundo número é zero para evitar divisão por zero
                if (numero2 != 0) {
                    // Executa a divisão dos dois números
                    resultado = numero1 / numero2;
                } else {
                    // Se o divisor for zero, exibe uma mensagem de erro
                    System.out.println("Erro: Divisão por zero não é permitida!");
                    // Marca a operação como inválida
                    operacaoValida = false;
                }
                break;
                
            // O default é executado quando nenhum dos casos acima corresponde ao valor de 'operacao'
            // É semelhante ao 'else' final de uma sequência de if-else
            default:
                // Exibe mensagem de erro para operação inválida
                System.out.println("Erro: Operação inválida!");
                // Marca a operação como inválida
                operacaoValida = false;
                break;
        }
        
        // Verifica se a operação foi válida para exibir o resultado
        if (operacaoValida) {
            // Exibe o resultado da operação formatado
            System.out.println("\nResultado da operação: " + numero1 + " " + operacao + " " + numero2 + " = " + resultado);
        }
        
        // Exibe uma mensagem de encerramento
        System.out.println("\nCalculadora encerrada.");
        
        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}