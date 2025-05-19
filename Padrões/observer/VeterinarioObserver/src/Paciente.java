public class Paciente implements Observer {
    private String nome;
    private String ultimaMensagem;

    public Paciente(String nome) {
        this.nome = nome;
    }

    public void atualizar(String mensagem) {
        ultimaMensagem = mensagem;
        mostrar();
    }

    public void mostrar() {
        System.out.println("Paciente: " + nome + ", última mensagem: " + ultimaMensagem);
    }

    public void receberMensagem(String mensagem) {
        ultimaMensagem = mensagem;
        mostrar();
    }
}