import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String idade, doses, msgError = "Valor inválido.";
        short i, d;

        idade = JOptionPane.showInputDialog(null, "Informe a sua idade.");
        if (!isAShortValue(idade)) {
            JOptionPane.showMessageDialog(null, msgError, "Erro", 0);
            System.exit(1); //Para o programa
        } else {
            i = Short.parseShort(idade);
            if (i < 0) {
                JOptionPane.showMessageDialog(null, "Idade precisa ser um número positivo.", "Erro", 1);
            } else if (i < 18) {
                JOptionPane.showMessageDialog(null, "Você não tem idade para entrar na festa.", "Entrada não permitida", 0);
            } else {
                doses = JOptionPane.showInputDialog(null, "Informe o número de doses de vacina tomadas.");
                if (!isAShortValue(doses)) {
                    JOptionPane.showMessageDialog(null, msgError, "Erro", 1);
                } else {
                    d = Short.parseShort(doses);
                    if (d < 3) {
                        JOptionPane.showMessageDialog(null, "Você não está totalmente imnunizado.", "Entrada não permitida", 0);
                    } else {
                        JOptionPane.showMessageDialog(null, "Você pode participar da festa!", "Tudo OK!", 1);
                    }
                }
            }
        }
    }

    public static boolean isAShortValue(String num) {
        if (num == null) {
            return false;
        } 
        try {
            short s = Short.parseShort(num);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
