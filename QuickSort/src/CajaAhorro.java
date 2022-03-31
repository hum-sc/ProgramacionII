//José Raúl Resendiz Carrillo y Humberto Antonio Salinas Cortés
public class CajaAhorro {
    double aportaciones[];
    CajaAhorro(){
        aportaciones = new double[30];
    }

    public void sort(int li, int ls){
        double piv = aportaciones[li];
        int i = li;
        int j = ls;
        double aux;
        while (i<j){
            while(aportaciones[i]<=piv && i<j)i++;
            while(aportaciones[j]>piv)j--;
            if(i<j){
                aux = aportaciones[i];
                aportaciones[i]=aportaciones[j];
                aportaciones[j]=aux;
            }
        }
        aportaciones[li]=aportaciones[j];
        aportaciones[j]=piv;

        if(li < j-1){
            sort(li, j-1);
        }
        if(j+1<ls){
            sort(j+1, ls);
        }
    }
}
