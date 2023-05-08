package Media;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Media {
    public double calcularMedia(double numero1, double numero2) {
        return (numero1 + numero2) / 2;
    }

    public double lerNumero(Scanner scanner, String mensagem) {
        double numero = 0;
        boolean inputValido = false;

        while (!inputValido) {
            try {
                System.out.println(mensagem);
                numero = scanner.nextDouble();
                inputValido = true; // Entrada válida, sair do loop
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Certifique-se de digitar apenas números.");
                scanner.nextLine(); // Limpar o buffer do scanner
            }
        }

        return numero;
    }
}

