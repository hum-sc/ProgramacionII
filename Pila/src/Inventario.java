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
        } else return "No hay paquetes";
        
    }
    public String peek(){
        if (!paquetes.isEmpty()){
            String data = paquetes.peek();
            return data;
        } else return "No hay paquetes";
    }
}
