import javax.swing.*;

public class Prog13 {
    public static void main(String[] args) {
        int num = 0, i = 1;
        String msg = "";

        num = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o número final da contagem",
                "Contagem de números",
                JOptionPane.QUESTION_MESSAGE
        ));

        //Estrutura de Repetição 'while'
        while (i <= num) {
            msg += i + " ";
            if (i % 20 == 0) { msg += "\n"; }
            i++;
        }

        JOptionPane.showMessageDialog(null,
                msg,
                "Contando até " + num,
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
