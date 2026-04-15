public class Ej1_5_Ejemplo_1 {
    public void methodD() throws Exception { //la clave es throws para avisar que puede no funcionar
        boolean fallo = true;
        if (fallo) {
            throw new Exception("error chungo"); //throw lanza el error
        }
    }

    public void methodC() {
        try {
            methodD(); //como methodD avisa hay q meterlo en el try
        } catch (Exception ex) {
            System.out.println("atrapado en el catch"); //aqui manejamos el fallo
        }
    }
}

