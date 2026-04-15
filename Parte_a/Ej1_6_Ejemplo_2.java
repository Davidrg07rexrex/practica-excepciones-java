public class Ej1_6_Ejemplo_2 {
    public static void main(String[] args) {
        System.out.println("Entrando al main()");
        methodA(); //llamamos al metodo que va a fallar
        System.out.println("Saliendo del main()"); //esto nunca llega a salir porque el programa muere antes
    }

    public static void methodA() {
        System.out.println("methodA()");
        try {
            System.out.println(1 / 0); //excepcion porque no se puede dividir entre 0
        } finally {
            System.out.println("finally en methodA()"); //se imprime siempre
        }
        System.out.println("Exit methodA()"); //esto tampoco sale
    }
}