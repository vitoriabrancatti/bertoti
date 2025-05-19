public class TesteMVC {
    public static void main(String[] args) {
        // Criando estratégia de contagem
        ContadorTarefas estrategia = new ContadorTarefasTexto();

        // Criando sujeito
        SujeitoTarefas sujeito = new SujeitoTarefas();
        sujeito.setEstrategiaContagem(estrategia);

        // Criando observador
        ObservadorTarefas observador = totalTarefasTexto -> System.out.println("Total de tarefas de texto: " + totalTarefasTexto);
        sujeito.adicionarObservador(observador);

        // Adicionando tarefas ao sujeito
        sujeito.adicionarTarefa(new TarefaTexto());
        sujeito.adicionarTarefa(new TarefaImagem());
        sujeito.adicionarTarefa(new TarefaTexto());

        // Realizando as tarefas
        sujeito.realizarTarefas();
    }
}