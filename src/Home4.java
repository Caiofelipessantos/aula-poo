import javax.swing.JOptionPane;

public class Home4 {
    public static void main(String[] args) {
        String idade, doses;
        short i, d;

        idade = JOptionPane.showInputDialog(null, "Informe a sua idade.");
        if (!isAShortValue(idade)) {
            JOptionPane.showMessageDialog(null, "Valor inválido", "Erro", 1);
            System.exit(1);
        }

        doses = JOptionPane.showInputDialog(null, "Informe o número de doses de vacina tomadas.");
        d = Short.parseShort(doses);
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
