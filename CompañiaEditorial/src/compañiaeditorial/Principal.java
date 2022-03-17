
package compañiaeditorial;
/**
 *
 * @author José Raúl Resendiz Carrillo, Humberto Antonio Salinas Cortés
 */ 
import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CD cd = new CD();
        Libro libro = new Libro();
        //Cd
        escribir("Iniciando la captura de datos...");
        escribir("\nCD:\nIngresa el titulo: ");
        cd.setTitulo(teclado.nextLine());
        escribir("Ingresa el precio: ");
        cd.setPrecio(teclado.nextDouble());
        escribir("Ingresa los minutos de duración: ");
        cd.setMinutos(teclado.nextInt());
        //Libro
        teclado.nextLine();
        escribir("\nLibro:\nIngresa el titulo: ");
        
        libro.setTitulo(teclado.nextLine());
        escribir("Ingresa el precio: ");
        libro.setPrecio(teclado.nextDouble());
        escribir("Ingresa el número de páginas: ");
        libro.setNumPaginas(teclado.nextInt());
        
        //Escritura de datos
        escribir("\nCD:");
        escribir("Titulo: "+cd.getTitulo());
        escribir("Precio: "+cd.getPrecio()+"$");
        escribir("Minutos de duración: "+cd.getMinutos());
        
        escribir("\nLibro: ");
        escribir("Titulo: "+libro.getTitulo());
        escribir("Precio: "+libro.getPrecio()+"$");
        escribir("Número de páginas: "+libro.getNumPaginas());
        teclado.close();
    }
    
    public static void escribir(String mensaje){
        System.out.println(mensaje);
    }
    
}
