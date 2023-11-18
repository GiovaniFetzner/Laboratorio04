import java.util.ArrayList;

public class ItensPedido {
    private String nome;
    private ArrayList<Produto> produtos;
    private double total;

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

    public double getTotal() {
        total =0;
        for (Produto produto: produtos) {
            total += produto.getValor();
        }
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\'' +
                ", produtos: " + produtos +
                ", |total| R$ " + getTotal();
    }
}
