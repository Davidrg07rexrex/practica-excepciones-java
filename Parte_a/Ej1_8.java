//la clave es poner el extends Exception para que herede
class MyMagicException extends Exception {
    public MyMagicException(String message) { //el constructor coge el texto
        super(message); //y se lo pasa a la clase padre
    }
}

public class Ej1_8 {
    //metodo que lanza nuestra excepcion inventada
    public void magic(int number) throws MyMagicException { //avisa
        if (number == 8) {
            throw new MyMagicException("le diste al numero magico"); //lanza nuestro error
        }
        System.out.println("hello"); //se salta esto si hubo error
    }

    public void probarMagia() {
        try {
            magic(9); //este no da fallo
            magic(8); //este da nuestra excepcion
        } catch (MyMagicException ex) {
            ex.printStackTrace(); //imprime la ruta del error
        }
    }
}