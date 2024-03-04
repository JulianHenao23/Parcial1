import java.util.Scanner;
import java.util.Random;

public class ejericio2 {
    public static void main(String[] args) {
        String[] opciones = {"Piedra", "Papel", "Tijeras"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Elige una opción: Piedra, Papel o Tijeras");
        String eleccionUsuario = scanner.next();
        String eleccionComputadora = opciones[random.nextInt(opciones.length)];

        System.out.println("La pc eligió:" + eleccionComputadora);

        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("Es un empate!");
        } else if ((eleccionUsuario.equals("Piedra") && eleccionComputadora.equals("Tijeras")) ||
                (eleccionUsuario.equals("Papel") && eleccionComputadora.equals("Piedra")) ||
                (eleccionUsuario.equals("Tijeras") && eleccionComputadora.equals("Papel"))) {
            System.out.println("Ganaste!");
        } else {
            System.out.println("Perdiste!");
        }
        scanner.close();
    }
}





