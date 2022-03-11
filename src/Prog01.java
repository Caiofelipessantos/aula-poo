import javax.swing.*;
import java.util.Scanner;

public class Prog01 {
    public static void main(String[] args) {
//        Scanner name = new Scanner(System.in);
//        System.out.print("Digite o seu nome: ");
//        String n = name.next();
//        System.out.println("Olá " + n);

        String newName = JOptionPane.showInputDialog("Digite o seu nome: ");
        JOptionPane.showMessageDialog(
                null,
                "Olá " + newName,
                "Saudações!",
                1
        );
    }
}
