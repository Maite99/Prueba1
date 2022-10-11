import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int x;
        int y;
        System.out.println("Introduce un número: ");
        x=entrada.nextInt();
        System.out.println("Introduce un número: ");
        y=entrada.nextInt();

        System.out.println("La suma es: " + (x+y));
        System.out.println("La resta es: " + (x-y));
        System.out.println("La multiplicación es: " + (x*y));
        System.out.println("La división es: " + (x/y));
        System.out.println("El resto es: " + (x%y));

    }
}
