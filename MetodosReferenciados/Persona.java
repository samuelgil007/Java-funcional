package MetodosReferenciados;

public class Persona {

    private String nombre;

    private Integer edad;

    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                '}';
    }

    public static int compararPorEdad(Persona a, Persona b){
        return a.getEdad().compareTo(b.getEdad());
    }

    public int compararPorEdad2(Persona a){
        return this.getEdad().compareTo(a.getEdad());
    }
}
