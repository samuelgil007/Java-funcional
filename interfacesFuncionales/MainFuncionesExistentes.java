package interfacesFuncionales;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainFuncionesExistentes {
    //Vamos a usar interfaces funcionales que ya existen.
    public static void main(String args[]) {

        //La interfaz function solo acepta un parametro
        Function <Integer,String> convertidor = x -> Integer.toString(x);
        System.out.println(convertidor.apply(1234).length());

        //La interfaz acepta dos parametros, el tipo se pone antes en los <>, siendo el tercero el resultado.
        BiFunction<String,String,String> bi =(x,y) -> x+y;
        System.out.println(bi.apply("Hola", " mundo bi"));

        //Le damos un valor y nos devuelve un booleano
        Predicate<Integer> pre = (valor) -> valor > 12;
        System.out.println(pre.test(11));

        //Le damos dos valores y nos devuelve un booleano
        BiPredicate<Integer,Integer> bp = (x,y)-> x < y;
        System.out.println(bp.test(2,3));

        //Le damos un valor y no devuelve nada, es void
        Consumer<String> cons = (x) -> System.out.println(x.toUpperCase());
        cons.accept("Lucas");

        //Le damos dos valores y no devuelve nada, es void
        BiConsumer<Double,Double> biConsumer = (num1,num2)->{
            double mult = num1 * num2;
            System.out.println("La multiplicacion es: "+ mult);
        };
        biConsumer.accept(15.2,52.25);
    }

}