import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Inventario pila = new Inventario();
        Vista vista = new Vista();
        String paises;
        int opcion;

        do{
            vista.mostrarMensaje("Menu");
            vista.mostrarMensaje("1. Entrada");
            vista.mostrarMensaje("2. Salida");
            vista.mostrarMensaje("3. Paquete a enviar");
            vista.mostrarMensaje("4. Lista de paquetes");
            vista.mostrarMensaje("5. Salir");
        
            opcion = vista.leeEntero("Opcion");
            switch(opcion){
                case 1: 
                    paises = vista.leeString("Ingresar el Pais: ");
                    pila.push(paises);
                    break;
                case 2: vista.mostrarMensaje(pila.pop());
                    break;
                case 3: vista.mostrarMensaje(pila.peek());
                    break;
                case 4: vista.mostrarVector(pila.paquetes, "Paquetes en la pila: ");
                    break;
            }
        }while(opcion != 5);
    }
}
