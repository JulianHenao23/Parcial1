import java.util.Scanner;

public class ejercicio7 {
//7. Ejercicio de Ordenamiento de Números (sin utilizar arreglos):
//Crea un programa en Java que solicite al usuario ingresar tres números enteros.
//Luego, muestra los números en orden ascendente, utilizando condicionales para determinar
//cuál es el mayor, el intermedio y el menor.
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    int num1 = entrada.nextInt();
    System.out.print("Ingrese el segundo número: ");
    int num2 = entrada.nextInt();
    System.out.print("Ingrese el tercer número: ");
    int num3 = entrada.nextInt();

    int mayor, intermedio, menor;

    if (num1 > num2 && num1 > num3) {
        mayor = num1;
        if (num2 > num3) {
            intermedio = num2;
            menor = num3;
        } else {
            intermedio = num3;
            menor = num2;
        }
    } else if (num2 > num1 && num2 > num3) {
        mayor = num2;
        if (num1 > num3) {
            intermedio = num1;
            menor = num3;
        } else {
            intermedio = num3;
            menor = num1;
        }
    } else {
        mayor = num3;
        if (num1 > num2) {
            intermedio = num1;
            menor = num2;
        } else {
            intermedio = num2;
            menor = num1;
        }
    }
    System.out.println("Los números en orden ascendente son: " + menor + ", " + intermedio + ", " + mayor);



}
}


