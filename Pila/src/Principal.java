import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.ln);
        Inventario pila = new Inventario();
        String paises;

        do{
            System.out.println("Menu");
            System.out.println("1. Entrada");
            System.out.println("2. Salida");
            System.out.println("3. Paquete a enviar");
            System.out.println("4. Lista de paquetes");
            System.out.println("5. Salir");
            System.out.println("Obcion: ");
            
            paises = entrada.nextLine();

        }
    }
}
