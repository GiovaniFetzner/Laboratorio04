import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LinkedList<String> pedidos = new LinkedList<>();
        LinkedList<String> pedidosdois = new LinkedList<>();
        pedidos.add("Salame mingue");
        pedidos.add("Sorvete colore");
        pedidos.add("TESTESEESETE");

        System.out.println("Lista:");
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println(pedidos.get(i));;
        }

        System.out.println();
        System.out.println("primeiro " + pedidos.getFirst());
        System.out.println("Ultimo " + pedidos.getLast());
        System.out.println();
        pedidosdois.addFirst(pedidos.getFirst());
        pedidos.removeFirst();
        pedidosdois.addFirst(pedidos.getFirst());

        System.out.println("Lista de próximos pedidos:");
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println(pedidos.get(i));;
        }

        System.out.println();

        System.out.println("Ultimo pedidos entregues:");
        for (int i = 0; i < pedidosdois.size(); i++) {
            System.out.println(pedidosdois.get(i));;
        }
    }
}