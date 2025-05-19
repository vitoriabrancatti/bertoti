public class Veterinario implements Observer {
    private String nome;
    private String ultimaMensagem;

    public Veterinario(String nome) {
        this.nome = nome;
    }

    public void atualizar(String mensagem) {
        ultimaMensagem = mensagem;
        mostrar();
    }

    public void mostrar() {
        System.out.println("Veterinário: " + nome + ", última mensagem: " + ultimaMensagem);
    }
}