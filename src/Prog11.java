import javax.swing.*;

public class Prog11 {
    public static void main(String[] args) {
        byte dia;
        String msg;
        dia = Byte.parseByte(JOptionPane.showInputDialog(
                null,
                "Informe o dia da semana: \n0 - Domingo\n1 - Segunda\n2 - Terça\n3 - Quarta\n4 - Quinta\n5 - Sexta\n6 - Sábado",
                "Dias da Semana",
                JOptionPane.QUESTION_MESSAGE
        ));

        //Estrutura de decisão composta
        switch (dia) {
            case 0: msg = "Domingo"; break;
            case 1: msg = "Segunda-Feira"; break;
            case 2: msg = "Terça-Feira"; break;
            case 3: msg = "Quarta-Feira"; break;
            case 4: msg = "Quinta-Feira"; break;
            case 5: msg = "Sexta-Feira"; break;
            case 6: msg = "Sábado"; break;
            default: msg = "Insira um valor entre 0 e 6."; break;
        }

        JOptionPane.showMessageDialog(null, msg);
    }
}
