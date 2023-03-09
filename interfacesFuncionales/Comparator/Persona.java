package interfacesFuncionales.Comparator;

import java.util.Date;

public class Persona implements  Comparable<Persona>{

    private String nombre;

    private int idPersona;

    private Date fechaNacimiento;

    public Persona(int idPersona ,String nombre,Date fechaNacimiento) {
        this.nombre = nombre;
        this.idPersona = idPersona;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    @Override
    public int compareTo(Persona p) {
        return this.nombre.compareTo(p.nombre);
    }

    @Override
    public String toString() {
        return  nombre+"-"+idPersona+"-"+fechaNacimiento;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}