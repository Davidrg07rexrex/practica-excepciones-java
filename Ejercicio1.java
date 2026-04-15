package Parte_b;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import Parte_b.clasesejercicio1anteriores.*; //Para tener los ejercicios de las otras practicas

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {

    // metodo generico para guardar cualquier objeto en un archivo
    public static <T> void guardar(String ruta, T objeto) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(ruta)) {
            gson.toJson(objeto, writer);
            System.out.println("objeto guardado en: " + ruta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // metodo generico para cargar un objeto desde un archivo
    public static <T> T cargar(String ruta, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(ruta)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // 1.Circle y Rectangle
        Circle c1 = new Circle(5.5);
        guardar("circle.json", c1);
        Circle c1Cargado = cargar("circle.json", Circle.class);
        System.out.println("cargado circle: " + c1Cargado);

        Rectangle r1 = new Rectangle(2.0, 4.0);
        guardar("rectangle.json", r1);
        Rectangle r1Cargado = cargar("rectangle.json", Rectangle.class);
        System.out.println("cargado rectangle: " + r1Cargado);

        // 2.Author y Book
        Author a1 = new Author("mervin", "mervin@mail.com");
        guardar("author.json", a1);
        Author a1Cargado = cargar("author.json", Author.class);
        System.out.println("cargado author: " + a1Cargado);

        Book b1 = new Book("123-ABC", "java p1", a1, 29.99, 10);
        guardar("book.json", b1);
        Book b1Cargado = cargar("book.json", Book.class);
        System.out.println("cargado book: " + b1Cargado.getName() + " de " + b1Cargado.getAuthorName());

        // 3.Point2D y Point3D
        Point2D p2 = new Point2D(1.0f, 2.0f);
        guardar("point2d.json", p2);
        Point2D p2Cargado = cargar("point2d.json", Point2D.class);
        System.out.println("cargado point2d: " + p2Cargado);

        Point3D p3 = new Point3D(1.0f, 2.0f, 3.0f);
        guardar("point3d.json", p3);
        Point3D p3Cargado = cargar("point3d.json", Point3D.class);
        System.out.println("cargado point3d: " + p3Cargado);

        // 4.Animal y Cat
        // aunque animal es abstracta,se pueden usar sus subclases
        Cat cat1 = new Cat("misifu");
        guardar("cat.json", cat1);
        Cat cat1Cargado = cargar("cat.json", Cat.class);
        System.out.print("cargado cat: ");
        if (cat1Cargado != null) cat1Cargado.greets();
    }
}
