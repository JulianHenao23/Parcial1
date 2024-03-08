public class ejercicio11 {


    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5};

        int suma = 0;
        for (int elemento : vector) {
            suma += elemento;
        }

        System.out.println("La suma de los elementos del vector es: " + suma);
    }
}
