package interfacesFuncionales;

import java.util.function.Function;

public class MainFuncionesExistentes {
    //Vamos a usar interfaces funcionales que ya existen.
    public static void main(String args[]) {
        Function <Integer,String> convertidor = x -> Integer.toString(x);
        System.out.println(convertidor.apply(1234).length());
    }

}