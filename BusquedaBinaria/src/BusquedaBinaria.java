public class BusquedaBinaria {
    int[] numeros;
    BusquedaBinaria(){
        numeros = new int[200];
        for (int i = 0; i<200; i++){
            numeros[i] = (int) (Math.random()*200+1);
        }
    }
        int busquedaBinaria(int arr[], int numeros)
        {
            int lo = 0, hi = arr.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
    
                if (arr[mid] == numeros)
                    return mid;
    
                if (arr[mid] < numeros)
                    lo = mid + 1;
    
                else
                    hi = mid - 1;
            }
            return -1;
        }
        public static int buscar(int n) {
            return 0;
        }
}
