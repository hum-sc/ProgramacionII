//Humberto Antonio Salinas Cortés y José Raúl Resendiz Carrillo 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Articulos {
    private ArrayList<Articulo> articulos;
    private Iterator<Articulo> iterator;
    private Scanner teclado = new Scanner(System.in);
    Articulos(){
        articulos = new ArrayList<>();
        for (int i=1; i<=10; i+=1){
            escribir("\nProducto: "+i);
            escribir("\nIngresa la clave: ");
            String clave = teclado.nextLine();
            escribir("Ingrese la descripcion: ");
            String descripcion = teclado.nextLine();
            escribir("Ingrese la cantidad: ");
            int cantidad = teclado.nextInt();
            escribir("Ingrese el precio: ");
            double precio = teclado.nextDouble();
            articulos.add(new Articulo(descripcion, clave, precio, cantidad));
            teclado.nextLine();
        }
        iterator = articulos.iterator();
    }

    public String consultarFor(){
        String consulta = "Con ciclo for:";
        for (int i = 0; i<10; i++){
            consulta+='\n'+articulos.get(i).toString();
        }
        return consulta;
    }

    public String consultarIterator(){
        String consulta ="Con iterador:";
        while (iterator.hasNext()){
            consulta+='\n'+iterator.next().toString();
        }
        return consulta;
    }

    private void escribir(String mensaje){
        System.out.println(mensaje);
    }
    
}
