import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejemplo1_1 {
    public static void main(String[] args) {
        Scanner in = null;
        /*Para poder cerrar el archivo en el finally como se pide en el punto 3
        declaramos in fuera del try para que en el finally se pueda acceder a la variable
        y comprobar si es nulo
         */
        try {
            System.out.println("Intentando abrir el archivo...");
            in = new Scanner(new File("test.in"));
            System.out.println("Archivo encontrado. Procesando...");
        } catch (FileNotFoundException ex) {
            System.out.println("Error: Archivo no encontrado.");
            ex.printStackTrace();
        } finally{
            // Si el archivo existe lo cerramos
            if  (in != null){
                in.close();
                System.out.println("Archivo cerrado");
            }
        }
        System.out.println("El programa continúa después del try-catch-finally.");
    }
}
