public class SistemaComputador {
    private CPU cpu;
    private GPU gpu;
    private Memoria memoria;

    public SistemaComputador() {
        cpu = new CPU();
        gpu = new GPU();
        memoria = new Memoria();
    }

    public void ligar() {
        cpu.ligar();
        gpu.ligar();
        memoria.carregar();
        System.out.println("Sistema de computador ligado");
    }

    public void desligar() {
        cpu.desligar();
        gpu.desligar();
        memoria.descarregar();
        System.out.println("Sistema de computador desligado");
    }
}