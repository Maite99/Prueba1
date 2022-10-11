import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca el radio: ");
        double radio= entrada.nextDouble();

        double area= Math.PI*Math.pow(radio,2);

        System.out.println("El área es: " + area);
    }
}
