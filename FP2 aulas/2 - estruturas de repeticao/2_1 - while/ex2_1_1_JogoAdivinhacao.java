/**
 * Jogo de Adivinhação de Números com While
 * 
 * Este programa demonstra o uso básico da estrutura while em Java
 * através de um simples jogo de adivinhação onde o usuário tenta
 * adivinhar um número aleatório gerado pelo computador.
 * 
 * Algoritmo:
 * 1. Gerar um número aleatório entre 1 e 100
 * 2. Solicitar ao usuário que adivinhe o número
 * 3. Usar while para continuar solicitando palpites até que o usuário acerte
 * 4. Dar dicas (maior/menor) após cada tentativa errada
 * 5. Exibir o número de tentativas quando o usuário acertar
 */

import java.util.Scanner;
import java.util.Random;

public class ex2_1_1_JogoAdivinhacao {
    public static void main(String[] args) {
        // Criar objeto Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Criar objeto Random para gerar um número aleatório
        // Random é uma classe que gera números pseudoaleatórios
        Random random = new Random();
        
        // Exibir título e instruções do jogo
        System.out.println("=== JOGO DE ADIVINHAÇÃO ===");
        System.out.println("Tente adivinhar o número entre 1 e 100!");
        
        // Gerar um número aleatório entre 1 e 100
        // nextInt(100) gera um número entre 0 e 99, por isso somamos 1
        int numeroSecreto = random.nextInt(100) + 1;
        
        // Variáveis para controlar o jogo
        int tentativa = 0;       // Contador de tentativas
        int palpite = 0;         // Armazena o palpite do usuário
        boolean acertou = false; // Controla se o usuário acertou o número
        
        // ESTRUTURA WHILE
        // O loop while executa o bloco de código repetidamente
        // enquanto a condição (acertou == false) for verdadeira
        while (acertou == false) {
            // Incrementa o contador de tentativas
            // Esta linha é executada cada vez que o loop se repete
            tentativa++;
            
            // Solicita e lê o palpite do usuário
            System.out.print("\nTentativa #" + tentativa + ": Digite seu palpite: ");
            palpite = scanner.nextInt();
            
            // Verifica se o palpite está dentro do intervalo válido
            // Este if verifica condições de entrada inválida
            if (palpite < 1 || palpite > 100) {
                // Avisa sobre entrada inválida e não conta como tentativa
                System.out.println("Por favor, digite um número entre 1 e 100!");
                tentativa--; // Decrementa para não contar esta tentativa
            }
            // Verifica se o palpite é igual ao número secreto
            else if (palpite == numeroSecreto) {
                // Define acertou como true, o que fará o loop while parar
                // na próxima verificação da condição
                acertou = true;
                System.out.println("\nPARABÉNS! Você acertou o número!");
                System.out.println("O número secreto era: " + numeroSecreto);
                System.out.println("Você acertou em " + tentativa + " tentativa(s)!");
            }
            // Verifica se o palpite é menor que o número secreto
            else if (palpite < numeroSecreto) {
                // Dá uma dica ao usuário
                System.out.println("Tente um número MAIOR.");
            }
            // Se não é igual nem menor, só pode ser maior
            else {
                // Dá uma dica ao usuário
                System.out.println("Tente um número MENOR.");
            }
        }
        
        // Exibe uma mensagem de classificação baseada no número de tentativas
        if (tentativa == 1) {
            System.out.println("Incrível! Você acertou de primeira!");
        } else if (tentativa <= 3) {
            System.out.println("Muito bom! Você tem um ótimo palpite!");
        } else if (tentativa <= 6) {
            System.out.println("Bom trabalho! Você está ficando bom nisso!");
        } else if (tentativa <= 10) {
            System.out.println("Nada mal! Continue praticando!");
        } else {
            System.out.println("Finalmente! Continue tentando para melhorar.");
        }
        
        // Exemplo do uso da estrutura while alternativa (while com condição simplificada)
        System.out.println("\nDeseja jogar novamente? (1-Sim, 0-Não)");
        int jogarNovamente = scanner.nextInt();
        
        // Este while usa a própria variável como condição
        // O loop continua enquanto jogarNovamente for igual a 1
        while (jogarNovamente == 1) {
            System.out.println("\nIniciando novo jogo...");
            // Em uma implementação real, todo o jogo seria reiniciado aqui
            // Para este exemplo, apenas simulamos a opção de jogar novamente
            System.out.println("(Opção de novo jogo apenas para demonstração)");
            System.out.println("\nDeseja jogar mais uma vez? (1-Sim, 0-Não)");
            jogarNovamente = scanner.nextInt();
        }
        
        System.out.println("\nObrigado por jogar! Até a próxima!");
        
        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}