public class TestaSistemaVeterinario {
    public static void main(String[] args) {
        SistemaVeterinario sistema = new SistemaVeterinario();

        Veterinario veterinario1 = new Veterinario("Dr. Smith");
        Veterinario veterinario2 = new Veterinario("Dr. Johnson");
        Paciente paciente1 = new Paciente("Fido");
        Paciente paciente2 = new Paciente("Whiskers");

        sistema.adicionarObservador(veterinario1);
        sistema.adicionarObservador(veterinario2);

        sistema.adicionarPaciente(paciente1);

        sistema.novaMensagem("Nova mensagem: Skie está doente");

        sistema.adicionarPaciente(paciente2);

        sistema.novaMensagem("Nova mensagem: Tomate precisa de cuidados");

        sistema.removerObservador(veterinario1);
        sistema.removerPaciente(paciente1);

        sistema.novaMensagem("Nova mensagem: Fido está Skie, mas Tomate precisa de atenção");
    }
}