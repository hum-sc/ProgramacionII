public class Principal {
    public static void main(String[] args) throws Exception {
        
        Cuadrado cuadrado = new Cuadrado();
        escribir(cuadrado.toString());

        Rectangulo rectangulo = new Rectangulo();
        escribir(rectangulo.toString());

        TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero();
        escribir(trianguloEquilatero.toString());
        
    }

    public static void escribir(String mensaje){
        System.out.println(mensaje);
    }
}
