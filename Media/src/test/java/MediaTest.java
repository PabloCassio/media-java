import org.junit.jupiter.api.Test;

import Media.Media;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

public class MediaTest {

    @Test
    public void testCalcularMedia() {
        Media media = new Media();

        // Teste com números inteiros
        double resultado1 = media.calcularMedia(10, 20);
        assertEquals(15, resultado1);

        // Teste com números decimais
        double resultado2 = media.calcularMedia(7.5, 3.2);
        assertEquals(5.35, resultado2);
    }

    @Test
    public void testLerNumero() {
        Media media = new Media();

        // Teste com número inteiro válido
        double numero1 = 15;
        double resultado1 = media.lerNumero(new Scanner("15\n"), "Digite um número: ");
        assertEquals(numero1, resultado1);

        // Teste com número decimal válido
        double numero2 = 3.5;
        double resultado2 = media.lerNumero(new Scanner("3.5\n"), "Digite um número: ");
        assertEquals(numero2, resultado2);

        // Teste com entrada inválida (letra)
        double resultado3 = media.lerNumero(new Scanner("abc\n1\n"), "Digite um número: ");
        assertEquals(1, resultado3);

        // Teste com entrada inválida (vazio)
        double resultado4 = media.lerNumero(new Scanner("\n\n-10\n"), "Digite um número: ");
        assertEquals(-10, resultado4);
    }
}
