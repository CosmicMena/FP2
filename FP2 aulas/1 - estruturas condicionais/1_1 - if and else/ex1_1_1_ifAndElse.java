import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class VerificaIdade {
    /*
        As estruturas condicionais são usadas para tomar decisões dentro de um programa.

        Com if, você diz: "Se uma condição for verdadeira, execute este bloco de código."
        Com else, você diz: "Caso contrário, execute este outro bloco de código."

        estrutura 
        se (condição == verdadeira) {
            bloco a ser executado
        } else {
            bloco a ser executado
        }
    */
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler dados do teclado
        Scanner entrada = new Scanner(System.in);

        // Solicita que o usuário digite a idade
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt(); // Lê a idade como número inteiro

        // Verifica se a pessoa é maior de idade (18 anos ou mais)
        if (idade >= 18) {
            // Este bloco será executado se a condição for verdadeira
            System.out.println("Você é maior de idade.");
        } else {
            // Este bloco será executado se a condição for falsa
            System.out.println("Você é menor de idade.");
        }

        // Fecha o Scanner para liberar o recurso
        entrada.close();
    }
}
