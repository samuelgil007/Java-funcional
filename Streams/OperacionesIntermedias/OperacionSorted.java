package Streams.OperacionesIntermedias;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import Streams.Pojos.Empleado;

//Genera un stream ordenado, de manera natural sin lambdas y con lambdas comparable.
public class OperacionSorted {
    
    public static void main(String[] args) {

        //Ordenado de manera natural
        System.out.println("Nombres ordenados: ");
        Arrays.asList("Alfredo","Maria","Daniel","Brenda")
                .stream()
                .sorted()
                .forEach(System.out::println);

        //Ordenado de manera natural
        System.out.println("Números ordenados: ");
        Arrays.asList(1,2,7,8,9,1,5,2,1,5,3,5)
                .stream()
                .sorted()
                .forEach(System.out::println);

        //Ordenado de manera natural de una clase que implementa comparable y tiene implementado el metodo comparableTo
        System.out.println("Empleados ordenados por nombre alfabéticamente: ");
        List<Empleado> empleados = Empleado.empleados();
        empleados.stream()
                .sorted()
                .forEach((empleado -> System.out.println(empleado.getNombre())));

        //Forma Antigua
        System.out.println("\nEmpleados ordenados por edad: ");
        empleados.stream().sorted(new Comparator<Empleado>() {
            @Override
            public int compare(Empleado o1, Empleado o2) {
                return o1.getEdad() - o2.getEdad();
            }
        }).forEach(empleado -> {
            System.out.println(empleado.getNombre()+" "+empleado.getEdad());
        });

        //Ordena el stream a partir de menor a mayor ingreso
        System.out.println("\nEmpleados ordenados por salario: ");
        empleados.stream()
        .filter(empleado -> empleado.getEdad() > 25)
        .sorted((o1, o2) -> (int) (o1.getIngresos() - o2.getIngresos()))
        .forEach(empleado -> {
            System.out.println(empleado.getNombre()+" "+empleado.getIngresos());
        });

    }
}
