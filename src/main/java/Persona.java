

public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;

    //constructor para instanciar las variables

    public Persona(String Nombre, String Apellidos, int edad) {

        this.nombre = Nombre;
        this.apellidos = Apellidos;
        this.edad = edad;

    }

    // Getters y setters  para acceder a los campos

    @Override
    public String toString() {

        return "Edad=" + edad + ", apellido=" + apellidos +
                ", nombre=" + nombre;
    }


}
