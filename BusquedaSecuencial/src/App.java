//Humberto Antonio Salinas Cortés y José Raul Resendiz Carrillo
public class App {
    public static void main(String[] args) throws Exception {
        BusquedaSecuencial busquedaSecuencial = new BusquedaSecuencial();
        Vista vista = new Vista();
        vista.muestraMensaje("Generando el vector");
        vista.mostrarVector(busquedaSecuencial.numeros, "Vector generado");
        int n;
        int isFinded;
        for (int i = 0; i<3; i++){
            n = vista.leeEntero("Ingresa el numero "+(i+1)+" a buscar");
        
            isFinded = busquedaSecuencial.buscar(n);
            if (isFinded != -1){
                vista.muestraMensaje("El numero: "+n+" esta en la posicion: "+isFinded);
            } else vista.muestraMensaje("No se encontro el numero "+n);
        }
    }
}
