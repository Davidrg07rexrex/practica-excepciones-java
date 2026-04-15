public class Tester {
    public static void main(String[] args) {

        //Ejecutamos los primeros 4 ejemplos de la a
        Ejemplo1_1.main(args);
        Ejemplo1_2.main(args);
        Ejemplo1_3.main(args);
        Ejemplo1_4.main(args);
        System.out.println("probando 1.5 ejemplo 1");
        Ej1_5_Ejemplo_1 ej1 = new Ej1_5_Ejemplo_1();
        ej1.methodC(); //esto atrapa el error por dentro

        System.out.println("probando 1.5 ejemplo 2");
        Ej1_5_Ejemplo_2 ej2 = new Ej1_5_Ejemplo_2();
        try {
            ej2.methodC(); //este lo lanza a arriba asi que lo detectamos aqui
        } catch (Exception e) {
            System.out.println("detectamos el error del 1.5 ej 2 desde el main"); //clave pa que no se pare el programa
        }

        System.out.println("\nprobando 1.6 ejemplo 1");
        Ej1_6_Ejemplo_1 ej3 = new Ej1_6_Ejemplo_1();
        ej3.pruebaScanner(); //intenta abrir el archivo, salta al catch y luego corre el finally

        System.out.println("probando 1.6 ejemplo 2");
        try {
            //eso significa que al hacer el new se va a ejecutar methodA() y va a dar division por cero
            Ej1_6_Ejemplo_2 ej4 = new Ej1_6_Ejemplo_2();
        } catch (ArithmeticException e) {
            System.out.println("pillada la division por cero al crear el objeto");
        }
        try {
            Ej1_6_Ejemplo_2.methodA();
        } catch (ArithmeticException e) {
            System.out.println("pillada otra division");
        }

        System.out.println("probando 1.7");
        Ej1_7 ej5 = new Ej1_7();
        try { ej5.falloArray(); } catch (Exception e) { System.out.println("fallo de array captado"); } //cubre el metodo del array
        try { ej5.falloNulo(); } catch (Exception e) { System.out.println("fallo de nulo"); } //cubre el nullpointer
        try { ej5.falloNumero(); } catch (Exception e) { System.out.println("fallo de letras a numero "); } //cubre el parseint
        try { ej5.falloCasteo(); } catch (Exception e) { System.out.println("fallo de casteo"); } //cubre lo de los objetos

        System.out.println("probando 1.8 magia");
        Ej1_8 ej6 = new Ej1_8();
        ej6.probarMagia(); //esto ya trae su propio try catch y prueba los numeros 8 y 9
        try {
            //llamamos al magic suelto forzando el 8 para asegurar que entra al if
            ej6.magic(8);
        } catch (MyMagicException e) {
            System.out.println("magia pillada");
        }
    }

}