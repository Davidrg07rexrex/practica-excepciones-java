public class Ejemplo1_2 {
    /* Para evitar el error del ejercicio 1.2 manejamos la excepción
    con un try catch que nos avisará del error ocurrido y del momento en la
    ejecución del programa en el que pasa
     */
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }
    public static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }
    public static void methodB() {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }
    public static void methodC() {
        System.out.println("Enter methodC()");
        try{
            System.out.println(1/0);
        } catch (ArithmeticException ex){
            System.out.println("Error: Excepción aritmética");
            ex.printStackTrace();
        }
        System.out.println("Exit methodC()");
    }
}