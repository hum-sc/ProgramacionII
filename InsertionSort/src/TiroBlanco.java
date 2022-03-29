//José Raúl Resendiz Carrillo y Humberto Antonio Salinas Cortés

public class TiroBlanco {
    public float[] puntuaciones;
    public float prom;
    TiroBlanco(){
        puntuaciones=new float[25];
    }

    public void ordenarAscendente(){
        for(int i = 0; i<25; i++){
            float indice = puntuaciones[i];
            int a = i-1;
            while(a >= 0 && puntuaciones[a]>indice){
                puntuaciones[a+1]=puntuaciones[a];
                a--;
            }
            puntuaciones[a+1]=indice;
        }
    }
    public void ordenarDescendente(){
        for(int i = 0; i<25; i++){
            float indice = puntuaciones[i];
            int a = i-1;
            while(a >= 0 && puntuaciones[a]<indice){
                puntuaciones[a+1]=puntuaciones[a];
                a--;
            }
            puntuaciones[a+1]=indice;
        }
    }

    public void calcProm(){
        float data=0;
        for (int i = 0; i<25; i++){
            data += puntuaciones[i];
        }
        prom = data/puntuaciones.length;
    }

}
