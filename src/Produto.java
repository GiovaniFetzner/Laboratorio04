public class Produto {
    private String nome;
    private double valor;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private Categoria categoria;

    public Produto(String nome, double valor, int id, Categoria categoria) {
        this.nome = nome;
        this.valor = valor;
        this.id = id;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
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

    @Override
    public String toString() {
        return
                id + "  " +
                nome + '\'' +
                ", valor R$ " + valor;
    }
}
