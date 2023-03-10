package InterfacesFuncionales.BiPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Principal {

    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Rodrigo",25,1500,"Cobranzas"),
                new Empleado("Alicia",25,1500,"ventas"),
                new Empleado("manolo",30,1500,"ventas"),
                new Empleado("Cinthia",20,2500,"Mostrador"),
                new Empleado("Estebann",25,7000,"ventas"),
                new Empleado("Damaris",20,600,"Telemarketinng"),
                new Empleado("Lina",36,2500,"Mostrador"),
                new Empleado("Nayeli",41,10000,"Mostrador"),
                new Empleado("Flor",52,7000,"compras"),
                new Empleado("German",41,1500,"Facturacion"),
                new Empleado("Lidia",21,600,"Telemarketinng"),
                new Empleado("Eleazar",33,600,"Cobranzas"),
                new Empleado("Javier",35,600,"Cobranzas"),
                new Empleado("Paola",50,1500,"compras"),
                new Empleado("Ignacio",41,1500,"Cobranzas"),
                new Empleado("Rodrigo",40,7000,"Recursos humanos")
        );

        Evaluador evaluador = new Evaluador();
        BiPredicate<Integer,String> primerCriterio =
                (edad,departamento)-> (edad >= 25 ) && (departamento.equals("Ventas"));

        BiPredicate<Integer,String> segundaCriterio =
                (edad,departamento)-> (edad >= 25 ) && (departamento.equals("Mostrador"));

        //Es como tener un if con las validaciones de cada uno y un or en la mitad.
        BiPredicate<Integer,String> criterio = primerCriterio.or(segundaCriterio);

        System.out.println("Empleados de mostador o ventas mayores de 25");
        List<Empleado> listaActulizada = evaluador.evaluar(listaEmpleados,criterio);

        for (Empleado empleado : listaActulizada) {
            System.out.println(""
            + " Nombre: "+ empleado.getNombre()
            + " Edad: "+ empleado.getEdad()
            + " Departamento: "+ empleado.getDepartamento());
        }
    }

}
