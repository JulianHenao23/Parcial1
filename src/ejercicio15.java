import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de elementos en la lista: ");
        int n = scanner.nextInt();

        List<Integer> lista = new ArrayList<>();
        System.out.println("Ingresa los elementos de la lista uno por uno:");
        for (int i = 0; i < n; i++) {
            int elemento = scanner.nextInt();
            lista.add(elemento);
        }

        // ACA se eliminan los elemetnos impares
        Iterator<Integer> iterador = lista.iterator();
        while (iterador.hasNext()) {
            int elemento = iterador.next();
            if (elemento % 2 != 0) {
                iterador.remove();
            }
        }
        System.out.println("Lista sin elementos impares: " + lista);

        scanner.close();

    }
}
