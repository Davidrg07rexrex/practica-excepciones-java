import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ej1_6_Ejemplo_1 {
    public void pruebaScanner() {
        try {
            System.out.println("Empezando");
            System.out.println("intentando abrir...");
            Scanner in = new Scanner(new File("test.in")); //esto puede no existir
            System.out.println("Encontrado,procesando ...");
            System.out.println("Fin del programa principal");
        } catch (FileNotFoundException ex) {
            System.out.println("no se encontro el archivo"); //lo pillamos si falla
        } finally {
            System.out.println("finally va siempre"); //clave: esto sirve pa limpiar o cerrar cosas
        }
    }
}

