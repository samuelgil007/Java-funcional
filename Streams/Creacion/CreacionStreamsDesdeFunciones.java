package Streams.Creacion;

import java.util.Random;
import java.util.stream.Stream;

public class CreacionStreamsDesdeFunciones {
    
    public static void main(String[] args) {

        //Con iterate se crean objetos comenzando desde 1L y se limita que sea hasta el numero 10
        Stream<Long> primerosDiez = Stream.iterate(1L , n -> n+1).limit(10);
        primerosDiez.forEach(System.out::println);

        //Con iterate se crean objetos comenzando desde 1L y se limita que sea hasta el numero 20, se filtran solo los pares
        Stream.iterate(1L, n -> n + 1 )
                .filter(n-> n % 2 == 0)
                .limit(20)
                .forEach(System.out::println);

        //Lo mismo que el anterior, pero con skip se salta los primeros 100
        System.out.println("\n despues de 100");
        Stream.iterate(1L, n -> n + 1 )
                .filter(n-> n % 2 == 0)
                .skip(100)
                .limit(5)
                .forEach(System.out::println);

        //Genera aleatorios, lo limita a los primeros 5 y los imprime
        System.out.println("\n Numeros aleatorios");
        Stream.generate(Math::random).limit(5).forEach(System.out::println);

        new Random().ints()
                .limit(5)
                .forEach(System.out::println);
    }
}
