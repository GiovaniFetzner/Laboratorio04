import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    private Pedido pedido;
    LinkedList<ItensPedido> itensPedidos;
    LinkedList<ItensPedido> ultimosPedidos;

    PedidoTest(){
        itensPedidos = new LinkedList<>();
        ultimosPedidos = new LinkedList<>();
        pedido = new Pedido();
        pedido.setUltimosPedidos(ultimosPedidos);
        pedido.setItensPedidos(itensPedidos);
    }

    @Test
    void entregarPedidoComItens() {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Coca-Cola Zero",3.50,01, Categoria.Bebida));
        String nome = "Giovani";
        ItensPedido carrinho = new ItensPedido(nome,produtos);
        assertTrue(itensPedidos.isEmpty());  // Verifica se a lista de pedidos está vazia
        assertTrue(ultimosPedidos.isEmpty()); // Verifica se não possui últimas entregas
        itensPedidos.add(carrinho);            // Adiciona manualmente o pedido na lista (Função realizada pelo subMenu)
        assertTrue(pedido.entregarPedido());            // Entrega o pedido "carrinho";

        assertFalse(itensPedidos.contains(carrinho));
        assertTrue(ultimosPedidos.contains(carrinho));
    }
    @Test
    void entregarPedidoListasVazia() {  //Teste realizado sem pedidos e sem últimas entregas
        assertTrue(itensPedidos.isEmpty());
        assertTrue(ultimosPedidos.isEmpty());
        assertFalse(pedido.entregarPedido());
    }

    @Test
    void mostrarFilaComItens() {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Coca-Cola Zero",3.50,01, Categoria.Bebida));
        String nome = "Giovani";
        ItensPedido carrinho = new ItensPedido(nome,produtos);
        itensPedidos.add(carrinho);
        assertFalse(itensPedidos.isEmpty());
        assertTrue(pedido.mostrarFila());
    }
    @Test
    void mostrarFilaListaVazia() {
        assertTrue(itensPedidos.isEmpty());
        assertFalse(pedido.mostrarFila());
    }

    @Test
    void mostrarEntregasListaVazia() {  // Cenario com nenhum pedido e nenhuma entrega a ser realizada
        assertTrue(itensPedidos.isEmpty());
        assertTrue(ultimosPedidos.isEmpty());
        assertFalse(pedido.mostrarEntregas());
    }
    @Test
    void mostrarEntregasComItens() {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Coca-Cola Zero",3.50,01, Categoria.Bebida));
        String nome = "Giovani";
        ItensPedido carrinho = new ItensPedido(nome,produtos);
        assertTrue(itensPedidos.isEmpty());
        assertTrue(ultimosPedidos.isEmpty());
        itensPedidos.add(carrinho);            // Adiciona manualmente o pedido na lista (Função realizada pelo subMenu)
        assertTrue(pedido.entregarPedido());            // Entrega o pedido "carrinho";

        assertFalse(itensPedidos.contains(carrinho));
        assertTrue(ultimosPedidos.contains(carrinho));
    }

}