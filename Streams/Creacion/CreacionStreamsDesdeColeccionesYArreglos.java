package Streams.Creacion;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import Streams.Pojos.Estudiante;

public class CreacionStreamsDesdeColeccionesYArreglos {
    
    public static void main(String[] args) {
        IntStream numStream = Arrays.stream(new int[]{1,2,3,4,5,6});
        numStream.forEach(System.out::println);

        Stream<String> nombres = Arrays.stream(new String[]{"Juan","Pedro","Maria"});
        nombres.forEach(System.out::println);

        Set<String> lenguajeSet = new HashSet<>();
        lenguajeSet.add("JAVA");
        lenguajeSet.add("C++");
        lenguajeSet.add("C#");

        lenguajeSet.stream().forEach(System.out::println);

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan",25, 25,25));
        estudiantes.add(new Estudiante("Mario",25, 25,25));
        estudiantes.add(new Estudiante("Ramiro",25, 25,25));
        estudiantes.add(new Estudiante("Esteban",25, 25,25));
        estudiantes.add(new Estudiante("Maria",25, 25,25));

        Stream<Estudiante> estudianteStream = estudiantes.parallelStream();
        estudianteStream.forEach(estudiante -> System.out.println(estudiante.getIdentificacion()));

    }
}
