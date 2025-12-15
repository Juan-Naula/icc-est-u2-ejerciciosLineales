import utils.SignValidator;

public class App {
    public static void main(String[] args) throws Exception {
        runSingValidator();
    }

    private static void runSingValidator() {
        SignValidator signValidator = new SignValidator();
        String cadena1 = "{[()]}";
        String cadena2 = "{[(])}";
        System.out.println("Cadena: " + cadena1 + " es valida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es valida? " + signValidator.isValid(cadena2));
    }
}
