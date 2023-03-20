package Optional;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {
        
        String nombre = "Andrés";
        //crear optional apartir de un valor, si es null se rompe
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());
        }

        System.out.println(opt.isEmpty());

        //Expresion lambda de ifpresent
        opt.ifPresent( valor -> System.out.println("Hola " + valor));

        nombre = "John";
        //crear optional apartir de un valor, si es null NO se rompe
        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());

        //Expresion lambda de IF ELSE present
        opt.ifPresentOrElse(valor -> System.out.println("Hola " + valor),
                () -> System.out.println("No está presente"));

        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());
        } else {
            System.out.println("No está presente");
        }

        //Crear optional vacio
        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isPresent());
    }
}
