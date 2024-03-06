import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("un numero entero positivo porfavor");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
            System.exit(0);
        }
        for (int i = 1; i <= numero; i++) {
            String asteriscos = "";
            for (int y = 1; y <= i; y++) {
                asteriscos = asteriscos + "*";
            }
            System.out.println(asteriscos + "\n");
        }


    }
}