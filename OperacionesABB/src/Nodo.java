public class Nodo {
    public int id;
    public String descripcion;
    public Nodo hijoI, hijoD, padre, raiz;
    public Nodo(){}
    public Nodo(int id, String descripcion, Nodo padre){
        this.id = id;
        this.descripcion = descripcion;
        this.padre = padre;
    }

    public String preOrden(Nodo nodo){
        if(nodo != null){
            Nodo i = nodo.getHijoI();
            Nodo d = nodo.getHijoD(); 
            return "\nClave: "+nodo.getId()+" Descripcion: "+nodo.getDescripcion()
                +((i != null)? preOrden(i) : "")
                +((d != null) ? preOrden(d):"");
        }
        return("");
    }

    public String enOrden(Nodo nodo){
        if (nodo != null) {
            Nodo i = nodo.getHijoI();
            Nodo d = nodo.getHijoD(); 
            return  ((i != null)? enOrden(i) : "") 
                + "\nClave: "+ nodo.getId() + " Descripcion: "+nodo.getDescripcion()
                +((d != null) ? enOrden(d):"");
        }
        return "";
    }

    public String posOrden(Nodo nodo){
        if(nodo != null){
            Nodo i = nodo.getHijoI();
            Nodo d = nodo.getHijoD(); 
            return ((i != null) ? posOrden(i): "")
                +((d != null) ? posOrden(d):"")
                +"\nClave: "+nodo.getId()+" Descripcion: "+nodo.getDescripcion();
        }
        return "";
    }

    public String insertarNodo(int id, String descripcion){
        String data="Nodo creado\n";
        Nodo padre = buscarPadreCreador(id);
        Nodo nodo = new Nodo(id, descripcion, padre);
        if(raiz == null) {
            setRaiz(nodo);
            data += "Este es el nodo raiz";
        } else if (nodo.getId() <= nodo.padre.getId()){
                nodo.padre.setHijoI(nodo);
                data += "Hijo izquierdo del nodo: "+nodo.padre.getId();
            } else {
                nodo.padre.setHijoD(nodo);
                data += "Hijo derecho del nodo: "+nodo.padre.getId();
            }
        
        return data+"\nClave: "+ id + "\nDescripcion: "+descripcion;
        
    }

    public Nodo buscarPadreCreador(int id){
        Nodo padre, aux;
        padre = null;
        aux = raiz;
        while(aux != null){
            padre = aux;
            if(aux.getId() > id) aux = aux.getHijoI();
            else aux = aux.getHijoD();
        }
        return padre;
    }

    public String eliminar(Nodo nodo){
        boolean tieneHijoD, tieneHijoI;
        boolean status = false;
        String data ="";
        if(nodo != null){
            tieneHijoD = (nodo.getHijoD() != null) ? true: false;
            tieneHijoI = (nodo.getHijoI() != null) ? true : false;
            if(tieneHijoD == false && tieneHijoI == false) status = eliminaCaso1(nodo);
            else if (tieneHijoD && tieneHijoI){
                data = eliminaCaso3(nodo);
                status = (data != "")?true:false;
            } else status = eliminaCaso2(nodo);
        }
        

        return (status ? "El producto de los siguientes datos fue eliminado:\nClave: "+nodo.getId()+"\nDescripcion: "+nodo.getDescripcion() 
            : "No existe el producto")+"\n"+((data != "") ? data: "");
    }

    public boolean eliminaCaso1(Nodo nodo){
        Nodo hijoI, hijoD;
        hijoI = nodo.getPadre().getHijoI();
        hijoD = nodo.getPadre().getHijoD();
        if(hijoI == nodo){
            nodo.getPadre().setHijoI(null);
            return true;
        }
        if (hijoD == nodo){
            nodo.getPadre().setHijoD(null);
            return true;
        }
        return false;
    }

    public boolean eliminaCaso2(Nodo nodo){
        Nodo hijoI, hijoD, hijoActual;
        hijoI = nodo.getPadre().getHijoI();
        hijoD = nodo.getPadre().getHijoD();

        hijoActual = (nodo.getHijoI() != null) ? nodo.getHijoI(): nodo.getHijoD();

        if (hijoI == nodo){
            nodo.getPadre().setHijoI(hijoActual);
            hijoActual.setPadre(nodo.getPadre());
            nodo.setHijoD(null);
            nodo.setHijoI(null);
            return true;
        }
        if (hijoD == nodo){
            nodo.getPadre().setHijoD(hijoActual);
            hijoActual.setPadre(nodo.getPadre());
            nodo.setHijoD(null);
            nodo.setHijoI(null);
            return true;
        }
        return false;
    }

    public String eliminaCaso3(Nodo nodo){
        Nodo masI;
        masI = recorrerIzquierda(nodo.getHijoD());

        if (nodo != null){
            nodo.setId(masI.getId());
            nodo.setDescripcion(masI.getDescripcion());
            eliminar(masI);

            return "El nodo reemplazado es:"+masI.getId();
        }
        return "";
    }


    public Nodo recorrerIzquierda(Nodo nodo){
        if(nodo.getHijoI() != null) return recorrerIzquierda(nodo.getHijoI());
        return nodo;
    }

    public Nodo buscarNodo(int elemento){
        Nodo aux;
        aux = raiz;
        if(aux != null){
            while(aux.getId() != elemento){
                aux = (elemento < aux.getId()) ? aux.getHijoI(): aux.getHijoD();
                if (aux == null) break;
            }
            return aux;
        }
        return null;
    }


    //Getters y setters
    public Nodo getRaiz() {
        return raiz;
    }
    
    public Nodo getHijoI() {
        return hijoI;
    }
    public Nodo getHijoD() {
        return hijoD;
    }
    public int getId() {
        return id;
    }

    public Nodo getPadre() {
        return padre;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void setHijoD(Nodo hijoD) {
        this.hijoD = hijoD;
    }
    public void setHijoI(Nodo hijoI) {
        this.hijoI = hijoI;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
