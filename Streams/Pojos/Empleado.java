package Streams.Pojos;

import java.util.Arrays;
import java.util.List;

public class Empleado implements Comparable<Empleado> {

    private Long id;
    private String nombre;

    private double ingresos;
    private Genero genero;

    private int edad;

    @Override
    public int compareTo(Empleado o) {
        return this.getNombre().compareTo(o.getNombre());
    }


    public static enum Genero {
        HOMBRE,
        MUJER
    }


    public boolean esHombre(){
        return this.genero.equals(Genero.HOMBRE);
    }

    public boolean esMujer(){
        return this.genero.equals(Genero.MUJER);
    }

    public Empleado(Long id, String nombre, double ingresos, Genero genero, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.ingresos = ingresos;
        this.genero = genero;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public  static List<Empleado> empleados (){
        return Arrays.asList(
                new Empleado(1L,"Juan Perez", 538.00,Genero.HOMBRE,26),
                new Empleado(2L,"Alicia Ramírez", 600.00,Genero.MUJER,38),
                new Empleado(3L,"Juan Puga", 900.00,Genero.HOMBRE,36),
                new Empleado(4L,"Javier Vazquez", 330.00,Genero.HOMBRE,26),
                new Empleado(5L,"Hevelyn López", 450.00,Genero.MUJER,36),
                new Empleado(6L,"Esmeralda López", 450.00,Genero.MUJER,38),
                new Empleado(6L,"Oyuky Navarro", 600.00,Genero.MUJER,26),
                new Empleado(7L,"Álvaro Mejía", 450.00,Genero.HOMBRE,22),
                new Empleado(8L,"Olivia Suarez", 652.30,Genero.MUJER,35),
                new Empleado(9L,"Jessica Quevedo", 584.22,Genero.MUJER,38),
                new Empleado(11L,"Oswalvo Sánchez", 789.48,Genero.HOMBRE,42),
                new Empleado(12L,"Oscar Pérez", 155.78,Genero.HOMBRE,45),
                new Empleado(13L,"Lionel Messi", 321.12,Genero.HOMBRE,26),
                new Empleado(14L,"Ricardo Kaka", 796.36,Genero.HOMBRE,32),
                new Empleado(15L,"Christiano Ronaldo", 122.87,Genero.HOMBRE,30),
                new Empleado(16L,"Andrés Iniesta", 798.23,Genero.HOMBRE,33),
                new Empleado(17L,"Eva Perón", 613.25,Genero.HOMBRE,40),
                new Empleado(18L,"Margarita Zavala", 321.54,Genero.MUJER,45),
                new Empleado(19L,"Josefina Vázquez", 158.00,Genero.MUJER,50),
                new Empleado(20L,"Patricia Zetina", 432.55,Genero.MUJER,49),
                new Empleado(22L,"Loammi Vazquez", 158.00,Genero.MUJER,26),
                new Empleado(23L,"David  Isaí", 464.38,Genero.HOMBRE,30),
                new Empleado(24L,"Absalón Montreal", 152.45,Genero.HOMBRE,20),
                new Empleado(25L,"Ruth Sabiñon", 215.12,Genero.HOMBRE,22),
                new Empleado(26L,"Lorenzo Arano", 545.15,Genero.HOMBRE,26),
                new Empleado(27L,"Horacio Cervantes", 1545.54,Genero.HOMBRE,45),
                new Empleado(28L,"Julio Batista", 558.45,Genero.HOMBRE,24),
                new Empleado(29L,"Edmundo Aguilar", 876.15,Genero.HOMBRE,38),
                new Empleado(30L,"Ángel Marquez", 879.55,Genero.HOMBRE,38),
                new Empleado(32L,"Martha Sahagún", 124.45,Genero.MUJER,50),
                new Empleado(33L,"Vicente Foz", 515.45,Genero.HOMBRE,60),
                new Empleado(34L,"Roberto Pintado ", 287.54,Genero.HOMBRE,59),
                new Empleado(35L,"Alicia Villareal", 872.54,Genero.HOMBRE,45),
                new Empleado(36L,"Lola Beltrán", 245.77,Genero.MUJER,26)
        );
    }
}