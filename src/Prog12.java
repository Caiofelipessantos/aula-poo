import javax.swing.*;

public class Prog12 {
    public static void main(String[] args) {
        int num = 0;
        String msg = "";

        num = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o número final da contagem",
                "Contagem de números",
                JOptionPane.QUESTION_MESSAGE
        ));

        for (int i = 1; i <= num; i++) {
            msg += i + " ";
            //Quebra de linha a cada 20 números
            if (i % 20 == 0) {
                msg += "\n";
            }
        }

        JOptionPane.showMessageDialog(null,
                msg,
                "Contando até " + num,
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
