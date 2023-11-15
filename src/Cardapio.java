import java.util.ArrayList;
import java.util.Arrays;

public class Cardapio {
    private ArrayList <Bebida> bebidas;
    private ArrayList <Sanduiche> sanduiches;
    private Produto[] produtos;

    private double total;

    public Cardapio() {
        this.bebidas = bebidas;
        this.sanduiches = sanduiches;
    }

    public Cardapio(Produto[] produtos) {
        this.produtos = produtos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public ArrayList<Sanduiche> getSanduiches() {
        return sanduiches;
    }

    public void adicionarBebida(Bebida bebida){
        bebidas.add(bebida);
    }
    public void adicionarSanduiche(Sanduiche sanduiche){
        sanduiches.add(sanduiche);
    }

    public double total(){
        total = 0;

        for (Bebida bebida: bebidas) {
            total += bebida.getValor();
        }

        for (Sanduiche sanduiche: sanduiches) {
            total += sanduiche.getValor();
        }

        return total;
    }

}