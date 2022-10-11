import javax.swing.*;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca un carácter:");
        char caracter=entrada.next().charAt(0);
        int codigo=(int) caracter;
        System.out.println("El código es: "+ codigo);
}
}