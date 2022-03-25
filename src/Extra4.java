import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Extra4 {
    public static void getDate() {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Date now = new Date();
        JOptionPane.showMessageDialog(null, date.format(now));
    }

    public static void getTime() {
        SimpleDateFormat date = new SimpleDateFormat("HH:mm:ss");
        Date now = new Date();
        JOptionPane.showMessageDialog(null, date.format(now));
    }

    public static void getNow() {
        SimpleDateFormat date = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        Date now = new Date();
        JOptionPane.showMessageDialog(null, date.format(now));
    }

    public static void main(String[] args) {
        getDate();
        getTime();
        getNow();
    }
}
