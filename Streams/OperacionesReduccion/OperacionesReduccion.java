package Streams.OperacionesReduccion;

import java.util.List;
import java.util.stream.IntStream;

import Streams.Pojos.Empleado;

//Finalizan el stream en una operacion
public class OperacionesReduccion {
    
    public static void main(String[] args) {
        int[] numeros = {4,6,10,12,15,55,7,8,9,10,2,5,8,9,10,45,6,9,33,66,85,97,81,24,99};
        List<Empleado> empleados = Empleado.empleados();

        //Operaciones de reducción con números

        //suma de los elementos
        System.out.println("La suma es: "+
                IntStream.of(numeros).sum()
        );

        //Obtener promedio de los elementos
        System.out.println("El promedio de la lista es: "
        +IntStream.of(numeros
        ).average().getAsDouble()
        );

        //Obtener el minimo y el maximo
        System.out.println("El valor máximo es : "+  +IntStream.of(numeros
        ).max().getAsInt());

        System.out.println("El valor minimo es : "+  +IntStream.of(numeros
        ).min().getAsInt());

        // contar cantidad de elementos
        System.out.println("Cantidad de elementos : "+  +IntStream.of(numeros
        ).count());

        //Operaciones con empleados, convierte los ingresos del empleado en un stream y los suma
        System.out.println("Suma de salarios : "+
                empleados.stream().mapToDouble(Empleado::getIngresos).sum());

        //Obtener el empleado con el salario maximo
        Empleado empx = empleados.stream().max((o1, o2) -> (int) ( o1.getIngresos() - o2.getIngresos() )).orElse(null);
        System.out.println("Empleado máximo salario "+empx.getNombre()+ " : "+empx.getIngresos());
    }
}
