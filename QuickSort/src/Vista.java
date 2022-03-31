//José Raúl Resendiz Carrillo y Humberto Antonio Salinas Cortés
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Vista {
    public double [] pedirDatos(double vector[]){
        String cad;
        int i;
        for (i = 0; i<vector.length; i++){
            cad = JOptionPane.showInputDialog("Ingresar la aportaci\u00f3n\n\n\n Trabajador "+(i+1));

            try {
                vector[i]=Integer.parseInt(cad);
            } catch (Exception e) {
                i--;
            }
            
            
        }
        return vector;
    }
    public void mostrarVector(double []vector, String mensaje){
        JOptionPane.showMessageDialog(null,mensaje+"\n\n"+Arrays.toString(vector));
    }

    public void muestra(double vector[]){
        JOptionPane.showMessageDialog(null, "La mayor aportacion fue: \n"+(vector[29])+"\n\n La menor aportacion fue:\n"+vector[0]);
    }
}
