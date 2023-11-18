import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Pedido {
    LinkedList<ItensPedido> itensPedidos;
    LinkedList<ItensPedido> ultimosPedidos;

    public Pedido() {
        itensPedidos = new LinkedList<>();
        ultimosPedidos = new LinkedList<>();
    }

    public LinkedList<ItensPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(LinkedList<ItensPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }

    public boolean entregarPedido(){
        if (itensPedidos.isEmpty()){
            System.out.println("Nenhum pedido na lista até o momento");
            return false;
        }
        System.out.println("Último pedido entregue !!!");
        ultimosPedidos.addFirst(itensPedidos.getFirst());
        itensPedidos.removeFirst();
        return true;
    }
    public boolean mostrarFila() {
        for (int i = 0; i < itensPedidos.size(); i++) {
            System.out.println("Pedido " + (i+1));
            System.out.println(itensPedidos.get(i));
        }
        if (!itensPedidos.isEmpty()) return true;
        else{
            System.out.println("Nenhum pedido na lista até o momento");
            return false;
        }
    }public boolean mostrarEntregas() {
        for (int i = 0; i < ultimosPedidos.size(); i++) {
            System.out.println("Pedido " + (i+1));
            System.out.println(ultimosPedidos.get(i));
        }
        if (!ultimosPedidos.isEmpty()) return true;
        else{
            System.out.println("Nenhum pedido entregue até o momento");
            return false;
        }
    }

    public boolean subMenuPedidos(Cardapio cardapio) {
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
        if (!produtos.isEmpty()){
           itensPedidos.add(new ItensPedido(nome,produtos));
           return true;
        }
        return false;
    }
}
