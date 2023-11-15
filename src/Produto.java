public class Produto {
    private String nome;
    private int valor;
    private Categoria categoria;

    public Produto(String nome, int valor, Categoria categoria) {
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
