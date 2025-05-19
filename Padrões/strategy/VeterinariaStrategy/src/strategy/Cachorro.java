package strategy;

public class Cachorro implements Castracao{
    @Override
    public void castracao(double precoCastracao) {
        precoCastracao = 250;
        System.out.println("Valor da castração do seu cachorro: " + precoCastracao);
    }
}
