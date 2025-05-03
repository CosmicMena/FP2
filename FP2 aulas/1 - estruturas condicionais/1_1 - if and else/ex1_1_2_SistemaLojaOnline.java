/**
 * Sistema de Processamento de Compras para Loja Online
 *
 * Este programa simula um sistema real de e-commerce que:
 * - Calcula descontos baseados no valor da compra
 * - Aplica cupons promocionais
 * - Define taxas de frete baseadas na localização e valor
 * - Verifica disponibilidade de produtos no estoque
 * - Determina métodos de envio apropriados
 *
 * Algoritmo:
 * 1. Coletar informações da compra (valor, quantidade, cupom, etc.)
 * 2. Verificar disponibilidade no estoque
 * 3. Calcular desconto por valor da compra
 * 4. Verificar e aplicar cupom de desconto
 * 5. Determinar taxa de frete baseada na localização e valor
 * 6. Calcular valor final da compra
 * 7. Sugerir método de pagamento
 * 8. Mostrar resumo da compra
 */

import java.util.Scanner;

public class ex1_2_SistemaLojaOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== SISTEMA DE VENDAS - TECH STORE =====");
        
        // Variáveis para armazenar informações da compra
        String nomeProduto;
        int quantidade;
        double precoUnitario;
        String regiao;
        String cupom;
        String metodoPagamento;
        
        // Coletando informações do pedido
        System.out.print("Nome do produto: ");
        nomeProduto = scanner.nextLine();
        
        System.out.print("Preço unitário (R$): ");
        precoUnitario = scanner.nextDouble();
        
        System.out.print("Quantidade desejada: ");
        quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        // ESTRUTURA 1: if-else para verificar disponibilidade em estoque
        // Uso real: Sistemas de e-commerce sempre verificam disponibilidade antes de
        // confirmar uma compra para evitar venda de produtos indisponíveis
        int estoqueDisponivel = 15; // Simulando consulta ao banco de dados
        
        if (quantidade <= estoqueDisponivel) {
            System.out.println("\nDisponibilidade: PRODUTO EM ESTOQUE");
            
            // Cálculo do valor bruto
            double valorBruto = precoUnitario * quantidade;
            System.out.printf("Valor bruto da compra: R$ %.2f\n", valorBruto);
            
            // ESTRUTURA 2: if-else-if encadeado para descontos por valor da compra
            // Uso real: Lojas frequentemente oferecem descontos progressivos para
            // incentivar compras de maior valor (quanto maior a compra, maior o desconto)
            double percentualDesconto = 0;
            if (valorBruto > 1000) {
                percentualDesconto = 15;
            } else if (valorBruto > 500) {
                percentualDesconto = 10;
            } else if (valorBruto > 200) {
                percentualDesconto = 5;
            } else if (valorBruto > 100) {
                percentualDesconto = 2;
            }
            
            double valorDesconto = valorBruto * (percentualDesconto / 100);
            System.out.printf("Desconto por valor da compra: R$ %.2f (%,.0f%%)\n", 
                              valorDesconto, percentualDesconto);
            
            // Processamento de cupom de desconto
            System.out.print("Cupom promocional (deixe em branco se não tiver): ");
            cupom = scanner.nextLine();
            
            // ESTRUTURA 3: switch-case para verificação de cupons
            // Uso real: Sistemas de promoção verificam códigos de cupom contra uma
            // base de dados e aplicam diferentes tipos de desconto conforme a campanha
            double descontoCupom = 0;
            switch (cupom.toUpperCase()) {
                case "BEMVINDO10":
                    System.out.println("Cupom BEMVINDO10: 10% de desconto adicional");
                    descontoCupom = (valorBruto - valorDesconto) * 0.10;
                    break;
                case "FRETEGRATIS":
                    System.out.println("Cupom FRETEGRATIS: Frete grátis aplicado");
                    // A taxa de frete será zerada mais adiante
                    break;
                case "BLACKFRIDAY":
                    System.out.println("Cupom BLACKFRIDAY: 30% de desconto adicional");
                    descontoCupom = (valorBruto - valorDesconto) * 0.30;
                    break;
                case "":
                    System.out.println("Nenhum cupom aplicado");
                    break;
                default:
                    System.out.println("Cupom inválido ou expirado");
                    break;
            }
            
            System.out.printf("Desconto do cupom: R$ %.2f\n", descontoCupom);
            
            // Informações de entrega
            System.out.print("Região de entrega (SUL, SUDESTE, CENTRO, NORTE, NORDESTE): ");
            regiao = scanner.nextLine().toUpperCase();
            
            // ESTRUTURA 4: Operador ternário para verificar frete grátis por cupom
            // Uso real: Validação rápida de benefício já aplicado para ajustar fluxo de cálculo
            boolean freteGratis = cupom.equalsIgnoreCase("FRETEGRATIS") ? true : false;
            
            // ESTRUTURA 5: Estrutura aninhada (if dentro de switch) para cálculo de frete
            // Uso real: Empresas de e-commerce calculam frete com base em múltiplos fatores,
            // incluindo destino e valor total da compra
            double taxaFrete = 0;
            
            if (!freteGratis) {
                switch (regiao) {
                    case "SUL":
                    case "SUDESTE":
                        // If aninhado dentro do case para refinamento da regra
                        if (valorBruto > 300) {
                            taxaFrete = 25;
                        } else {
                            taxaFrete = 35;
                        }
                        break;
                    case "CENTRO":
                        taxaFrete = 50;
                        break;
                    case "NORTE":
                    case "NORDESTE":
                        // If aninhado dentro do case para refinamento da regra
                        if (valorBruto > 500) {
                            taxaFrete = 60;
                        } else {
                            taxaFrete = 70;
                        }
                        break;
                    default:
                        System.out.println("Região não reconhecida, usando taxa padrão");
                        taxaFrete = 45;
                        break;
                }
            }
            
            System.out.printf("Taxa de frete: R$ %.2f\n", taxaFrete);
            
            // Cálculo do valor final
            double valorFinal = (valorBruto - valorDesconto - descontoCupom) + taxaFrete;
            
            // Método de pagamento
            System.out.print("Método de pagamento (CREDITO, DEBITO, BOLETO, PIX): ");
            metodoPagamento = scanner.nextLine().toUpperCase();
            
            // ESTRUTURA 6: if-else-if com operadores lógicos para definir parcelas
            // Uso real: Sistemas de pagamento verificam múltiplas condições para 
            // determinar elegibilidade para parcelamento e juros
            int parcelasMaximas = 0;
            double juros = 0;
            
            if (metodoPagamento.equals("CREDITO")) {
                if (valorFinal > 1000) {
                    parcelasMaximas = 12;
                    juros = 0;
                    System.out.println("Pagamento: Até 12x sem juros");
                } else if (valorFinal > 500) {
                    parcelasMaximas = 6;
                    juros = 0;
                    System.out.println("Pagamento: Até 6x sem juros");
                } else if (valorFinal > 200) {
                    parcelasMaximas = 3;
                    juros = 0;
                    System.out.println("Pagamento: Até 3x sem juros");
                } else {
                    parcelasMaximas = 12;
                    juros = 1.99;
                    System.out.println("Pagamento: Até 12x com juros de 1,99% ao mês");
                }
            } else if (metodoPagamento.equals("BOLETO") || metodoPagamento.equals("PIX")) {
                // ESTRUTURA 7: Uso de operador lógico OR (||) para condição múltipla
                // Uso real: Combinar condições relacionadas em uma única verificação
                System.out.println("Pagamento à vista - Sem parcelamento");
                
                // ESTRUTURA 8: Atribuição condicional usando operador ternário
                // Uso real: Aplicação rápida de descontos adicionais para pagamentos específicos
                double descontoPagamento = metodoPagamento.equals("PIX") ? valorFinal * 0.05 : valorFinal * 0.03;
                System.out.printf("Desconto adicional por forma de pagamento: R$ %.2f\n", descontoPagamento);
                
                valorFinal -= descontoPagamento;
            } else if (metodoPagamento.equals("DEBITO")) {
                System.out.println("Pagamento: Débito - Pagamento à vista");
            } else {
                System.out.println("Método de pagamento não reconhecido");
            }
            
            // ESTRUTURA 9: Uso de expressão lógica complexa para determinar prazo de entrega
            // Uso real: Sistemas logísticos estimam prazos com base em múltiplos fatores
            int prazoEntrega;
            if ((regiao.equals("SUL") || regiao.equals("SUDESTE")) && quantidade <= 5) {
                prazoEntrega = 3;
            } else if ((regiao.equals("SUL") || regiao.equals("SUDESTE")) && quantidade > 5) {
                prazoEntrega = 5;
            } else if (regiao.equals("CENTRO")) {
                prazoEntrega = 7;
            } else {
                prazoEntrega = 10;
            }
            
            // Resumo da compra
            System.out.println("\n===== RESUMO DA COMPRA =====");
            System.out.println("Produto: " + nomeProduto);
            System.out.println("Quantidade: " + quantidade + " unidade(s)");
            System.out.printf("Valor bruto: R$ %.2f\n", valorBruto);
            System.out.printf("Descontos: R$ %.2f\n", (valorDesconto + descontoCupom));
            System.out.printf("Frete: R$ %.2f\n", taxaFrete);
            System.out.printf("Valor final: R$ %.2f\n", valorFinal);
            System.out.println("Prazo de entrega estimado: " + prazoEntrega + " dias úteis");
            
            // ESTRUTURA 10: Condição final de satisfação do cliente
            // Uso real: Sistemas inteligentes identificam boas oportunidades para upsell
            // ou mensagens personalizadas com base em análise de valor
            if (valorFinal > 1000) {
                System.out.println("\nParabéns! Você atingiu o status CLIENTE PREMIUM nesta compra.");
                System.out.println("Seu próximo pedido terá 10% de desconto adicional usando o cupom PREMIUM10");
            } else if (valorBruto - valorFinal > 100) {
                System.out.println("\nÓtima compra! Você economizou R$ " + 
                                   String.format("%.2f", (valorBruto - valorFinal + taxaFrete)));
            }
            
        } else {
            // Produto sem estoque suficiente
            System.out.println("\nAtenção: Quantidade solicitada indisponível!");
            System.out.println("Estoque atual: " + estoqueDisponivel + " unidades");
            
            // ESTRUTURA 11: Condição para recomendação inteligente
            // Uso real: Sistemas de e-commerce oferecem alternativas para evitar 
            // abandono de carrinho quando produto desejado não está disponível
            if (estoqueDisponivel > 0) {
                System.out.println("Recomendação: Você pode adquirir até " + estoqueDisponivel + 
                                  " unidades agora, ou aguardar reposição de estoque.");
                
                // ESTRUTURA 12: Pergunta condicional de interesse em lista de espera
                System.out.print("Deseja entrar na lista de espera para o restante? (S/N): ");
                String resposta = scanner.nextLine();
                
                if (resposta.equalsIgnoreCase("S")) {
                    System.out.println("Você foi adicionado à lista de espera para " +
                                      (quantidade - estoqueDisponivel) + " unidades adicionais.");
                    System.out.println("Você receberá um e-mail quando o produto estiver disponível.");
                }
            } else {
                System.out.println("Produto temporariamente esgotado.");
                System.out.println("Recomendação: Adicione à sua lista de desejos para ser notificado quando estiver disponível.");
            }
        }
        
        System.out.println("\nObrigado por comprar na Tech Store!");
        scanner.close();
    }
}