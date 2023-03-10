package MetodosReferenciados;

public class ProveedorComparaciones {

    public int comparaPorNombre(Persona per1, Persona per2){
        return per1.getNombre().compareTo(per2.getNombre());
    }

    public int compararPorEdad(Persona a, Persona b){
        return a.getEdad().compareTo(b.getEdad());
    }

}