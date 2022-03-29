//José Raúl Resendiz Carrillo y Humberto Antonio Salinas Cortés
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Vista {
    int familiaRica;
    public float [] pedirDatos(float vector[]){
        String cad;
        familiaRica = 0;
        int i;
        for (i = 0; i<vector.length; i++){
            cad = JOptionPane.showInputDialog("Ingresa las puntuaciones\n\n\n Puntuacion "+(i+1)+":");
            vector[i]=Float.parseFloat(cad);
            if (vector[i]> vector[familiaRica]) familiaRica = i;
        }
        return vector;
    }
    public void mostrarVector(float []vector, String mensaje){
        JOptionPane.showMessageDialog(null,mensaje+"\n\n"+Arrays.toString(vector));
    }

    public void mediana(float vector[]){
        int pos = vector.length / 2;
        JOptionPane.showMessageDialog(null, "La mediana es: \n\n"+vector[pos]);
    }
    public void prom(float prom){
        JOptionPane.showMessageDialog(null, "El promedio es: \n\n"+prom);
        
    }

}
