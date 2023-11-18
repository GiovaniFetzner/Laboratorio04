import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<ItensPedido> pedidos = new LinkedList<>();
        LinkedList<ItensPedido> ultimosPedidos = new LinkedList<>();
        Cardapio cardapio = new Cardapio();

        boolean operacao = true;

        System.out.println("Bem vindo ao *Sua Felicidado no Meio do Pão*");

        while (operacao){
            Scanner leitura = new Scanner(System.in);
            System.out.println("\n" +
                    "Menu da Operação\n" +
                    "1. Cardapio\n" +
                    "2. Menu Pedido\n" +
                    "3. Mostrar Fila\n" +
                    "4. Entregar\n" +
                    "5. Ultímas Entregas\n" +
                    "6. Sair");
            int opcao = leitura.nextInt();
            switch (opcao){
                case 1: // Apresentar cardápio
                    System.out.println(cardapio.getListaProdutos(Categoria.Bebida));
                    System.out.println("__________________________");
                    System.out.println(cardapio.getListaProdutos(Categoria.Sanduiche));
                    break;
                case 2: // Apresentar Menu
                    /*System.out.println("Menu de pedido\n" +
                            "1.Adicionar Sanduiche\n" +
                            "2.Adicionar Bebida\n" +
                            "3.Sair");*/
                    //int opcaoPedido = leitura.nextInt();
                    if (subMenuPedidos(cardapio)!= null)
                        //pedidos.add(subMenuPedidos(cardapio));

                    break;
                case 3:
                    for (int i = 0; i < pedidos.size(); i++) {
                        System.out.println("Pedido + " + (i+1));
                        System.out.println(pedidos.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Último pedido entregue !!!");
                    ultimosPedidos.addFirst(pedidos.getFirst());
                    pedidos.removeFirst();
                    for (int i = 0; i < pedidos.size(); i++) {
                        System.out.println("Pedido + " + (i+1));
                        System.out.println(pedidos.get(i));
                    }
                    break;
                case 5:
                    for (int i = 0; i < ultimosPedidos.size(); i++) {
                        System.out.println("Pedido + " + (i+1));
                        System.out.println(ultimosPedidos.get(i));
                    }
                    break;
                case 6:
                    System.out.println("\nOperação Finalizada.");
                    operacao = false;
                    break;
                default:
                    System.out.println("\nOpção invalida.\nTente Novamente.");
                    break;
            }


        }



    }

    private ItensPedido subMenuPedidos(Cardapio cardapio) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);
        int id;
        boolean sair = true;

        System.out.println("Informe o nome do responsável pelo pedido:");
        String nome = leitura.nextLine();
        while (sair){
            System.out.println("Menu de pedido\n" +
                    "1.Adicionar Sanduiche\n" +
                    "2.Adicionar Bebida\n" +
                    "3.Sair");
            int opcaoPedido = leitura.nextInt();
            switch (opcaoPedido){
                case 1:
                    System.out.println(cardapio.getListaProdutos(Categoria.Sanduiche));
                    System.out.println("Informe o id do sanduíche desejado");
                    id = leitura.nextInt();
                    produtos.add(cardapio.encontrarProduto(id));
                    break;
                case 2:
                    System.out.println("Inform o id da bebida desejada");
                    System.out.println(cardapio.getListaProdutos(Categoria.Bebida));
                    id = leitura.nextInt();
                    produtos.add(cardapio.encontrarProduto(id));
                    break;
                case 3:
                    sair = false;
                    break;
                default:
                    System.out.println("Opção incorreta, tente novamente");
                    break;
            }
        }
        return (new ItensPedido(nome,produtos));
    }

}