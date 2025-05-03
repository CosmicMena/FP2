/**
 * Sistema de Classificação de Notas
 * 
 * Este programa demonstra o uso das estruturas de condição em Java
 * através de um sistema que classifica notas escolares.
 * 
 * Algoritmo:
 * 1. Declarar variáveis para armazenar a nota e frequência do aluno
 * 2. Verificar se o aluno tem frequência mínima usando if-else
 * 3. Se tiver frequência mínima, classificar a nota usando if-else-if
 * 4. Demonstrar o uso do switch-case para recomendações baseadas na nota
 * 5. Usar o operador ternário para definir se o aluno precisa de recuperação
 */

import java.util.Scanner;

public class ClassificacaoNotas {
    public static void main(String[] args) {
        // Criando um objeto Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Sistema de Classificação de Notas ===");
        
        // Solicitando e lendo a nota do aluno
        System.out.print("Digite a nota do aluno (0 a 10): ");
        double nota = scanner.nextDouble();
        
        // Solicitando e lendo a frequência do aluno
        System.out.print("Digite a frequência do aluno (0 a 100): ");
        int frequencia = scanner.nextInt();
        
        System.out.println("\n=== Resultado da Avaliação ===");
        
        // ESTRUTURA 1: if-else simples
        // Verifica se o aluno tem a frequência mínima necessária (75%)
        // O if-else permite executar um bloco de código se a condição for verdadeira,
        // e outro bloco diferente se a condição for falsa
        if (frequencia >= 75) {
            System.out.println("Frequência: APROVADA (" + frequencia + "%)");
            
            // ESTRUTURA 2: if-else-if encadeado
            // Classifica a nota do aluno em diferentes categorias
            // O if-else-if permite verificar múltiplas condições em sequência
            // e executar o bloco correspondente à primeira condição verdadeira
            if (nota >= 9.0) {
                System.out.println("Conceito: A - EXCELENTE");
            } else if (nota >= 7.5) {
                System.out.println("Conceito: B - MUITO BOM");
            } else if (nota >= 6.0) {
                System.out.println("Conceito: C - BOM");
            } else if (nota >= 4.0) {
                System.out.println("Conceito: D - REGULAR");
            } else {
                System.out.println("Conceito: F - INSUFICIENTE");
            }
            
            // ESTRUTURA 3: switch-case
            // Fornece recomendações baseadas na faixa de notas
            // O switch-case é útil quando precisamos verificar múltiplos valores
            // possíveis para uma única variável
            int faixaNota = (int) nota;
            switch (faixaNota) {
                case 10:
                case 9:
                    System.out.println("Recomendação: Considerar para programa avançado");
                    break;  // O break impede que a execução continue para os próximos casos
                
                case 8:
                case 7:
                    System.out.println("Recomendação: Bom desempenho, continue assim");
                    break;
                
                case 6:
                case 5:
                    System.out.println("Recomendação: Reforçar estudos em pontos fracos");
                    break;
                
                default:  // Executado quando nenhum dos casos acima é atendido
                    System.out.println("Recomendação: Necessário acompanhamento pedagógico");
                    break;
            }
            
            // ESTRUTURA 4: Operador ternário
            // Determina se o aluno precisa de recuperação de forma compacta
            // O operador ternário (condição ? valorSeVerdadeiro : valorSeFalso) é uma forma
            // mais concisa de expressar uma condição simples
            String recuperacao = (nota < 6.0) ? "SIM" : "NÃO";
            System.out.println("Necessita recuperação: " + recuperacao);
            
        } else {
            // Executado quando a frequência é insuficiente
            System.out.println("Frequência: REPROVADA (" + frequencia + "%)");
            System.out.println("O aluno está reprovado por frequência insuficiente.");
            System.out.println("Frequência mínima necessária: 75%");
        }
        
        // Usando uma estrutura if aninhada dentro de outra estrutura if
        // para demonstrar a combinação de condições
        if (nota >= 6.0) {
            if (frequencia >= 75) {
                System.out.println("\nSituação final: APROVADO");
            } else {
                System.out.println("\nSituação final: REPROVADO POR FREQUÊNCIA");
            }
        } else {
            if (frequencia >= 75) {
                System.out.println("\nSituação final: REPROVADO POR NOTA");
            } else {
                System.out.println("\nSituação final: REPROVADO POR NOTA E FREQUÊNCIA");
            }
        }
        
        // Fechando o scanner para evitar vazamento de recursos
        scanner.close();
    }
}