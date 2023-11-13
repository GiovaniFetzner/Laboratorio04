import java.util.ArrayList;
import java.util.Arrays;

public class Produtos {
    private ArrayList <Bebida> bebidas;
    private ArrayList <Sanduiche> sanduiches;

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

}
