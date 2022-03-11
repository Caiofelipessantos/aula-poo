package com.homeworks;

import javax.swing.JOptionPane;

public class Home4 {  
    public static void main(String[] args) {
        String idade, doses;
        String msgErro = "Por favor, digite um valor válido.";
        short i, d;

        do {
            idade = JOptionPane.showInputDialog(null, "Informe a sua idade.");
            i = Short.parseShort(idade);
            if (i < 0) {
                JOptionPane.showMessageDialog(null, msgErro, "Erro", 2);
            }
        } while (i < 0);

        if (i < 18) {
            JOptionPane.showMessageDialog(null, "Você não tem idade para entrar na festa.", "Entrada não permitida", 0);
        } else {
            do {
                doses = JOptionPane.showInputDialog(null, "Informe o número de doses de vacina tomadas.");
                d = Short.parseShort(doses);
                if (d < 0) {
                    JOptionPane.showMessageDialog(null, msgErro, "Erro", 2);
                }
            } while (d < 0);        

            if (d < 3) {
                JOptionPane.showMessageDialog(null, "Você não está totalmente imnunizado.", "Entrada não permitida", 0);
            } else {
                JOptionPane.showMessageDialog(null, "Você pode participar da festa!", "Tudo OK!", 1);
            }
        }   
    }
    
}
