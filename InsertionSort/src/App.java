//José Raúl Resendiz Carrillo y Humberto Antonio Salinas Cortés
public class App {
    public static void main(String[] args) throws Exception {
       TiroBlanco tiroBlanco = new TiroBlanco();
       Vista vista = new Vista();
       vista.pedirDatos(tiroBlanco.puntuaciones);
       vista.mostrarVector(tiroBlanco.puntuaciones, "Las puntuaciones sin ordenar:");
       tiroBlanco.ordenarAscendente();
       vista.mostrarVector(tiroBlanco.puntuaciones, "Las puntuaciones en orden ascendente:");
       tiroBlanco.ordenarDescendente();
       vista.mostrarVector(tiroBlanco.puntuaciones, "Las puntuaciones en orden descendente:");
       vista.mediana(tiroBlanco.puntuaciones);
       tiroBlanco.calcProm();
       vista.prom(tiroBlanco.prom);
    }
}
