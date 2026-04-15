package Parte_b;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "estudiante: " + nombre + " (" + edad + " anos)";
    }
}

class Asignatura {
    private String nombreAsig;
    private List<Estudiante> listaAlumnos;

    public Asignatura(String nombreAsig) {
        this.nombreAsig = nombreAsig;
        this.listaAlumnos = new ArrayList<>();
    }

    public void añadirEstudiante(Estudiante e) {
        listaAlumnos.add(e);
    }

    @Override
    public String toString() {
        return "asignatura: " + nombreAsig + ", alumnos: " + listaAlumnos;
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {

        Asignatura asig = new Asignatura("programacion b");
        asig.añadirEstudiante(new Estudiante("alberto", 19));
        asig.añadirEstudiante(new Estudiante("lucia", 20));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String fichero = "asignatura.json";

        try (FileWriter writer = new FileWriter(fichero)) {
            gson.toJson(asig, writer); //aqui volcamos la lista al archivo
            System.out.println("fichero creado: " + fichero);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //la idea es ver que una lista en java se convierte en un array de json
        try (FileReader reader = new FileReader(fichero)) {
            Asignatura asigCargada = gson.fromJson(reader, Asignatura.class); //cargamos lo que haya en el disco
            System.out.println("datos recuperados:");
            System.out.println(asigCargada);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* respuesta a las preguntas:
           1. estructura: el fichero tiene llaves para el objeto y corchetes para la lista.Asi es como json marca arrays
           2. puedes cambiar los nombres en el archivo con el bloc de notas.
           esto pasa porque gson lee el texto tal cual este en el momento de ejecutar.*/
    }
}