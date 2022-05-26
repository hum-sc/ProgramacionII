import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
//Humberto Antonio y José Raúl Resendiz
public class AccesoAleatorio {
    String nombre;
    RandomAccessFile archivoAleatorio;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public AccesoAleatorio(RandomAccessFile archivoAleatorio){
        this.archivoAleatorio = archivoAleatorio;
    }
    /**
     * Crea un archivo con el parametro recibido como nombre.
     * Para llenarlo se pide la cantidad de claves, y mediante un
     * for se pobla el archivo, notese que el puntero se posiciona siempre al final
     * del archivo
     * @param nombre
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void crearArchivo(String nombre) throws FileNotFoundException, IOException{
        Scanner entrada = new Scanner(System.in);
        int total, clave;
        
        this.setNombre(nombre);

        System.out.println("Dame el total de claves: ");
        total = entrada.nextInt();
        for(int i = 1; i<=total; i++){
            System.out.print("Clave "+i+": ");
            clave = entrada.nextInt();
            //Posicionas el puntero a donde quieres manejar los datos
            archivoAleatorio.seek(archivoAleatorio.length());
            //Manejas los datos
            archivoAleatorio.writeInt(clave);    
        }
    }
    /**
     * Se encarga de mostrar el archivo creado anteriormente
     * en este caso, el puntero se coloca al inicio, y despues de leer
     * cada entero, el puntero se movera, en caso de que ya no tengamos 
     * datos lanzara un error de tipo EOFException, lo cual aprovecharemos para
     * poner fin al ciclo e indicar el fin del archivo.
     * @throws IOException
     */

    public void mostrarArchivo()throws IOException{
        int clave;
        try{
            archivoAleatorio.seek(0);
            while(true){
                //Despus de ejecutar el readInt el puntero se mueve
                clave = archivoAleatorio.readInt();
                System.out.println(clave);
            }
        }catch (EOFException e){
            System.out.println("Fin de fichero");
        }
    }

    /**
     * En este caso buscamos si el dato en la posición "n" existe en nuestro fichero,
     * primero regresamos el puntero al inicio, posteriormente lo colocamos en la posicion deseada.
     * 
     * Notese que al posicionarlo empleamos la operacion (n-1)*4
     * donde  (n-1) señala la posición
     * *4 es un multiplicador del tamaño del dato, por ejemplo, en este caso,
     * el tamaño de int es 4 bytes.
     * 
     * es decir, cada que se lee un entero el puntero se mueve 4 bytes.
     * 
     * En caso de que no exista algun valor en la posicion indicada, nos lanzará un error
     * de tipo EOFException que usaremos para indicar que no existe dentro del fichero, así como para 
     * darle fin
     * @param n
     * @throws IOException
     */

    public void buscarDato(int n) throws IOException{
        int clave;
        try{
            archivoAleatorio.seek(0);
            /**
             * Aqui (n-1) señala la posición
             * *4 es un multiplicador del tamaño del dato, por ejemplo, en este caso,
             * el tamaño de int es 4 bytes.
             * 
             * es decir, cada que se lee un entero el puntero se mueve 4 bytes.
             */
            archivoAleatorio.seek((n-1)*4);
            clave = archivoAleatorio.readInt();
            System.out.println("La clave en la posicion "+n+" es: "+clave);
        }  catch (EOFException e){
            System.out.println("Fin de fichero, no existe esa posicion");
        }
    }

}
