package Lambdas;

public class Main {
    public static void main(String args[]) {

        //asignacion como referencia
        IntFuncionalSinPara f = () -> System.out.println("Hola lambdas");  //lambda sin parametros
        f.imprimir();

        //Se puede pasar como parametro de un metodo, se puede instanciar como la de sin parametros anterior, etc..
        imprimirResultados((x,y) -> x + y);
        imprimirResultados((x,y) -> x - y);
        imprimirResultados((x,y) -> x / y);
        imprimirResultados((x,y) -> x * y);

        //Codigo para castear metodos
        //imprimirResultados( (IntFuncionalSinPara) (x,y) -> x + y)
        /*intanciarlo de una vez con la clase que es parametro
            imprimirResultados(f);
        */
        /*Poner los tipos de parametros correctos
            imprimirResultados((int x,int y) -> x + y);
        */
    }
    
    public static void imprimirResultados(IntFuncionalConPara d){
        System.out.println(d.calcular(2,4));
    }

    public static void imprimirResultados(IntFuncionalSinPara d){
        d.imprimir();
    }

}