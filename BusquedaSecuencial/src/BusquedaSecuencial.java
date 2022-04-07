//Humberto Antonio Salinas Cortés y José Raul Resendiz Carrillo

public class BusquedaSecuencial {
    int[] numeros;
    BusquedaSecuencial(){
        numeros = new int[50];
        for (int i = 0; i<50; i++){
            numeros[i] = (int) (Math.random()*200+1);
        }
    }

    public int buscar(int number){
        for (int i = 0; i<50; i++){
            if(numeros[i]==number){
                return i;
            }
        }
        return -1;
    }
}
