import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Produtos> pedidos = new LinkedList<>();
        LinkedList<Produtos> ultimosPedidos = new LinkedList<>();

        Bebida b1 = new Bebida("Coca-Cola Zero",3.50);
        Bebida b2 = new Bebida("Coca-Cola",3.25);
        Bebida b3 = new Bebida("Fruki",2.25);
        Bebida b4 = new Bebida("Fruki Cola",3.00);
        Bebida b5 = new Bebida("Pepsi",3.50);
        Bebida b6 = new Bebida("Pepsi Black",3.75);

        Sanduiche s1 = new Sanduiche("Frango Teriaki",27.80);
        Sanduiche s2 = new Sanduiche("Carne Defumada",38.45);
        Sanduiche s3 = new Sanduiche("Salmão com Cream Chesse",45.25);
        Sanduiche s4 = new Sanduiche("Vegano",50.99);

        boolean operacao = true;

        System.out.println("Bem vindo ao *Sua Felicidado no Meio do Pão*");

        while (operacao){
            Scanner leitura = new Scanner(System.in);
            System.out.println("\nMenu da Operação\n1. Cardapio\n2. Menu Pedido\n3. Mostrar Fila\n4. Entrgar\n5. Ultímas Entregas\n6. Sair");
            int opcao = leitura.nextInt();
            switch (opcao){
                case 1:
                    mostrarBebidas(b1, b2, b3, b4, b5, b6);
                    System.out.println("__________________________");
                    mostrarSanduiches(s1, s2, s3, s4);
                    break;
                case 2:
                    System.out.println("Menu de pedido\n1.Adicionar Sanduiche\n2.Adicionar Bebida\n3.Sair");
                    int opcaoPedido = leitura.nextInt();
                    subMenuPedidos(opcaoPedido);

                    Produtos novoPedido = new Produtos();

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

    private static void subMenuPedidos(int opcaoPedido) {
        //System.out.println("Menu de pedido\n1.Adicionar Sanduiche\n2.Adicionar Bebida\n3.Sair");
        switch (opcaoPedido){
            case 1:
                //mostrarSanduiches(s1,s2,s3,s4);
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Opção incorreta, tente novamente");
                break;
        }
    }

    private static void mostrarSanduiches(Sanduiche s1, Sanduiche s2, Sanduiche s3, Sanduiche s4) {
        System.out.println("*SANDUÍCHES*");
        System.out.println("7. " + s1.getNome() + "------------ R$ " + s1.getValor());
        System.out.println("8. " + s2.getNome() + "------------ R$ " + s2.getValor());
        System.out.println("9. " + s3.getNome() + "------------ R$ " + s3.getValor());
        System.out.println("10. " + s4.getNome() + "------------ R$ " + s4.getValor());
    }

    private static void mostrarBebidas(Bebida b1, Bebida b2, Bebida b3, Bebida b4, Bebida b5, Bebida b6) {
        System.out.println("*BEBIDAS*");
        System.out.println("1. " + b1.getNome() + "------------ R$ " + b1.getValor());
        System.out.println("2. " + b2.getNome() + "------------ R$ " + b2.getValor());
        System.out.println("3. " + b3.getNome() + "------------ R$ " + b3.getValor());
        System.out.println("4. " + b4.getNome() + "------------ R$ " + b4.getValor());
        System.out.println("5. " + b5.getNome() + "------------ R$ " + b5.getValor());
        System.out.println("6. " + b6.getNome() + "------------ R$ " + b6.getValor());
    }
}