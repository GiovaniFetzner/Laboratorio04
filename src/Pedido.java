import java.util.ArrayList;

public class Pedido {
    ArrayList<ItensPedido> itensPedidos;

    public ArrayList<ItensPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(ArrayList<ItensPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }

    public Produto pedido(Produto produto){
        Cardapio cardapio = new Cardapio();
        for (Produto produto1: cardapio.getProdutos()) {
            if (produto == produto1){
                return produto;
            }
        }
        return null;
    }
}
