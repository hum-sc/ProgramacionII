//Jose Raul Resendiz Carrillo y Humberto Antonio Salinas Cortes


public class Triangulo extends FiguraGeometrica {
    public double base, altura;
    Triangulo(){
        super("Triangulo", 3);
        escribir("Ingresa el valor de la base: ");
        setBase(teclado.nextDouble());
        escribir("Ingresa el valor de la altura: ");
        setAltura(teclado.nextDouble());
        escribir("Calculando area y perimetro: ");
        calcularArea(getBase(), getAltura());
        calcularPerimetro(getBase(),getAltura());
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nNombre: "+getNombre()+"\nNumero de lados: "+getNumLados()+"\nTamaño de base: "+getBase()+"\nTamaño de altura: "+getAltura()+"\nArea: "+getArea()+"\nPerimetro: "+getPerimetro();
    }
}
