import java.lang.Character.Subset;
import java.util.Scanner;

public class ArchivoGuardarAlumno {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        CrearArchivo archivoNuevo = new CrearArchivo();
        EscribirLeerAlumno alumno = new EscribirLeerAlumno();
        int op;
        do{
            System.out.println("Menu Alumnos");
            System.out.println("1. Pedir/Guardar datos");
            System.out.println("2. Cargar/Escribir datos");
            System.out.println("3. Salir");
            op = entrada.nextInt();
            entrada.nextLine();
            System.out.println(op);
            switch(op){
                case 1: System.out.print("Dame el nombre del archivo: ");
                        archivoNuevo.nuevoArchivo(entrada.nextLine());
                        alumno.guardarDatos(archivoNuevo.getNombre());
                        break;
                case 2: System.out.print("Dame el nombre del archivo a cargar: ");
                        archivoNuevo.nuevoArchivo(entrada.nextLine());
                        alumno.cargarDatos(archivoNuevo.getNombre());
                        break;
            }
        } while(op != 3);
    }
}
