package Parte_b;

//importamos las clases que usamos en el ejercicio anterior
import Parte_b.clasesejercicio1anteriores.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Ejercicio2 {
    public static void main(String[] args) {
        // creamos el autor
        Author autorFamoso = new Author("miguel de cervantes", "maiguelito.com");

        //creamos el objeto contenedor (libro) que guarda al autor dentro
        Book libroQuijote = new Book("978-100", "el quijote", autorFamoso, 15.50, 100);

        //usamos gson para convertir el objeto libro a texto json
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String resultadoJson = gson.toJson(libroQuijote);

        //imprimimos el resultado para ver como queda la estructura
        System.out.println(resultadoJson);

        /*
         lo que he pasa al ejecutar esto es que la libreria gson funciona bien
         cuando hay objetos dentro de otros.Lo que hace es que en el
         texto del json, donde deberia ir el autor, abre unas llaves nuevas { }
         y mete alli dentro los datos de ese autor (nombre y email).
         Asi no hay que ir guardando pieza por pieza.
         */
    }
}