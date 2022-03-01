//Jose Raul Resendiz Carrillo y Humberto Antonio Salinas Cortes
import java.lang.Math;


public class TrianguloEquilatero extends FiguraGeometrica {
    public double lado;
    TrianguloEquilatero(){
        super("Triangulo", 3);
        escribir("Ingresa el valor del lado: ");
        setLado(teclado.nextDouble());
        escribir("Calculando area y perimetro: ");
        calcularArea();
        calcularPerimetro();
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nNombre: "+nombre+"\nNumero de lados: "+numLados+"\nTamaño de cada lado: "+lado+"\nArea: "+area+"\nPerimetro: "+perimetro;
    }

    @Override
    public void calcularArea(){
        setArea((lado*lado*Math.sqrt(3))/4);
    }

    @Override
    public void calcularPerimetro(){
        setPerimetro(lado*numLados);
    }
}
