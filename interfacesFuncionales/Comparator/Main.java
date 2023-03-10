package interfacesFuncionales.Comparator;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        List<String> nombres = Arrays.asList("Carlos","Ana","Abías","Germán");
        System.out.println("List antes de ordenarse: "+nombres);
        Collections.sort(nombres);
        System.out.println("List despues de ordenarse: "+nombres);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(2,"Mario",simpleDateFormat.parse("11-10-2012")));
        personas.add(new Persona(3,"Fernando",simpleDateFormat.parse("01-01-2022")));
        personas.add(new Persona(4,"Omar",simpleDateFormat.parse("01-11-2005")));
        personas.add(new Persona(5,"Juana",simpleDateFormat.parse("01-10-1995")));


        System.out.println("Lista de personas sin ordenar : "+personas.toString());

        Collections.sort(personas);

        System.out.println("Lista de personas ordenadas por nombre: "+personas.toString());

        //Collections.sort(personas,new OrdenarPersonaPorId());

        /*
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getIdPersona() - o2.getIdPersona();
            }
        });*/

        //nos ayuda a organizar listas por medio de lambda
        Collections.sort(personas,(o1, o2) -> o1.getIdPersona() - o2.getIdPersona());

        System.out.println("Lista de personas ordenadas por id : "+personas.toString());

    }
}
