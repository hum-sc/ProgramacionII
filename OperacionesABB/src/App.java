import java.util.Scanner;
import java.util.function.BiPredicate;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Nodo raiz = Nodo.insertarNodo(1, "raiz");
        int option = 0;

        while (option != 5){
            System.out.println("1.- Insertar");
            System.out.println("2.- Eliminar");
            System.out.println("3.- Buscar");
            System.out.println("4.- Mostrar");
            System.out.println("5.- Salir");
            System.out.println("Escribe la opcion:");
            option = teclado.nextInt();

            switch (option) {
                case 1:
                    raiz.insertarNodo(1, "descripcion" );
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        }
    }
}
