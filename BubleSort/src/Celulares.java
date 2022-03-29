import java.util.Scanner;
//José Raúl Resendiz Carrillo y Humberto Antonio Salinas Cortés

public class Celulares {

    public int numeros[];
    private Scanner teclado;

    Celulares(){
        numeros = new int[10];
        teclado = new Scanner(System.in);
    }
    public void ordenarAscendente(){
        int i,j;
        for(i=0; i<10; i=i+1){
            for(j=0; j<9; j=j+1){
                if(numeros[j]>numeros[j+1]){
                    int temporal = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temporal;
                }
            }
        }

    }
    public void ordenarDescendente(){
        int i,j;
        for(i=0; i<10; i=i+1){
            for(j=0; j<9; j=j+1){
                if(numeros[j]<numeros[j+1]){
                    int temporal = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temporal;
                }
            }
        }

    }
    public void desplegar(){
        System.out.println("Desplegando numeros de celular");
        for (int i =0; i<28; i++){
            System.out.println(numeros[i]);
        }
    }

}
