package strategy;

public class Teste {

    public static void main(String[] args) {

        Veterinaria castracao = new Veterinaria();

        castracao.setCastracao(new Cachorro());
        castracao.valorCastracao();

        castracao.setCastracao(new Gato());
        castracao.valorCastracao();

    }

}