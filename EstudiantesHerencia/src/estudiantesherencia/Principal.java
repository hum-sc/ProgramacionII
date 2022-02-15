
package estudiantesherencia;

import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Normal noBecado = new Normal();
        Becado becado = new Becado();
        
        escribir("Iniciando el proceso para el estudiante no becado ");
        escribir("Ingrese el nombre: ");
        noBecado.setNombre(teclado.nextLine());
        escribir("Ingrese el RFC: ");
        noBecado.setRfc(teclado.nextLine());
        escribir("Ingrese la colegiatura: "); 
        noBecado.setColegiatura(teclado.nextFloat());
        escribir("Ingrese el nombre del tutor: ");
        teclado.nextLine();
        noBecado.setNombreTutor(teclado.nextLine());
        
        escribir("\nIniciando el proceso para el estudiante becado ");
        escribir("Ingrese el nombre: ");
        becado.setNombre(teclado.nextLine());
        escribir("Ingrese el RFC: ");
        becado.setRfc(teclado.nextLine());
        escribir("Ingrese la colegiatura: ");
        becado.setColegiatura(teclado.nextFloat());
        escribir("Ingrese el porcentaje de beca: ");
        becado.setPorcentajeBeca(teclado.nextFloat());
        becado.setTotalPagar(becado.colegiaturaNeto());
        
        escribir("\nComenzando proceso de impresion de datos \nEstudiante no becado: ");
        escribir("Nombre: "+noBecado.getNombre());
        escribir("RFC: "+noBecado.getRfc());
        escribir("Nombre del tutor: "+noBecado.getNombreTutor());
        escribir("Colegiatura: "+noBecado.getColegiatura());
        
        escribir("\nEstudiante becado: ");
        escribir("Nombre: "+becado.getNombre());
        escribir("RFC: "+becado.getRfc());
        escribir("Porcentaje de Beca: "+becado.getPorcentajeBeca()+"%");
        escribir("Colegiatura: "+becado.getColegiatura());
        escribir("Total a pagar: "+becado.getTotalPagar());
        
        
        
    }
    public static void escribir (String mensaje){
    System.out.println(mensaje);
    
    }
}
