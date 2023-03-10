package InterfacesFuncionales.Function;

import Comensal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Un metodo que nos devuelve una lista de los atributos que queramos!
public class MainFuncionApplyParametrizable {

    public static void main(String[] args) {
        List<Comensal> lisaComensales = Arrays.asList(
                new Comensal("Javier", 10, 5),
        new Comensal("Javier", 10, 5),
        new Comensal("Javier", 10, 5),
        new Comensal("Javier", 10, 5),
        new Comensal("Javier", 10, 5),
        new Comensal("Javier", 10, 5),
        new Comensal("Javier", 10, 5),
        new Comensal("Javier", 10, 5)
        );

        List<Object> nombresComensales = getDatosComensales(lisaComensales,(x)-> x.getNombre());

        System.out.println("La lista de nombres comensales es la siguiente: ");
        for (Object x  :
                nombresComensales) {
            System.out.println("El nombre es: "+(String) x);
        }

        List<Object> montoComensales = getDatosComensales(lisaComensales,(x)-> x.getMontoPedido());
        for (Object x  :
                montoComensales) {
            System.out.println("El monto es: "+(Double) x);
        }

    }

    public static List<Object> getDatosComensales(List<Comensal> listaCom, Function<Comensal,Object> func){
        //Esta lista guardara datos personalizados de  los comensales
        List<Object> listaDatos = new ArrayList<>();

        //iterrar a traves de la lista de comensales que recibimos
        for (Comensal comensal : listaCom) {
            listaDatos.add(func.apply(comensal));
        }
        return listaDatos;
    }

}