public class ejercicio12 {
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8};

        long productoPares = 1;

        for (int elemento : vector) {
            if (elemento % 2 == 0) {


                 productoPares *= elemento;
            }
        }

        System.out.println("El producto de los números pares del  vector es: " + productoPares);


    }
}
