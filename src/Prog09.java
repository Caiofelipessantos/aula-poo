import javax.swing.*;

public class Prog09 {
    public static void main(String[] args) {
        byte d;
        String titulo = "Atenção";

        d = Byte.parseByte(
                JOptionPane.showInputDialog(null,
                        "Informe o dia da semana: \n0 - Domingo\n1 - Segunda\n2 - Terça\n3 - Quarta\n4 - Quinta\n5 - Sexta\n6 - Sábado",
                        "Dias da Semana",
                        JOptionPane.QUESTION_MESSAGE
                )
        );

        //Estrutura de decisão simples
        if (d < 0 || d > 6) {
            JOptionPane.showMessageDialog(null, "Valor inválido", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (d == 0) {
                JOptionPane.showMessageDialog(null, "Domingo", titulo, JOptionPane.INFORMATION_MESSAGE);
            }
            if (d == 1) {
                JOptionPane.showMessageDialog(null, "Segunda-Feira", titulo, JOptionPane.INFORMATION_MESSAGE);
            }
            if (d == 2) {
                JOptionPane.showMessageDialog(null, "Terça-Feira", titulo, JOptionPane.INFORMATION_MESSAGE);
            }
            if (d == 3) {
                JOptionPane.showMessageDialog(null, "Quarta-Feira", titulo, JOptionPane.INFORMATION_MESSAGE);
            }
            if (d == 4) {
                JOptionPane.showMessageDialog(null, "Quinta-Feira", titulo, JOptionPane.INFORMATION_MESSAGE);
            }
            if (d == 5) {
                JOptionPane.showMessageDialog(null, "Sexta-Feira", titulo, JOptionPane.INFORMATION_MESSAGE);
            }
            if (d == 6) {
                JOptionPane.showMessageDialog(null, "Sábado", titulo, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
