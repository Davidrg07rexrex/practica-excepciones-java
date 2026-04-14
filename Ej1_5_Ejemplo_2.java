public class Ej1_5_Ejemplo_2 {
        public void methodD() throws Exception { //igual que antes
            throw new Exception("otro error"); //lanza el fallo
        }

        public void methodC() throws Exception { //la clave aqui es volver a poner throws
            methodD(); //como avisamos en la firma no hace falta try-catch
        }
}
