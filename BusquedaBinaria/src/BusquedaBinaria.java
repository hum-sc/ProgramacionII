//José Raúl Resendiz Carrillo y Humberto Antonio Salinas Cortés
public class BusquedaBinaria {
    int[] numeros;
    BusquedaBinaria(){
        numeros = new int[200];
        for (int i = 0; i<200; i++){
            numeros[i] = (int) (Math.random()*200+1);
        }
    }
    public void sort(int li, int ls){
        int piv = numeros[li];
        int i = li;
        int j = ls;
        int aux;
        while (i<j){
            while(numeros[i]<=piv && i<j)i++;
            while(numeros[j]>piv)j--;
            if(i<j){
                aux = numeros[i];
                numeros[i]=numeros[j];
                numeros[j]=aux;
            }
        }
        numeros[li]=numeros[j];
        numeros[j]=piv;

        if(li < j-1){
            sort(li, j-1);
        }
        if(j+1<ls){
            sort(j+1, ls);
        }
    }
    public int busquedaBinaria(int n)
    {
        int lo = 0, hi = numeros.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (numeros[mid] == n)
                return mid;

            if (numeros[mid] < n)
                lo = mid + 1;

            else
                hi = mid - 1;
        }
        return -1;
    }
}
