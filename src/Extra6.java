import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Extra6 {
    public static void main(String[] args) {
        Integer numLines = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas a serem puladas"));
        JOptionPane.showMessageDialog(
                null,
                "Início da mensagem..." + Skip(numLines) + "Fim da mensagem."
        );
    }

    public static String Skip(Integer numberOfLines) {
        String lines = "";
        int count = 0;
        while (count < numberOfLines) {
            lines += "\n";
            count++;
        }
        return lines;
    }
}
