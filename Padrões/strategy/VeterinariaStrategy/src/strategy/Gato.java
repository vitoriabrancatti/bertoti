package strategy;

public class Gato implements Castracao{
    @Override
    public void castracao(double precoCastracao) {
        precoCastracao = 150;
        System.out.println("Valor da castração do seu gato: " + precoCastracao);
    }
}
