import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de dinero");
        //
        double cantidad = scanner.nextDouble();

        System.out.println("ingrese la tasaa de cambio porfavor");
        double tasaC = scanner.nextDouble();

        double resultado = cantidad * tasaC;
        System.out.println("la cantidad convertida seria: " + resultado);



    }
}
