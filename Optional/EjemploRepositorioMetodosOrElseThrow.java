package Optional;

import Optional.models.Computador;
import Optional.repositorio.ComputadorRepositorio;
import Optional.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        //Si no existe, hace expresion lambda para lanzar una excepcion
        Computador pc = repositorio.filtrar("rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);
        String archivo = "documento.pdf";

        //genera un filter para retornar los que tengan un punto, luego genera con el map un stream con las extensions y si no existe 
        //lanza una excepcion
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println(extension);


    }
}
