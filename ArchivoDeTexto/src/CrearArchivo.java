import java.io.File;
import java.io.IOException;

public class CrearArchivo {
    String nombre;
    String path;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    /*Crea un archivo con el nombre que se recibe de parametro,
    antes verifica si el archivo ya se ha creado; en caso de que sí,
    el programa te regresa la ruta absoluta dónde está guardado.
     */
    public void nuevoArchivo(String nombreArchivo) throws IOException{
        File archivo = new File(nombreArchivo);
        boolean creado = false;

        this.setNombre(nombreArchivo);
        if(archivo.exists()){
            System.out.println(archivo.exists());
            this.setPath(archivo.getAbsolutePath());
            System.out.println("Archivo existente en la ruta:\n"+this.getPath());
        }else{
            creado = archivo.createNewFile();
            System.out.println("Archivo creado con el nombre de: "+this.getNombre());
            System.out.println(archivo.exists());
        }
    }
}
