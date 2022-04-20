//Jose Raul y Humberto
public class Alumno {
    int cuenta;
    String nombre;
    double calificacion;
    Alumno(int cuenta, String nombre, double calificacion){
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.calificacion = calificacion;

    }
    public double getCalificacion() {
        return calificacion;
    }
    public int getCuenta() {
        return cuenta;
    }
    public String getNombre() {
        return nombre;
    }
    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
