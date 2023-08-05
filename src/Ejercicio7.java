import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");

        int numero = scanner.nextInt();

        if(numero > 0) {
            for (int i = 0; i <= 10; i++) {
                int multiplicacion = numero* i;
                System.out.println(numero + " * " + i +" = "+ multiplicacion);
            }
        } else {
            System.out.println("El numero introducido no es un numero positivo");
        }

    }
}
