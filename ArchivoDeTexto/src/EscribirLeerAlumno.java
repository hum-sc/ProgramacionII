import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirLeerAlumno {
    int cuenta;
    String nombre;
    float calificacion;

    public int getCuenta() {
        return cuenta;
    }
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    /*Este metodo guarda datos, primero trata de crear el archivo y si se crea correctamente,
    un ciclo se ejecuta para poblar el archivo con el numero de datos que se desea.
    En caso de que surja un error al crear el archivo, el programa no hace nada.
     */
    public void guardarDatos(String nombreArchivo) throws IOException{
        try(FileWriter archivoEscribir = new FileWriter(nombreArchivo)) {
            int numeroAlumnos, i;
            Scanner entrada = new Scanner (System.in);
            System.out.print("Dame el numero de alumnos: ");
            numeroAlumnos = entrada.nextInt();
            for (i=1; i<= numeroAlumnos; i++){
                System.out.print("Cuenta: "); this.setCuenta(entrada.nextInt());entrada.nextLine();
                System.out.print("Nombre: "); this.setNombre(entrada.nextLine());
                System.out.print("Calificacion: "); this.setCalificacion(entrada.nextFloat());

                archivoEscribir.write(cuenta+" "+nombre+" "+calificacion+"\n");
            }
            archivoEscribir.close();
        }
    }
    /*Este metodo sirve para recuperar los datos de un archivo del que se recibe el nombre cómo parametro.
    Intenta recuperar el documento, si lo logra con un while imprime las lineas del archivo,
    en caso de que no se pueda recuperar el archivo (este no haya sido creado) no hace nada,
    pero si al imprimir los datos hay un error (de tipo entrada/salida) el programa te dice que hay un error */
    public void cargarDatos(String nombreArchivo) throws FileNotFoundException, IOException{
        try(FileReader archivoLeer = new FileReader(nombreArchivo)){
            Scanner alumno = new Scanner(archivoLeer);

            BufferedReader registro = new BufferedReader(archivoLeer);

            String linea = registro.readLine();

            while(linea != null){
                System.out.println(linea);
                linea = registro.readLine();
            }
            archivoLeer.close();
        }catch (IOException ioe){
            System.out.println("Error en el archivo");
        }
    }
}
