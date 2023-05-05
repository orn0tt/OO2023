package aula2exercicios;

import java.io.IOException;

public class CLS {
    public static void limpar(String... arg) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}