package utils;

import java.util.Stack;

public class StackSorter {
    /**
     * Ordena el stack de forma que el elemento más pequeño quede en el tope.
     * Se usa únicamente otro Stack auxiliar y operaciones propias de pila.
     */
    public static void sort(Stack<Integer> stack) {
        Stack<Integer> aux = new Stack<>();

        while (!stack.isEmpty()) {
            int tmp = stack.pop();
            while (!aux.isEmpty() && aux.peek() > tmp) {
                stack.push(aux.pop());
            }
            aux.push(tmp);
        }

        // transferimos de aux a stack para que el más pequeño quede en el tope
        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }
    }
}
