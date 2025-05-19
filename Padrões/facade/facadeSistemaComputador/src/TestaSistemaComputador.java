import java.util.Scanner;

public class TestaSistemaComputador {

    public static void main(String[] args) {
        SistemaComputador sistemaComputador = new SistemaComputador();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para ligar o sistema de computador ou 2 para desligar:");
        int input = scanner.nextInt();
        if (input == 1) {
            sistemaComputador.ligar();
        } else if (input == 2) {
            sistemaComputador.desligar();
        } else {
            System.out.println("Entrada inválida");
        }
    }

}