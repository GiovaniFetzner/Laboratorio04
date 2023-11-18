import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pedido pedidos = new Pedido();
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
                    "5. Últimas Entregas\n" +
                    "6. Sair");
            int opcao = leitura.nextInt();
            switch (opcao){
                case 1: // Apresentar cardápio
                    System.out.println(cardapio.getListaProdutos(Categoria.Bebida));
                    System.out.println("__________________________");
                    System.out.println(cardapio.getListaProdutos(Categoria.Sanduiche));
                    break;
                case 2: // Apresentar Menu
                    pedidos.subMenuPedidos(cardapio);
                    break;
                case 3: //Mostrar Fila
                    pedidos.mostrarFila();
                    break;
                case 4: //Entregar
                    pedidos.entregarPedido();
                    //pedidos.mostrarFila();
                    break;
                case 5: //Últimas Entregas
                    pedidos.mostrarEntregas();
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
}