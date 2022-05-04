//Humberto Antonio y Raul Resendiz
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Nodo arbol = new Nodo();
        Vista vista = new Vista();
        int option = 0;
        int id;
        String descripcion;
        Nodo nodo;

        while (option != 5){
            option = vista.leeEntero("\n 1.- Insertar\n 2.- Eliminar\n 3.- Buscar\n 4.- Mostrar\n 5.- Salir\n Escribe la opcion:");

            switch (option) {
                case 1:
                    id = vista.leeEntero("Ingresa la clave:");
                    descripcion = vista.leeString("Ingresa la descripcion del calzado:");
                    vista.mostrarMensaje(arbol.insertarNodo(id, descripcion));
                    break;
                case 2:
                    id = vista.leeEntero("Ingrese la clave del producto a eliminar:");
                    nodo = arbol.buscarNodo(id);
                    vista.mostrarMensaje(arbol.eliminar(nodo));
                    break;
                case 3:
                    id = vista.leeEntero("Ingrese la clave del producto a buscar:");
                    nodo = arbol.buscarNodo(id);
                    vista.mostrarMensaje(((nodo != null) ? "Se encontro el producto y sus datos son:\nClave: "
                        +nodo.getId()+"\nDescripcion: "+nodo.getDescripcion():"No existe el nodo"));
                    break;
                case 4:
                
                    vista.mostrarMensaje("Pre orden: "+ arbol.preOrden(arbol.getRaiz()));
                    vista.mostrarMensaje("En orden: "+ arbol.enOrden(arbol.getRaiz()));
                    vista.mostrarMensaje("Pos orden: "+arbol.posOrden(arbol.getRaiz()));
                    break;
            }

        }
        teclado.close();
    }
}
