import java.util.List;

public class ContadorTarefasTexto implements ContadorTarefas {
    public int contarTarefas(List<Tarefa> tarefas) {
        int contador = 0;
        for (Tarefa tarefa : tarefas) {
            if (tarefa instanceof TarefaTexto) {
                contador++;
            }
        }
        return contador;
    }
}