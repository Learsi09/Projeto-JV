import java.util.Scanner;

    public class LojaPerfumes {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("Bem-vindo à Loja de Perfumes!");
                System.out.println("Escolha uma opção:");
                System.out.println("1. Comprar produto");
                System.out.println("2. Sobre meu pedido");
                System.out.println("3. Trocar produto");
                System.out.println("4. Pedido não entregue");
                System.out.println("5. Pagamento do pedido");
                System.out.println("6. Cancelar compra");
                System.out.println("7. Voltar ao menu principal");

                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer do scanner

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o nome do produto:");
                        String nomeProduto = scanner.nextLine();
                        System.out.println("Digite a quantidade que deseja comprar:");
                        int quantidade = scanner.nextInt();
                        System.out.println("Você comprou " + quantidade + " " + nomeProduto);
                        break;
                    case 2:
                        System.out.println("Seu pedido está a caminho ou já recebeu o produto?");
                        String statusPedido = scanner.nextLine();
                        // Lógica para verificar o status do pedido
                        break;
                    case 3:
                        System.out.println("Qual produto você deseja trocar?");
                        String produtoAntigo = scanner.nextLine();
                        System.out.println("Qual produto você deseja para a troca?");
                        String novoProduto = scanner.nextLine();
                        // Lógica para troca de produto
                        break;
                    case 4:
                        System.out.println("Seu pedido não foi entregue. Deseja cancelar a compra? (sim/não)");
                        String cancelarPedido = scanner.nextLine();
                        if (cancelarPedido.equalsIgnoreCase("sim")) {
                            System.out.println("Compra cancelada. Motivo: não recebimento do pedido.");
                        } else {
                            System.out.println("Por favor, aguarde mais um pouco pela entrega.");
                        }
                        break;
                    case 5:
                        System.out.println("Escolha a forma de pagamento:");
                        System.out.println("1. Pix");
                        System.out.println("2. Cartão");
                        System.out.println("3. Boleto");
                        int formaPagamento = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer do scanner

                        switch (formaPagamento) {
                            case 1:
                                System.out.println("Pagamento via Pix. Gere um QR Code para o pagamento.");
                                break;
                            case 2:
                                System.out.println("Digite os últimos 4 dígitos do cartão:");
                                String ultimosDigitosCartao = scanner.nextLine();
                                System.out.println("Pagamento via cartão com os últimos 4 dígitos: " + ultimosDigitosCartao);
                                break;
                            case 3:
                                System.out.println("Pagamento via boleto. Gerando código de barras...");
                                break;
                            default:
                                System.out.println("Opção de pagamento inválida.");
                                break;
                        }
                        break;
                    case 6:
                        System.out.println("Qual o motivo do cancelamento?");
                        String motivoCancelamento = scanner.nextLine();
                        System.out.println("Sentimos muito pelo ocorrido. Esperamos que compre novamente!");
                        break;
                    case 7:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }

                System.out.println("---------------------------------------------");
            }

            scanner.close();
        }
    }
