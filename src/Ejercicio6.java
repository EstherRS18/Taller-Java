import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println(numero + " es un numero negativo");
        } else if (numero > 0) {
            System.out.println(numero + " es un numero positivo");
        } else {
            System.out.println(numero + " es un numero cero");
        }

    }

}
