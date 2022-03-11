import javax.swing.*;
import java.util.Locale;

public class Prog05 {
    public static void main(String[] args) {
        String texto = "Programação Orientada a Objetos";
        String texto2 = texto.replace("Orientada a Objetos", "OO");
        String msg = "";

        msg = "Tamanho: " + texto.length() + "\n"
                + "Maiúsculo: " + texto.toUpperCase() + "\n"
                + "Posição de \"Orientada\": " + texto.indexOf("Orientada") + "\n"
                + "Nova String: " + texto2;

        JOptionPane.showMessageDialog(null, msg, "Fim do programa", 1);
    }
}
