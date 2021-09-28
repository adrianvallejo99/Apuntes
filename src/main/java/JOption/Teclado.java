package JOption;

import javax.swing.*;

public class Teclado {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "Cual es tu nombre?");
        String dia = JOptionPane.showInputDialog(null, "Que día naciste?");
        String mes = JOptionPane.showInputDialog(null, "De que mes?");
        String year = JOptionPane.showInputDialog(null, "De que año?");
        JOptionPane.showMessageDialog(null, "Hola " + nombre + " naciste el " + dia +
                " de " + mes + " de " + year);
    }
}
