import java.util.ArrayList;

public class ItensPedido {
    String nome;
    ArrayList<Produto> produtos ;

    public ItensPedido(String nome, ArrayList<Produto> produtos) {
        this.nome = nome;
        this.produtos = produtos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

  /* public Produto pedido(Produto produto){
        Cardapio cardapio = new Cardapio();
       for (Produto produto1: cardapio.getProdutos()) {
           if (produto == produto1){
               return produto;
           }
       }
        return null;
    }*/

}
