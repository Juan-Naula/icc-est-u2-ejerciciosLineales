package utils;

import java.util.Queue;
import java.util.LinkedList;

public class QueueUtils {
    /**
     * Comprueba si un String es palíndromo usando únicamente colas.
     * Se usan tres colas: original, auxiliar (para rotaciones) y la invertida.
     */
    public static boolean isPalindrome(String s) {
        Queue<Character> original = new LinkedList<>();
        Queue<Character> aux = new LinkedList<>();
        Queue<Character> reversed = new LinkedList<>();

        for (char c : s.toCharArray()) {
            original.add(c);
            aux.add(c);
        }

        // Construir la cola invertida usando solo operaciones de cola
        while (!aux.isEmpty()) {
            int rotations = aux.size() - 1;
            for (int i = 0; i < rotations; i++) {
                aux.add(aux.remove());
            }
            // ahora el último elemento original quedó al frente
            reversed.add(aux.remove());
        }

        // Comparar elemento a elemento
        while (!original.isEmpty()) {
            if (!original.remove().equals(reversed.remove())) {
                return false;
            }
        }
        return true;
    }
}
