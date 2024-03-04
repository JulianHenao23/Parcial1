import java.util.Scanner;

public class Main {
    //Ejercicio de Verificación de Año Bisiesto:
    //Crea un programa en Java que solicite al usuario ingresar un año y determine si es un año
    //bisiesto o no. Un año bisiesto es aquel divisible por 4, excepto aquellos divisibles por 100
    //pero no por 400. Por ejemplo, 2000 y 2400 son años bisiestos, mientras que 1800, 1900
    //y 2100 no lo son.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un año porfavor ");
        int numero = scanner.nextInt();

        //estructura del condicional IF, entonces & es "and" y || es "or".
        if ((numero % 4 == 0) && ((numero % 100 != 0) || (numero % 400 == 0)))  {
            System.out.println("el año: " + numero + " es bisiesto");
        } else {
            System.out.println("el año: " + numero + " no es bisiesto");
        }
        scanner.close();
    }

}