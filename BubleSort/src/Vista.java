//José Raúl Resendiz Carrillo y Humberto Antonio Salinas Cortés
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Vista {
    int familiaRica;
    public int [] pedirDatos(int vector[]){
        String cad;
        familiaRica = 0;
        int i;
        for (i = 0; i<vector.length; i++){
            cad = JOptionPane.showInputDialog("Ingresar cantidad de celulares\n\n\n Familia "+(i+1));
            vector[i]=Integer.parseInt(cad);
            if (vector[i]> vector[familiaRica]) familiaRica = i;
        }
        return vector;
    }
    public void mostrarVector(int []vector, String mensaje){
        JOptionPane.showMessageDialog(null,mensaje+"\n\n"+Arrays.toString(vector));
    }

    public void muestra(int vector[], int pos){
        JOptionPane.showMessageDialog(null, "La familia que tiene más celulares es: \n\n"+(familiaRica+1)+"\n\n con "+vector[pos]+" celulares");
    }
}
