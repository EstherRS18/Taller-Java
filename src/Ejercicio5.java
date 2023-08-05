import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");

        int usuario1 = scanner.nextInt();
        int usuario2 = scanner.nextInt();

        if(usuario1 > usuario2) {
            System.out.println("el numero " + usuario1 + " es mayor al numero " + usuario2);
        } else if (usuario2 > usuario1) {
            System.out.println("el numero " + usuario2 + " es mayor al numero " + usuario1);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
}
