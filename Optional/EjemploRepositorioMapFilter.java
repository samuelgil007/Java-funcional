package Optional;

import Optional.models.Computador;
import Optional.models.Fabricante;
import Optional.models.Procesador;
import Optional.repositorio.ComputadorRepositorio;
import Optional.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        //Flatmap devuelve lista de opcionales
        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(f);


    }

}
