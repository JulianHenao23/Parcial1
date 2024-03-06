import java.util.Scanner;

public class ejercicio5 {
    //5. Ejercicio de Suma de Dígitos:
    //Escribe un programa en Java que solicite al usuario ingresar un número entero positivo.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa un numero entero positivo porfavor");
        int numero = entrada.nextInt();


        if (numero < 0) {
            System.out.println("debe ser positivo.");
            System.exit(0);
        }
        int suma = 0;

        while (numero > 0) {
            int digito = numero % 10;
            suma = suma + digito;
            numero = numero / 10;
        }

        System.out.println("La suma de los dígitos del número es: " + suma);
    }
}

