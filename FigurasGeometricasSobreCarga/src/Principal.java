//Jose Raul Resendiz Carrillo y Hunberto Antonio Salinas Cortes
public class Principal {
    public static void main(String[] args) throws Exception {
        
        Cuadrado cuadrado = new Cuadrado();
        escribir(cuadrado.toString());

        Triangulo triangulo = new Triangulo();
        escribir(triangulo.toString());
    }

    public static void escribir(String mensaje){
        System.out.println(mensaje);
    }
}
