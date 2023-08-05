import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario un número entero y determine si es par o impar.

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite un numero entero");

        int entero = scanner.nextInt();

        if (entero % 2 == 0) {
            System.out.println("El numero " + entero + "es par");
        }
        else {
            System.out.println("El numero " + entero + "es impar");
        }

    }
}
