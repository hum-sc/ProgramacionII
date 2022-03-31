//José Raúl Resendiz Carrillo y Humberto Antonio Salinas Cortés
public class App {
    public static void main(String[] args) throws Exception {
        CajaAhorro cajaAhorro = new CajaAhorro();
        Vista vista = new Vista();
        vista.pedirDatos(cajaAhorro.aportaciones);
        vista.mostrarVector(cajaAhorro.aportaciones, "Las aportaciones de la caja de ahorro sin ordenar:");
        cajaAhorro.sort(0, cajaAhorro.aportaciones.length-1);
        vista.mostrarVector(cajaAhorro.aportaciones, "Las aportaciones de la caja de ahorro ordeadas:");
        vista.muestra(cajaAhorro.aportaciones);
    }
}
