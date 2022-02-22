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

    public void calcularArea(){
        setArea((lado*lado*Math.sqrt(3))/4);
    }

    public void calcularPerimetro(){
        setPerimetro(lado*numLados);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nombre: "+nombre+"\nNumero de lados: "+numLados+"\nTamaño de cada lado: "+lado+"\nArea: "+area+"\nPerimetro: "+perimetro;
    }
}
