import java.util.*;

public class ejercicio14 {

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

        // Metodo para preservarel orden original
        Set<Integer> conjuntoSinDuplicados = new LinkedHashSet<>(lista);
        List<Integer> listaSinDuplicados = new ArrayList<>(conjuntoSinDuplicados);
        System.out.println("Lista sin duplicados (método 1): " + listaSinDuplicados);
    }
}