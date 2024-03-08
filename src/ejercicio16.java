import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // hashmaps clave string y valor interger
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 10);
        hashMap.put("B", 5);
        hashMap.put("C", 8);
        hashMap.put("D", 3);
        System.out.print("Ingrese número mínimo para eliminar claves: ");

        int nMinimo = scanner.nextInt();

        // profe si ve esto este metodo no lo entendi  por completo pero me sirvio :v
        Iterator<Map.Entry<String, Integer>> iterador = hashMap.entrySet().iterator();
        while (iterador.hasNext()) {
            Map.Entry<String, Integer> entrada = iterador.next();
            if (entrada.getValue() < nMinimo) {
                iterador.remove();
            }
        }
        System.out.println("despues de eliminar claves: " + hashMap);

        scanner.close();
    }
}