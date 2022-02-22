import java.util.Scanner;
public class FiguraGeometrica {
    public String nombre;
    public int numLados;
    public double area, perimetro;
    public Scanner teclado = new Scanner(System.in);
    
    FiguraGeometrica(String nombre, int numLados){
        setNombre(nombre);
        setNumLados(numLados);
        escribir("Iniciando la creacion del "+nombre);
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public String getNombre() {
        return nombre;
    }
    public int getNumLados() {
        return numLados;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void escribir(String mensaje){
        System.out.println(mensaje);
    }
    
}
