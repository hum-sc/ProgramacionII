import java.io.RandomAccessFile;
import java.util.Scanner;

public class App {
    static RandomAccessFile archivo;
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String nombreArchivo;
        System.out.print("Dame el nombre del archivo para trabajar: ");
        nombreArchivo = entrada.nextLine();

        archivo = new RandomAccessFile(nombreArchivo, "rw");
        AccesoAleatorio archivoAleatorio = new AccesoAleatorio(archivo);

        archivoAleatorio.crearArchivo(nombreArchivo);

        archivoAleatorio.mostrarArchivo();

        System.out.print("Dame la posicion a buscar: ");
        archivoAleatorio.buscarDato(entrada.nextInt());
    }
}
