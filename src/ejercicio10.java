import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresee un número entero positivo: ");
        int numero = scanner.nextInt();

        System.out.print("Ingrese un dígito (0-9): ");
        int digito = scanner.nextInt();

        int contador = 0;
        int numeroTemp = numero;

        while (numeroTemp > 0) {
            int digitoActual = numeroTemp % 10;
            if (digitoActual == digito) {
                contador++;
            }
            numeroTemp /= 10;
        }

        System.out.println("El dígito " + digito + " esta " + contador + " veces en el número " + numero + ".");
    }
}
