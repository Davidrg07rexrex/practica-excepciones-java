import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 */
public class Ejemplo1_4 {
    // Excepción verificada
    public static void metodoConCheckedException() throws FileNotFoundException {
        System.out.println("Intentando abrir archivo 'noExiste.txt'...");
        Scanner in = new Scanner(new File("noExiste.txt"));
        in.close();
    }

    // Excepción no verificada
    public static void metodoConUncheckedException() {
        System.out.println("Realizando división por cero...");
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        // 1. Excepción verificada
        System.out.println("--- Excepción verificada ---");
        try {
            metodoConCheckedException();
        } catch (FileNotFoundException ex) {
            System.out.println("Excepción verificada capturada: " + ex);
            //El compilador obliga a manejar este tipo de excepciones
        }

        // 2. Excepción no verificada
        System.out.println("--- Excepción no verificada (RuntimeException) ---");
        try {
            metodoConUncheckedException();
        } catch (ArithmeticException ex) {
            System.out.println("Excepción no verificada capturada: " + ex);
            //Aunque no es obligatorio capturarla, podemos hacerlo opcionalmente.
        }
    }
}
