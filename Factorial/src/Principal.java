public class Principal {
    public static void main(String[] args) throws Exception {
        Factorial numFactorial = new Factorial(3);
        numFactorial.setFactorial(numFactorial.Fact(numFactorial.getNumero()));
        System.out.println("El factorial del numero "+numFactorial.getNumero()+" es: "+numFactorial.getFactorial());
    }
}
