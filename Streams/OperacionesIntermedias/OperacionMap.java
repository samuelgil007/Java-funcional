package Streams.OperacionesIntermedias;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import Streams.Pojos.Empleado;

//Usa interfaz funcional function, genera otro stream a partir de lo que pase en el cuerpo del lambda
public class OperacionMap {
    
    public static void main(String[] args) {

        //Forma antigua
        IntStream.rangeClosed(1,5).map(new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand * operand;
            }
        }).forEach(System.out::println);

        IntStream.rangeClosed(1,10).map(n-> n*2).forEach(System.out::println);


        List<Empleado> empleados  = Empleado.empleados();
        System.out.println("Promedio de ingresos de personal femenino mayor de 25");

        Predicate<Empleado> predicateEsMujer = new Predicate<Empleado>() {
            @Override
            public boolean test(Empleado o) {
                return o.esMujer();
            }
        };
        Predicate<Empleado> predicateEsMayor25 = (empleado) -> empleado.getEdad() > 25;

        Predicate<Empleado> predicateEsMujerMayor25 = predicateEsMujer.and(predicateEsMayor25);

        // Filtra, genera un stream de doubles y al final suma todos los datos del stream con sum()
        double suma = empleados.stream()
                .filter(predicateEsMujerMayor25)
                .mapToDouble(Empleado::getIngresos).sum();

        double promedio = suma / empleados.stream()
                .filter(predicateEsMujerMayor25).count();

        System.out.println("El promedio es: "  +promedio);

    }
}
