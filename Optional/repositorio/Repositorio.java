package Optional.repositorio;

import Optional.models.Computador;

import java.util.Optional;

//Generic con metodo oprional filtrar
public interface Repositorio<T> {

    Optional<Computador> filtrar(String nombre);

}
