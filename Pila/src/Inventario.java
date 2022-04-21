import java.util.LinkedList;
public class Inventario {
    LinkedList <String> paquetes;
    
    Inventario(){
        paquetes = new LinkedList<String>();
    }
    
    public void push(String pais){
        paquetes.push(pais);
    }
    
    public void pop(){
        paquetes.pop();
    }

    public String peek(){
        String data = paquetes.peek();
        return data;
    }
}
