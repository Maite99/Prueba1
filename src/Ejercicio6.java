import javax.swing.*;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        String texto= JOptionPane.showInputDialog("Introduzca un número: ");
        int x=Integer.parseInt(texto);

        if(x%2==0){
            System.out.println("El número es divisible entre 2");
        }
        else{
            System.out.println("El número no es divisible entre 2");
        }
    }
}
