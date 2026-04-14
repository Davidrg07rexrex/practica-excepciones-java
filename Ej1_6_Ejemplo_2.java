import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ej1_6_Ejemplo_2 {
    {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }
    public static void methodA() {
        System.out.println("Enter methodA()");
        try {
            System.out.println(1 / 0);//excepcion porque no se puede dividir entre 0
        } finally {
            System.out.println("finally in methodA()");
        }
        System.out.println("Exit methodA()");
    }
}
