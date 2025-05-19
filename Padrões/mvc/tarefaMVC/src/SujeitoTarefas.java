import java.util.ArrayList;
import java.util.List;

public class SujeitoTarefas {
    private ContadorTarefas estrategiaContagem;
    private List<Tarefa> tarefas = new ArrayList<>();
    private List<ObservadorTarefas> observadores = new ArrayList<>();

    public void setEstrategiaContagem(ContadorTarefas estrategiaContagem) {
        this.estrategiaContagem = estrategiaContagem;
    }

    public void adicionarObservador(ObservadorTarefas observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorTarefas observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        int totalTarefasTexto = estrategiaContagem.contarTarefas(tarefas);
        for (ObservadorTarefas observador : observadores) {
            observador.atualizar(totalTarefasTexto);
        }
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        notificarObservadores();
    }

    public void realizarTarefas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.realizar();
        }
    }
}
