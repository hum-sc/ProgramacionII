public class Principal {
    public static void main(String[] args) throws Exception {
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria();
        Vista vista = new Vista();
        vista.muestraMensaje("Generando el vector");
        vista.mostrarVector(busquedaBinaria.numeros, "Vector generado");
        busquedaBinaria.sort(0, 199);
        vista.mostrarVector(busquedaBinaria.numeros, "Vector ordenado");
        int n;
        int isFinded;
        for (int i = 0; i<3; i++){
            n = vista.leeEntero("Ingresa el numero "+(i+1)+" a buscar");
        
            isFinded = busquedaBinaria.busquedaBinaria(n);
            if (isFinded != -1){
                vista.muestraMensaje("El numero: "+n+" esta en la posicion: "+isFinded);
            } else vista.muestraMensaje("No se encontro el numero "+n);
        }
    }
    }
