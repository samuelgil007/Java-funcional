package MetodosReferenciados;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas =
                Arrays.asList(
                        new Persona("Juan",10,"juan@hotmail.com"),
                        new Persona("Mario",20,"mario@hotmail.com"),
                        new Persona("Arturo",30,"arturo@hotmail.com"),
                        new Persona("Maria",40,"maria@hotmail.com"),
                        new Persona("Beatriz",50,"beatriz@hotmail.com"),
                        new Persona("Olivia",60,"olivia@hotmail.com"),
                        new Persona("Angel",70,"angel@hotmail.com"),
                        new Persona("Omar",80,"omar@hotmail.com"),
                        new Persona("Pamela",90,"pamela@hotmail.com"),
                        new Persona("Sadee",25,"sadee@hotmail.com")
                );
        System.out.println("Personas sin ordenar: ");
        personas.forEach(p-> System.out.println(p));
        System.out.println("");
        /*
        Collections.sort(personas,(persona1,persona2)->Persona.compararPorEdad(persona1,persona2));
        */

        //Metodos estatico de instancia de un objeto
        Collections.sort(personas,Persona::compararPorEdad);
        System.out.println("Personas ordenadas por edad: ");
        personas.forEach(p-> System.out.println(p));

        //Metodo de instancia de un objeto 
        ProveedorComparaciones proveedorComparaciones = new ProveedorComparaciones();
        Collections.sort(personas,proveedorComparaciones::comparaPorNombre);
        System.out.println("Personas ordenadas por nombre: ");
        personas.forEach(System.out::println);

        //Metodos de instancia de un objeto arbitrario pero de un tipo en particular
        Collections.sort(personas,Persona::compararPorEdad2);
        //(per1,per2)->per1.compararPorEdad2(per2) equivale a la de arriba
    }
}
