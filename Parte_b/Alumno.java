public class Alumno {

    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String correo;
    private String curso;
    private double notaMedia;

    public Alumno(String nombre, String apellidos, int edad, String dni,
                  String correo, String curso, double notaMedia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.correo = correo;
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    // Getters y Setters

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public double getNotaMedia() { return notaMedia; }
    public void setNotaMedia(double notaMedia) { this.notaMedia = notaMedia; }

    @Override
    public String toString() {
        return "Alumno [" +
                "nombre=" + nombre + " " + apellidos +
                ", edad=" + edad +
                ", dni=" + dni +
                ", correo=" + correo +
                ", curso=" + curso +
                ", notaMedia=" + notaMedia +
                "]";
    }
}
