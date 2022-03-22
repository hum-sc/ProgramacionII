public class Factorial {
    private int numero;
    private int factorial;

    Factorial(int numero){
        this.numero = numero;
    }

    public int Fact(int num){
        int F;
        if (num == 0) F=1;
        else F = num*Fact(num-1);
        return F;
    } 
    public void setFactorial(int factorial) {
        this.factorial = factorial;
    }
    public int getFactorial() {
        return factorial;
    }

    public int getNumero() {
        return numero;
    }
}
