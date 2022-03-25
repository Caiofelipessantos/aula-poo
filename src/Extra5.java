import javax.swing.*;

public class Extra5 {
    public static void main(String[] args) {
        double res = 0;
        double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base"));
        double exp = Double.parseDouble(JOptionPane.showInputDialog("Informe o expoente"));

        res = calcularPotencia(base, exp);

        JOptionPane.showMessageDialog(null, (int) base + "^" + (int) exp + " = " + (int) res);
    }

    public static double calcularPotencia(double base, double exp) {
        return Math.pow(base, exp);
    }
}
