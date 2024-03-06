import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
       int numero1 = generarNumeroAleatorio(1, 10);
       int numero2 = generarNumeroAleatorio(1, 10);
       
      int sumacorrecta = numero1 + numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa porfavor la suma de " + numero1 + " y " + numero2 + ":");
       int sumusuario = scanner.nextInt();

        if (sumusuario == sumacorrecta) {
            System.out.println("Respuesta correctaaa La suma es " + sumacorrecta+ ".");
        } else {
            System.out.println("Respuesta incorrecta. La suma era " + sumacorrecta + ".");

        }
    }

        public static int generarNumeroAleatorio (int min, int max) {
            return (int) (Math.random() * (max - min + 1)) + min;
        }

}
