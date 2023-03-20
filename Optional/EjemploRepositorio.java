package Optional;

import Optional.models.Computador;
import Optional.repositorio.ComputadorRepositorio;
import Optional.repositorio.Repositorio;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        //Aqui se usa un repositorio con optional para evitar los nulos.
        repositorio.filtrar("rog").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró"));

        //Optional<Computador> pc = repositorio.filtrar("asus rog");

        /*if(pc.isPresent()) {
            System.out.println(pc.get());
        } else {
            System.out.println("No se encontró");
        }*/
    }
}
