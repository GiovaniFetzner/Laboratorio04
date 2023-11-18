import java.util.ArrayList;

public class Cardapio {
    private ArrayList<Produto> produtos;

    private double total;

    public  Cardapio(){ // Construtor padrão com produtos pré-estabelecidos
        produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Coca-Cola Zero",3.50,01, Categoria.Bebida));
        produtos.add(new Produto("Coca-Cola",3.25,02, Categoria.Bebida));
        produtos.add(new Produto("Fruki",2.25,03, Categoria.Bebida));
        produtos.add(new Produto("Fruki Cola",3.00,04,Categoria.Bebida));
        produtos.add(new Produto("Pepsi",3.50,05, Categoria.Bebida));
        produtos.add(new Produto("Pepsi Black",3.75,06, Categoria.Bebida));

        produtos.add(new Produto("Frango Teriaki",27.80,20, Categoria.Sanduiche));
        produtos.add(new Produto("Carne Defumada",38.45,21, Categoria.Sanduiche));
        produtos.add(new Produto("Salmão com Cream Chesse",45.25,22, Categoria.Sanduiche));
        produtos.add(new Produto("Vegano",50.99,23, Categoria.Sanduiche));
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
            if (produto.getCategoria() == categoria){
                lista.add(produto);
            }
        }
        return lista;
    }

    public double total(){
        total = 0;
        for (Produto produto: produtos) {
            total += produto.getValor();
        }
        return total;
    }

    public Produto encontrarProduto(int id){
        for (Produto produto: produtos)
            if (produto.getId() == id) {
                return produto;
            }
        return null;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
