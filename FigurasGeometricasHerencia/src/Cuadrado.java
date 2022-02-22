public class Cuadrado extends FiguraGeometrica {
    public double lado;
    Cuadrado(){
        super("Cuadrado", 4);
        escribir("Ingresa el valor del lado: ");
        setLado(teclado.nextDouble());
        escribir("Calculando el area y perimetro...");
        calcularArea();
        calcularPerimetro();
    }

    public void calcularArea(){
        setArea(lado*lado);
    }

    public void calcularPerimetro(){
        setPerimetro(lado*numLados);
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
        return "Nombre: "+nombre+"\nNumero de lados: "+numLados+"\nTamaño de cada lado: "+lado+"\nArea: "+area+"\nPerimetro: "+perimetro;
    }
}
