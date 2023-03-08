package Lambdas;

public class MainMethod {
    public static void main(String args[]) {
        System.out.println(metodo().calcular(1, 1));

    }

    //metodo que devuelve un lambda
    public static IntFuncionalConPara metodo(){
        return (x,y) -> x + y; //devuelve una clase intfuncionalconpara pero con este metodo lambda definido
    }
}