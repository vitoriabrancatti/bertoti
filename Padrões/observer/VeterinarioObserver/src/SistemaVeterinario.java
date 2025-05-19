import java.util.ArrayList;
import java.util.List;

public class SistemaVeterinario implements Subject {
    private List<Observer> veterinarios;
    private List<String> mensagens;
    private List<Paciente> pacientes;

    public SistemaVeterinario() {
        veterinarios = new ArrayList<>();
        mensagens = new ArrayList<>();
        pacientes = new ArrayList<>();
    }

    public void adicionarObservador(Observer observador) {
        veterinarios.add(observador);
    }

    public void removerObservador(Observer observador) {
        veterinarios.remove(observador);
    }

    public void notificarObservadores() {
        for (Observer observador : veterinarios) {
            observador.atualizar(getUltimaMensagem());
        }
    }

    public void novaMensagem(String mensagem) {
        mensagens.add(mensagem);
        notificarObservadores();
    }

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void removerPaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public void notificarPacientes() {
        for (Paciente paciente : pacientes) {
            paciente.receberMensagem(getUltimaMensagem());
        }
    }

    private String getUltimaMensagem() {
        int tamanhoLista = mensagens.size();
        return mensagens.get(tamanhoLista - 1);
    }
}