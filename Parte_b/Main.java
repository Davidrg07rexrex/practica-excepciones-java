import java.io.*;

public class Main {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Uso: java -jar proyecto.jar <operacion> <fichero>");
            System.out.println("Operaciones disponibles: init, show");
            return;
        }

        String operacion   = args[0];
        String rutaFichero = args[1];

        switch (operacion) {
            case "init":
                crearFichero(rutaFichero);
                break;
            case "show":
                mostrarFichero(rutaFichero);
                break;
            default:
                System.out.println("Operacion no reconocida: " + operacion);
                System.out.println("Las operaciones validas son: init, show");
        }
    }

    private static void crearFichero(String ruta) {
        Alumno alumno = new Alumno(
                "Nombre",
                "Apellido",
                18,
                "00000000A",
                "alumno@email.com",
                "1DAM",
                5.0
        );

        String json = "{\n" +
                "  \"nombre\": \""    + alumno.getNombre()    + "\",\n" +
                "  \"apellidos\": \"" + alumno.getApellidos() + "\",\n" +
                "  \"edad\": "        + alumno.getEdad()       + ",\n"  +
                "  \"dni\": \""       + alumno.getDni()        + "\",\n" +
                "  \"correo\": \""    + alumno.getCorreo()     + "\",\n" +
                "  \"curso\": \""     + alumno.getCurso()      + "\",\n" +
                "  \"notaMedia\": "   + alumno.getNotaMedia()  + "\n"   +
                "}";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            writer.write(json);
            System.out.println("Fichero creado correctamente en: " + ruta);
        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }
    }

    private static void mostrarFichero(String ruta) {
        File fichero = new File(ruta);

        if (!fichero.exists()) {
            System.out.println("El fichero no existe: " + ruta);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String nombre    = null;
            String apellidos = null;
            int edad         = 0;
            String dni       = null;
            String correo    = null;
            String curso     = null;
            double notaMedia = 0.0;

            String linea;
            while ((linea = reader.readLine()) != null) {
                linea = linea.trim();

                if (linea.startsWith("\"nombre\""))
                    nombre = extraerValorTexto(linea);
                else if (linea.startsWith("\"apellidos\""))
                    apellidos = extraerValorTexto(linea);
                else if (linea.startsWith("\"edad\""))
                    edad = Integer.parseInt(extraerValorNumero(linea));
                else if (linea.startsWith("\"dni\""))
                    dni = extraerValorTexto(linea);
                else if (linea.startsWith("\"correo\""))
                    correo = extraerValorTexto(linea);
                else if (linea.startsWith("\"curso\""))
                    curso = extraerValorTexto(linea);
                else if (linea.startsWith("\"notaMedia\""))
                    notaMedia = Double.parseDouble(extraerValorNumero(linea));
            }

            Alumno alumno = new Alumno(nombre, apellidos, edad, dni, correo, curso, notaMedia);
            System.out.println("Datos del alumno:");
            System.out.println(alumno.toString());

        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("El fichero tiene un formato incorrecto.");
        }
    }

    // Extrae el valor de una línea tipo: "clave": "valor"
    private static String extraerValorTexto(String linea) {
        int inicio = linea.indexOf(':', 0) + 1;
        String valor = linea.substring(inicio).trim();
        valor = valor.replaceAll("^\"|\"$", ""); // quita las comillas del principio y el final
        valor = valor.replaceAll(",+$", "");      // quita la coma final si la hay
        return valor;
    }

    // Extrae el valor de una línea tipo: "clave": 123
    private static String extraerValorNumero(String linea) {
        int inicio = linea.indexOf(':', 0) + 1;
        String valor = linea.substring(inicio).trim();
        valor = valor.replaceAll(",+$", "");
        return valor;
    }
}
