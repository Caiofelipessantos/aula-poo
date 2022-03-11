import javax.swing.*;
import java.util.Locale;

public class Prog14 {
    public static void main(String[] args) {
        int x = 0, y = 0;
        String continua = "sim";

        while (continua.equalsIgnoreCase("sim")) {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro valor"));
            y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo valor"));

            JOptionPane.showInputDialog(
                    null,
                    x + " + " + y + " = " + (x + y) + "\nContinuar programa?",
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
