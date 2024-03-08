public class ejercicio13 {

    public static void main(String[] args) {
        int[] vector = {10, 5, 8, 20, 15};


        int maximo = vector[0];

        for (int elemento : vector) {
            if (elemento > maximo) {
                maximo = elemento;
            }
        }
        System.out.println("El elemento máximmo en el vector es: " + maximo);
    }
}
