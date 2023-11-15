import java.util.ArrayList;

public class Cardapio {
    private ArrayList <Bebida> bebidas;
    private ArrayList <Sanduiche> sanduiches;
    private ArrayList<Produto> produtos;

    private double total;

    public Cardapio() {
        this.bebidas = bebidas;
        this.sanduiches = sanduiches;
    }

    public Cardapio(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<Produto> getListaProdutos(Categoria categoria) {
        ArrayList<Produto> lista = new ArrayList<>();
        for (Produto produto: produtos){
            if (produto.getCategoria() == Categoria.Bebida){
                lista.add(produto);
            }
        }
        return lista;
    }

    public ArrayList<Sanduiche> getSanduiches() {
        return sanduiches;
    }

    public double total(){
        total = 0;
        for (Produto produto: produtos) {
            total += produto.getValor();
        }
        return total;
    }

}
