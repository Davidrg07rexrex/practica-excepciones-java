public class Ejemplo1_3 {
    /* Cómo XxxExcepcion no es una excepción de java he elegido la excepción ArithmeticException
    para realizar el programa. En el méthodA está el try-catch que atrapa la excepción
    mientras que en los otros methods se manda la excepción hacia arriba
     */
    public static void main(String[] args) {
        methodA();
    }
    public static void methodA() {
        System.out.println("Enter methodA()");
        try{
            methodB();
        } catch (ArithmeticException ex){
            System.out.println("Error: Excepción aritmética");
            ex.printStackTrace();
        }

        System.out.println("Exit methodA()");
    }
    public static void methodB() throws ArithmeticException{
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }
    public static void methodC() throws ArithmeticException{
        System.out.println("Enter methodC()");
        methodD();
        System.out.println("Exit methodC()");
    }
    public static void methodD() throws ArithmeticException{
        System.out.println("Enter methodD()");
        System.out.println(1/0);
        System.out.println("Exit methodD()");
    }
}