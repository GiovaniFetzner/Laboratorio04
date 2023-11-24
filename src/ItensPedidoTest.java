import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ItensPedidoTest {

    private ItensPedido pedido;
    public ItensPedidoTest() {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Fruki", 5.0, 10, Categoria.Bebida));
        produtos.add(new Produto("Coca", 5.0, 11, Categoria.Bebida));
        produtos.add(new Produto("Xis Frango", 15.99, 20, Categoria.Sanduiche));

        pedido = new ItensPedido("Giovani", produtos);
    }

    @Test
    void getTotal() {
        assertEquals(25.99,pedido.getTotal(),0.1);
    }
}