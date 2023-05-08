import java.util.Scanner;

import Media.Media;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Media media = new Media();

        double numero1 = media.lerNumero(scanner, "Digite o primeiro número: ");
        double numero2 = media.lerNumero(scanner, "Digite o segundo número: ");

        double resultado = media.calcularMedia(numero1, numero2);

        System.out.println("A média dos números é: " + resultado);

        scanner.close();
    }
}