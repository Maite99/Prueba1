import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        String nombre;

        nombre= JOptionPane.showInputDialog("Introduzca su nombre: ");

        JOptionPane.showMessageDialog(null, "Bienvenida " + nombre);
    }
}
