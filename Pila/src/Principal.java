//José Raúl Resendiz Carrillo y Humberto Antonio Salinas Cortés
public class Principal {
    public static void main(String[] args) throws Exception {
        Inventario inventario = new Inventario();
        Vista vista = new Vista();
        String paises;
        int opcion;

        do{        
            opcion = vista.leeEntero("Menu \n1. Entrada\n2. Salida\n3. Paquete a enviar\n4. Lista de paquetes\n5. Salir");
            switch(opcion){
                case 1: 
                    paises = vista.leeString("Ingresar el Pais: ");
                    inventario.push(paises);
                    break;
                case 2: vista.mostrarMensaje(inventario.pop());
                    break;
                case 3: vista.mostrarMensaje(inventario.peek());
                    break;
                case 4: vista.mostrarVector(inventario.paquetes, "Paquetes en la inventario: ");
                    break;
            }
        }while(opcion != 5);
    }
}
