import java.util.Arrays;
import javax.swing.JOptionPane;
public class Vista {
    public int leeEntero(String mensaje){
        String cad;
        int choice;
        cad = JOptionPane.showInputDialog(mensaje);
        choice = Integer.parseInt(cad);
        return choice;
    }
    public void mostrarVector(int []vector, String mensaje){
        JOptionPane.showMessageDialog(null,mensaje+"\n\n"+Arrays.toString(vector));
    }

    public void muestraMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
