public class Nodo {
    public int id;
    public String descripcion;
    public Nodo hijoI, hijoD, padre, raiz;

    public Nodo(int id, String descripcion, Nodo padre){
        this.id = id;
        this.descripcion = descripcion;
        this.padre = padre;
    }

    public void preOrden(Nodo nodo){
        if(nodo != null){
            System.out.println(nodo.getId());
            preOrden(nodo.getHijoI());
            preOrden(nodo.getHijoD());
        }
    }

    public void enOrden(Nodo nodo){
        if (nodo != null){
            enOrden(nodo.getHijoI());
            System.out.println(nodo.getId());
            enOrden(nodo.getHijoD());
        }
    }

    public void posOrden(Nodo nodo){
        if(nodo != null){
            posOrden(nodo.getHijoI());
            posOrden(nodo.getHijoD());
            System.out.println(nodo.getId());
        }
    }

    public void insertarNodo(int id, String descripcion){
        Nodo padre;
        padre = buscarPadreCreador(id);
        Nodo nodo = new Nodo(id, descripcion, padre);

        if(raiz == null) nodo.setRaiz(nodo);
        else if (nodo.getId() <= nodo.padre.getId()){
                nodo.padre.setHijoI(nodo);
            } else {
                nodo.padre.setHijoD(nodo);
            }
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

    public boolean eliminar(Nodo nodo){
        boolean tieneHijoD, tieneHijoI;
        tieneHijoD = (nodo.getHijoD() != null) ? true: false;
        tieneHijoI = (nodo.getHijoI() != null) ? true : false;

        if(tieneHijoD == false && tieneHijoI == false) return eliminaCaso1(nodo);
        else if (tieneHijoD && tieneHijoI) return eliminaCaso3(nodo);
            else return eliminaCaso2(nodo);
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

    public boolean eliminaCaso3(Nodo nodo){
        Nodo masI;
        masI = recorrerIzquierda(nodo.getHijoD());

        System.out.println("El nodo remplazado es:"+ masI.getId());
        if (masI != null){
            nodo.setId(masI.getId());
            nodo.setDescripcion(masI.getDescripcion());
            eliminar(masI);
            return true;
        }
        return false;
    }


    public Nodo recorrerIzquierda(Nodo nodo){
        if(nodo.getHijoI() != null) return recorrerIzquierda(nodo.getHijoI());
        return nodo;
    }

    public Nodo buscarNodo(int elemento){
        Nodo aux;
        aux = raiz;

        while(aux.getId() != elemento){
            aux = (elemento < aux.getId()) ? aux.getHijoI(): aux.getHijoD();
            if (aux == null) break;
        }
        return aux;
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
