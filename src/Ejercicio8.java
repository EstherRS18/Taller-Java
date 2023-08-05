import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //Realiza un programa que simule un juego de adivinar un número. El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivine el numero");

        double numero = (Math.random() * 100) + 1;
        int numeroUsuario = scanner.nextInt();
        int numeroRamdon = scanner.nextInt();

        if(numeroUsuario > numeroRamdon) {
            System.out.println("El numero " + numeroUsuario + " es mayor al numero " + numeroRamdon);
        } else if (numeroRamdon > numeroUsuario) {
            System.out.println("El numero " + numeroUsuario + " es menor al numero " + numeroRamdon);
        } else {
            System.out.println("Ambos numero son iguales");
        }

    }
}
