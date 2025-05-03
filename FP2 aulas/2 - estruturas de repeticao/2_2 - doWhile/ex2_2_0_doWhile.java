import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class ex2_2_0_doWhile {

    /*
        A estrutura do...while executa o bloco de código pelo menos uma vez, e depois repete enquanto a condição for verdadeira.

        Neste exemplo, garantimos que o usuário veja a pergunta pelo menos uma vez, mesmo que já digite corretamente.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria o scanner para ler do teclado

        int dia;

        // Executa o bloco ao menos uma vez
        do {
            System.out.print("Digite um número de 1 a 7: ");
            dia = entrada.nextInt(); // Lê o número inteiro

            if (dia < 1 || dia > 7) {
                System.out.println("Número inválido. Tente novamente.");
            }
        } while (dia < 1 || dia > 7); // Condição de repetição

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
