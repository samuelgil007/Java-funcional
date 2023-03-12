package Streams.OperacionesReduccionMutables;

import java.util.*;
import java.util.stream.Collectors;

import Streams.Pojos.Empleado;

public class Collect {
    
    public static void main(String[] args) {

        //Con arrayList
         List<String> nombres = Empleado.empleados()
                 .stream()
                 .map(Empleado::getNombre)
                 .collect(ArrayList::new,ArrayList::add,ArrayList::addAll
                 );
 
        //CON COLLECTORS

        //Con set no tiene repetidos, a diferencia del tolist()
         Set<String> nombress = Empleado.empleados()
                 .stream()
                 .map(Empleado::getNombre)
                 .collect(Collectors.toSet());
         System.out.println("Lista de nombres");
        
 
        //IPISIS
        //Retorna una lista sin ordenar de ningun modo
        /*
        .stream()
            .map(Proponente::getIdeaId)
            .map(this::obtenerIdea)
            .collect(Collectors.toList());
        */

        //Ordena los elementos de manera natural
         SortedSet<String> nombres = Empleado.empleados()
                 .stream()
                 .map(Empleado::getNombre)
                 .collect(Collectors.toCollection(TreeSet::new) );
 
         System.out.println("Lista de nombres");
         nombres.forEach(System.out::println);
     }
}
