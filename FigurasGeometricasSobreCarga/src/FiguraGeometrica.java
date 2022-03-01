//Jose Raul Resendiz Carrillo y Humberto Antonio Sanlinas Cortes
import java.util.Scanner;
import java.lang.Math;
public class FiguraGeometrica {
    public String nombre;
    public int numLados;
    public double area, perimetro;
    public Scanner teclado = new Scanner(System.in);
    
    FiguraGeometrica(String nombre, int numLados){
        setNombre(nombre);
        setNumLados(numLados);
        escribir("\nIniciando la creacion del "+nombre);
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

    //SobreCarga
    //Cuadrado
    public void calcularArea(double lado){
        setArea(lado*lado);
    }
    //Triangulo
    public void calcularArea(double base, double altura){
        setArea((base*altura)/2);
    }

    public void calcularPerimetro(double lado){
        setPerimetro(lado*numLados);
    }
    public void calcularPerimetro(double base, double altura){
        double mediaBase = base / 2;
        double a = Math.sqrt(Math.pow(mediaBase, 2)+Math.pow(altura, 2));
        setPerimetro(2*a*base);
    }
}
