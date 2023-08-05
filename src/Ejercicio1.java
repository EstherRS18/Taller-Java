import java.util.Scanner;

public class Ejercicio1 {
    // Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división.
    public static void main(String[] args) {
        //creamos dos variables, para almacenar los numeros
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("digite el segundo numero");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
    }
}