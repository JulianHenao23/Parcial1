import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuanto inviertes inicialmente");
        double inversion = scanner.nextDouble();
        System.out.println("cual es la tasa de interes anual");
        double interes = scanner.nextDouble();
        System.out.println("numero de años");
        double time = scanner.nextDouble();
        //metodo para la potenciacion
        double montof = inversion * Math.pow(1 + interes, time);
        System.out.println("el monto final es: " + montof);


    }
}
