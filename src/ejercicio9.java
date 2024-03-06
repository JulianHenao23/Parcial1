import java.util.Scanner;

public class ejercicio9 {
    //9. Ejercicio de Cálculo de Máximo Común Divisor (MCD):
    //Desarrolla un programa en Java que solicite al usuario ingresar dos números enteros
    //positivos y luego calcule y muestre su máximo común divisor (MCD).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa porfavor un numero entero positivo");
        int numero1 = scanner.nextInt();
        System.out.println("ingresa porfavor otro numero entero positivo");
        int numero2 = scanner.nextInt();

        int mcd  = calcularMCD(numero1, numero2);
        System.out.println("El Máximo Común Divisor de " + numero1 + " y " + numero2 + " es: " + mcd);
    }

    private static int calcularMCD(int numero1, int numero2) {
    while (numero2 != 0) {
        int temp = numero2;
        numero2 = numero1 % numero2;
        numero1 = temp;
    }
            return numero1;
        }


}