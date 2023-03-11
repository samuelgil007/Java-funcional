package Streams.OperacionesIntermedias;

import java.util.List;
import java.util.function.Predicate;

import Streams.Pojos.Empleado;

//Predicate, que devuelve un booleano. Busca y filtra los que tenga esa condicion, genera otro stream pero filtrado
public class OperacionFilter {
    
    public static void main(String[] args) {
        List<Empleado> empleados = Empleado.empleados();
        System.out.println("Empleados hombres");

        //Forma antigua
        empleados.stream().filter(new Predicate<Empleado>() {
            @Override
            public boolean test(Empleado empleado) {
                return empleado.esHombre();
            }
        }).forEach(empleado-> {
            System.out.println(" Nombre del empleado: "+empleado.getNombre()+ " - Genero: "+empleado.getGenero());
        });

        //Forma nueva, filter tiene que devolver un booleano, es como el filter de js
        System.out.println("Empleados Mujeres");
        empleados.stream().filter(Empleado::esMujer).forEach(empleado-> {
            System.out.println(" Nombre del empleado: "+empleado.getNombre()+ " - Genero: "+empleado.getGenero());
        });

        System.out.println("Empleados Mayores a 25 años");
        empleados.stream().filter(emp -> emp.getEdad() > 5).forEach(empleado-> {
            System.out.println(" Nombre del empleado: "+empleado.getNombre()+ " - Edad: "+empleado.getEdad() );
        });

        //Se pueden usar varios filter seguidos
        System.out.println("Empleados Masculino cuyo nombre comience con la letra a ");
        empleados.stream()
                .filter(Empleado::esHombre)
                .filter(emp-> emp.getNombre().toUpperCase().startsWith("A"))
                .forEach(empleado-> {
            System.out.println(" Nombre del empleado: "+empleado.getNombre()+ " - Genero: "+empleado.getGenero());
        });

        //Se puede usar varias condiciones
        System.out.println("Empleados Masculino que gana arriba de 500");
        empleados.stream()
                .filter(emp-> emp.esHombre() && emp.getIngresos() > 500)
                .forEach(empleado-> {
                    System.out.println(" Nombre del empleado: "+empleado.getNombre()+ " - : "+empleado.getIngresos());
                });

        //Unificando varias condiciones con predicados nativos
        System.out.println("\nPersonal Femenino mayor de 25 años con ingresos por encima de los 300");
        Predicate<Empleado> empFemenino = emp -> emp.esMujer();
        Predicate<Empleado> esMayor25 = emp -> emp.getEdad() > 25;
        Predicate<Empleado> esMayo300 = emp -> emp.getIngresos() > 300;
        Predicate<Empleado> unificado = empFemenino.and(esMayor25).and(esMayo300);
        empleados.stream()
                .filter(unificado).forEach(empleado ->
                        System.out.println(" Nombre del empleado: "+empleado.getNombre()+ " - : "+ " - Genero: "+empleado.getGenero() +" - Ingreso: "+empleado.getIngresos())
                );

        System.out.println("Cantidad total:" + empleados.stream().filter(unificado).count());

    }

}
