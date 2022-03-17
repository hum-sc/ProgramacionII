//Humberto Antonio Salinas Cortés y José Raúl Resendiz Carrillo 
public class Articulo {
    private String descripcion, clave;
    private double precio;
    private int cantidad;

    Articulo(String descripcion, String clave, double precio, int cantidad){
        this.descripcion = descripcion;
        this.clave = clave;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Clave: "+clave+"\nDescripcion: "+descripcion+"\nPrecio: "+precio+"\nCantidad: "+cantidad;
    }
}
