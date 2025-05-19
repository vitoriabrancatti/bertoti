import java.util.ArrayList;
import java.util.List;

public class ListaTarefas implements Tarefa {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public void realizar() {
        System.out.println("Realizando lista de tarefas:");
        for (Tarefa tarefa : tarefas) {
            tarefa.realizar();
        }
    }
}
