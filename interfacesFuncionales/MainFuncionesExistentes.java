package interfacesFuncionales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

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

        //No recibe nada y devuelve un string
        Supplier <String> sup = () ->  "Samuel";
        System.out.println(sup.get());

        //unaryoperator Recibe un tipo y devuelve el mismo tipo
        List<Integer> lista = Arrays.asList(
                10,20,30,40,50,60,70,80,90,100
        );
        List<Integer> listaAct = operadorUnary(num->num/num,lista);
        listaAct.forEach((x)->System.out.println(x));


        //Binaryoperator Recibe dos  tipo y puede hacer distintas operaciones
        BinaryOperator<Integer> bOperator = (num1,num2) -> num1 * num2;

        int resultado = bOperator.apply(10,20);
        System.out.println("El resultado es: "+resultado);

        //MINBY
        BinaryOperator<Integer> bOperatorMin =
        BinaryOperator.minBy((Integer t1, Integer t2)-> t1.compareTo(t2));
        resultado = bOperatorMin.apply(10,20);
        System.out.println("El numero menor de 10 y 20 es: "+resultado);

        //MAXBY
        BinaryOperator<Integer> bOperatorMax =
                BinaryOperator.maxBy((Integer t1, Integer t2)-> t1.compareTo(t2));
        resultado = bOperatorMax.apply(10,20);
        System.out.println("El numero mayor de 10 y 20 es: "+resultado);


        //Existen mas interfaces funcionales que son especializadas, 
        //es decir que funcion parecido a las anteriormente explicadas pero con diferentes tipos de datos
        
    }

    public static List<Integer> operadorUnary(UnaryOperator<Integer> unarayOpt,List<Integer> lista){
        List<Integer> listaActualizada = new ArrayList<>();
        lista.forEach((num)-> listaActualizada.add(unarayOpt.apply(num)));
        return listaActualizada;
    }
}