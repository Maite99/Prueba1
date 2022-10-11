public class Ejercicio12 {
    public static void main(String[] args) {
        int x=1; //x vale 1

        while(x<=100){ //mientras que x sea menor o igual a 100
            if((x%2==0) && (x%3==0)){ //si x es divisible entre 2 y 3
                System.out.println(x); //imprime x
            }
            x++; //aumento
        }
    }
}
