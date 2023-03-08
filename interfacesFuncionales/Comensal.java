package interfacesFuncionales;

public class Comensal {

    private String nombre;

    private Double montoPedido;

    private int mesa;

    public Comensal(String nombre, double montoPedido, int mesa) {
        this.nombre = nombre;
        this.montoPedido = montoPedido;
        this.mesa = mesa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMontoPedido() {
        return montoPedido;
    }

    public void setMontoPedido(Double montoPedido) {
        this.montoPedido = montoPedido;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
}