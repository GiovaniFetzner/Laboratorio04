public class Produto {
    private String nome;
    private int valor;
    private Categoria categoria;

    public Produto(String nome, int valor, Categoria categoria) {
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
    }
}
