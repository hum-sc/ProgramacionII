//Humberto Antonio Salinas Cortes y Jose Raul Resendiz Carrillo
import java.util.Scanner;

public class Seleccion {
    private double temp[];
    private Scanner teclado; 
    
    Seleccion(){
        temp =  new double[28];
        teclado = new Scanner(System.in);  
        for (int i = 0; i<28; i++){
            temp[i]=teclado.nextDouble();
        }
        
    }
    public void ordenar(){
        System.out.println("Ordenando");
        int i,j, min; 
        double aux;
        for(i=0; i<28; i=i+1){
            min=i;
            for(j=i+1;j<28;j=j+1){
                if(temp[j]<temp[min])min=j;
            }
            aux=temp[i];
            temp[i]=temp[min];
            temp[min]=aux;
        }
    }
    public void desplegar(){
        System.out.println("Imprimiendo");
        for (int i = 0; i<28; i++){
            System.out.println(temp[i]);
        }
    }
}
