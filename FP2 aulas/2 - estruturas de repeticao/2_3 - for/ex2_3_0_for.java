public class ex2_3_0_for {

    /*
        O laço for é usado quando sabemos exatamente quantas vezes queremos repetir uma ação.
        Estrutura

        for (atribuição_de_variavel_contadora; condição; incremento_de_variavel_contadora) {
            // Código a ser repetido
        }
        
        Ele possui três partes principais dentro dos parênteses:
        1 - Inicialização do contador (ex: int i = 1)
        2 - Condição de repetição (ex: i <= 7)
        3 - Atualização do contador (ex: i++)

        Esse laço será usado aqui para imprimir os dias da semana, numerados de 1 a 7.
    */
    public static void main(String[] args) {
        // O contador começa em 1 e vai até 7, aumentando de 1 em 1
        for (int i = 1; i <= 7; i++) {

            // Verifica o valor de i e imprime o dia correspondente
            switch (i) {
                case 1:
                    System.out.println("1 - Domingo");
                    break;
                case 2:
                    System.out.println("2 - Segunda-feira");
                    break;
                case 3:
                    System.out.println("3 - Terça-feira");
                    break;
                case 4:
                    System.out.println("4 - Quarta-feira");
                    break;
                case 5:
                    System.out.println("5 - Quinta-feira");
                    break;
                case 6:
                    System.out.println("6 - Sexta-feira");
                    break;
                case 7:
                    System.out.println("7 - Sábado");
                    break;
            }
        }
    }
}
