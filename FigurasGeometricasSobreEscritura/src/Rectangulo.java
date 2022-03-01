//Jose Raul Resendiz Carrillo y Humberto Antonio Salinas Cortes
public class Rectangulo extends FiguraGeometrica {
    public double lado, base;
    Rectangulo(){
        super("Rectangulo", 4);
        escribir("Ingrese el lado: ");
        setLado(teclado.nextDouble());
        escribir("Ingresa la base: ");
        setBase(teclado.nextDouble());
        escribir("Calculando area y perimetro...");
        calcularArea();
        calcularPerimetro();
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
         
        // TODO Auto-generated method stub
        return "\nNombre: "+nombre+"\nNumero de lados: "+numLados+"\nTamaño de lado: "+lado+"\nTamaño de la base: "+base+"\nArea: "+area+"\nPerimetro: "+perimetro;
    }

    @Override
    public void calcularArea(){
        setArea(lado*base);
    }
    @Override
    public void calcularPerimetro(){
        setPerimetro(((2*base)+(2*lado)));
    }
}
