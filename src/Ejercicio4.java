import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad");

        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }
    }
}
