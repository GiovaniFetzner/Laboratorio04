import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CardapioTest {
    private Cardapio cardapio;
    private ArrayList<Produto> produtos;
    private Produto bebida, sanduiche;
    CardapioTest(){
        produtos = new ArrayList<Produto>();
        bebida = new Produto("Coca-Cola Zero",3.50,01, Categoria.Bebida);
        sanduiche = new Produto("Vegano",50.99,23, Categoria.Sanduiche);
        produtos.add(bebida);
        produtos.add(sanduiche);
        cardapio = new Cardapio(produtos);
    }
    @Test
    void getListaProdutos() {
        ArrayList<Produto> listaBebidas = cardapio.getListaProdutos(Categoria.Bebida);
        assertTrue(listaBebidas.contains(bebida));
        assertFalse(listaBebidas.contains(sanduiche));
        ArrayList<Produto> listaSanduiches = cardapio.getListaProdutos(Categoria.Sanduiche);
        assertTrue(listaSanduiches.contains(sanduiche));
        assertFalse(listaSanduiches.contains(bebida));
    }

    @Test
    void encontrarProduto() {
        assertEquals(sanduiche,cardapio.encontrarProduto(23));
        assertEquals(bebida,cardapio.encontrarProduto(01));
    }
    @Test
    void encontrarProdutoInexistente() {
        assertNull((Object) cardapio.encontrarProduto(9999));
    }
}