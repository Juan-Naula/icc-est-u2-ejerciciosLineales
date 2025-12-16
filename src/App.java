import java.util.Stack;

import utils.QueueUtils;
import utils.SignValidator;
import utils.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        runSingValidator();
        runStackSorter();
        runQueuePalindrome();
    }

    private static void runSingValidator() {
        System.out.println("== Ejercicio 01: Validador de signos==");
        SignValidator signValidator = new SignValidator();
        String cadena1 = "{[()]}";
        String cadena2 = "{[(])}";
        System.out.println("Cadena: " + cadena1 + " es valida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es valida? " + signValidator.isValid(cadena2));
        System.out.println("");
    }
    private static void runStackSorter() {
        System.out.println("== Ejercicio 02: Ordenar un Stack ==");
        Stack<Integer> s = new Stack<>();
        // construir pila de ejemplo para que el tope sea 5 -> 1 -> 4 -> 2
        s.push(2);
        s.push(4);
        s.push(1);
        s.push(5);

        System.out.println("Antes: " + stackToString(s));
        StackSorter.sort(s);
        System.out.println("Después: " + stackToString(s));
        System.out.println();
    }

    private static void runQueuePalindrome() {
        System.out.println("== Ejercicio 03: Palíndromo usando Colas ==");
        String[] tests = {"ana", "radar", "java"};
        for (String t : tests) {
            System.out.println("Input: \"" + t + "\" -> " + QueueUtils.isPalindrome(t));
        }
        System.out.println();
    }

    private static String stackToString(Stack<Integer> s) {
        StringBuilder sb = new StringBuilder();
        sb.append("(tope) ");
        for (int i = s.size() - 1; i >= 0; i--) {
            sb.append(s.get(i));
            if (i != 0) sb.append(" -> ");
        }
        return sb.toString();
    }
}
