package utils;

import java.util.Stack;

public class SignValidator {
    public boolean isValid(String signos){
        Stack<Character> stack = new Stack<Character>();

        char[] caracteres = signos.toCharArray();
        for (Character character : caracteres) {
            //character -> (
            //character -> }
            //1 -> Comprobar si es apertura o cierre

            if (getIsApertura(character)) {
                //ingresara en la pila
                stack.push(character);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char ultimo = stack.pop();
                //ultimo es del mismo tipo que el caracter?
                boolean mismoTipo = isTipoIgual(character, ultimo);
                if (!mismoTipo) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean getIsApertura(char c){
        return c=='[' || c=='(' || c=='{'; 

    }

    private boolean isTipoIgual(char cierre, char apertura){
        return (apertura == '(' && cierre == ')') || (apertura == '{' && cierre == '}') || (apertura == '[' && cierre == ']') ;
    }
}
