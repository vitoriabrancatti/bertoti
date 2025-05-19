package strategy;

public class Veterinaria {

    private String nomeAnimal;
    private String especie;
    private Castracao castracao;

    private Double precoCastracao = (double) 0;

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }


    public Castracao getCastracao() {
        return castracao;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Double getPrecoCastracao() {
        return precoCastracao;
    }

    public void setPrecoCastracao(Double precoCastracao) {
        this.precoCastracao = precoCastracao;
    }

    public void setCastracao(Castracao castracao) {
        this.castracao = castracao;
    }

    public void valorCastracao() {
        castracao.castracao(precoCastracao);
    }

}