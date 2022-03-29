import java.beans.VetoableChangeListenerProxy;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Vista {
    public int [] pedirDatos(int vector[]){
        String cad;
        int i;
        for (i = 0; i<vector.length; i++){
            cad = JOptionPane.showInputDialog("Ingresar cantidad de celulares\n\n\n Familia "+(i+1));
            vector[i]=Integer.parseInt(cad);
        }
        return vector;
    }
    public void mostrarVector(int []vector, String mensaje){
        JOptionPane.showMessageDialog(null,mensaje+"\n\n"+Arrays.toString(vector));
    }

    public void muestra(int vector[], int pos){
        JOptionPane.showMessageDialog(null, "La cantidad de celulares mayor es: \n\n"+vector[pos]);
    }
}
