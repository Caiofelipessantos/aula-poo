import javax.swing.*;

public class Prog02 {
    public static void main(String[] args) {
        Float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
        Float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
        Float media = (n1 + n2) / 2;
        String resultado = media > 6 ? "Você foi aprovado!\n" : "Você foi reprovado.\n";

        JOptionPane.showMessageDialog(
                null,
                "O valor da média é " + media + "\n" + resultado,
                "Resultado", 1);
    }
}
