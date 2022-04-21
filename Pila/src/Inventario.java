//José Raúl Resendiz Carrillo y Humberto Antonio Salinas Cortés
import java.util.LinkedList;
public class Inventario {
    public LinkedList <String> paquetes;
    
    Inventario(){
        paquetes = new LinkedList<String>();
    }
    
    public void push(String pais){
        paquetes.push(pais);
    }
    
    public String pop(){
        if(!paquetes.isEmpty()){
            String data = "Eliminando el paquete del pais: " + peek();
            paquetes.pop();
            return data;
        } else return "Lista vacia";
        
    }

    public String peek(){
        String data = paquetes.peek();
        return data;
    }
}
