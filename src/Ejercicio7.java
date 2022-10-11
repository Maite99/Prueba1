import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Introduzca un número: ");
        int x=Integer.parseInt(texto);

        char caracter=(char) x;

        System.out.println(caracter);
    }
}
