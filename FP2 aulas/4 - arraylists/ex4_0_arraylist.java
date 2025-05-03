import java.util.ArrayList;
import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class ex4_0_arraylist {

    /*
        ArrayLists são usados para armazenar múltiplos valores em uma única variável, mas com flexibilidade de tamanho dinâmico ao invés de declarar arrays fixos.

        // Declaração de um ArrayList
        ArrayList<tipo> nomeArrayList = new ArrayList<>();
        Eles podem crescer conforme necessário.
        Neste exemplo, vamos criar um ArrayList para armazenar nomes de frutas.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria o scanner para ler do teclado

        ArrayList<String> frutas = new ArrayList<>(); // Inicializa o ArrayList

        // Preenche o ArrayList com nomes de frutas inseridos pelo usuário
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da fruta " + (i + 1) + ": ");
            String fruta = entrada.nextLine(); // Lê o nome da fruta
            frutas.add(fruta); // Adiciona a fruta ao ArrayList
        }

        // Agora que o ArrayList está preenchido, mostra os nomes armazenados
        System.out.println("Frutas armazenadas no ArrayList:");
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("Fruta " + (i + 1) + ": " + frutas.get(i));
        }

        entrada.close(); // Fecha o scanner
    }
}

