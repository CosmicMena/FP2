/**
 * Verificador Simples de Senha usando Do-While
 * 
 * Este programa demonstra o uso básico da estrutura do-while em Java
 * através de um verificador simples de senha, onde o usuário tem um
 * número limitado de tentativas para inserir a senha correta.
 * 
 * Algoritmo:
 * 1. Definir uma senha padrão
 * 2. Solicitar ao usuário que digite a senha
 * 3. Usar do-while para continuar solicitando a senha até que:
 *    a) O usuário digite a senha correta, OU
 *    b) O usuário esgote o número de tentativas
 * 4. Exibir mensagem de acesso permitido ou negado no final
 */

import java.util.Scanner;

public class ex2_2_1_VerificadorSenha {
    public static void main(String[] args) {
        // Criar objeto Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Exibir título do programa
        System.out.println("=== VERIFICADOR DE SENHA ===");
        
        // Definir a senha correta (em um sistema real, seria armazenada de forma segura)
        final String SENHA_CORRETA = "123456";
        
        // Variáveis para controlar o processo de verificação
        String senhaDigitada;         // Armazena a senha inserida pelo usuário
        int tentativasRestantes = 3;  // Limita o número de tentativas
        boolean senhaCorreta = false; // Controla se a senha está correta
        
        // Exibir instruções para o usuário
        System.out.println("Por favor, digite sua senha.");
        System.out.println("Você tem " + tentativasRestantes + " tentativas.");
        
        // ESTRUTURA DO-WHILE
        // O bloco de código dentro do "do" é executado primeiro, e só depois
        // a condição no "while" é verificada. Isso garante que o código seja
        // executado pelo menos uma vez, mesmo se a condição for falsa inicialmente.
        do {
            // Solicitar e ler a senha do usuário
            // Esta linha será executada pelo menos uma vez, independentemente
            // da condição do while
            System.out.print("\nTentativa #" + (4 - tentativasRestantes) + 
                             ": Digite sua senha: ");
            senhaDigitada = scanner.nextLine();
            
            // Verificar se a senha está correta
            // Comparação de strings em Java deve usar equals() e não ==
            if (senhaDigitada.equals(SENHA_CORRETA)) {
                // Se a senha estiver correta, definimos a variável 
                // senhaCorreta como true, o que ajudará a terminar o loop
                senhaCorreta = true;
                System.out.println("\nSenha correta! Acesso permitido.");
            } else {
                // Se a senha estiver incorreta, decrementamos as tentativas
                // e fornecemos feedback ao usuário
                tentativasRestantes--;
                
                if (tentativasRestantes > 0) {
                    // Ainda há tentativas restantes
                    System.out.println("Senha incorreta! Você ainda tem " + 
                                      tentativasRestantes + " tentativa(s).");
                } else {
                    // Tentativas esgotadas
                    System.out.println("Senha incorreta! Suas tentativas acabaram.");
                }
            }
            
        // A condição do while é verificada APÓS a primeira execução do bloco
        // O loop continua se a senha não estiver correta E ainda houver tentativas
        } while (!senhaCorreta && tentativasRestantes > 0);
        
        // Exibir mensagem final baseada no resultado das tentativas
        if (senhaCorreta) {
            System.out.println("\nBem-vindo ao sistema!");
        } else {
            System.out.println("\nACESSO NEGADO: Muitas tentativas incorretas.");
            System.out.println("A conta foi temporariamente bloqueada. Tente novamente mais tarde.");
        }
        
        // Fechar o scanner para liberar recursos
        scanner.close();
    }
}