package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Creamos un stream a partir de numeros, usamos parallelStream() para un stream multi nucleo
        Stream<Integer> numerosStream = numeros.stream();

        //Stream() = creamos un stream
        //Filter y map, operaciones intermedias para realizarle operaciones
        //Filter, operador predicate nos devuelve el objeto si cumple el booleano
        //map, operador funcion, recibe un objeto y devuelve uno con el mismo tipo
        //Reduce = operacion terminal, reduce los elementos  de una colecciona un solo valor
        int suma = numerosStream.filter(n-> n%2 ==1) //{1,3,5}
            .map(n-> n*n) // {1,9,25}
            .reduce(0,Integer::sum); //{35}
        System.out.println("La suma de los numeros impares es : "+suma);
    }
}
