package Optional;

import Optional.models.Computador;
import Optional.repositorio.ComputadorRepositorio;
import Optional.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        // Computador defecto = new Computador("HP Omen", "LA0001");

        //Busquelo y si no existe se instancia el de por defecto
        Computador pc = repositorio.filtrar("rog").orElse(valorDefecto());
        System.out.println(pc);

        //Busquelo y si no existe se instancia con la expresion lambda (supplier)
        pc = repositorio.filtrar("macbook pro").orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);
        System.out.println(pc);

    }

    public static Computador valorDefecto(){
        System.out.println("Obteniendo valor por defecto!!!");
        return new Computador("HP Omen", "LA0001");
    }
}
