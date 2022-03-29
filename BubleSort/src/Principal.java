//José Raúl Resendiz Carrillo y Humberto Antonio Salinas Cortés

public class Principal {
    public static void main(String[] args) throws Exception {
        Vista vista = new Vista();
        Celulares cel = new Celulares();
        vista.pedirDatos(cel.numeros);
        vista.mostrarVector(cel.numeros, "Las cantidades de numeros de celular sin ordenar son:");
        cel.ordenarAscendente();
        vista.mostrarVector(cel.numeros, "Las cantidades de numeros de celular ordenados de manera ascendente");
        cel.ordenarDescendente();
        vista.mostrarVector(cel.numeros, "Las canticades de numeros de celular ordenados de manera descendente");
        vista.muestra(cel.numeros, 0);

    }
}
