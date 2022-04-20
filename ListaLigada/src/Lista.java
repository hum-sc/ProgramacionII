//Jose Raul y Humberto
import java.util.LinkedList;
import java.util.Iterator;
public class Lista {
    LinkedList <Alumno> lista;
    Iterator <Alumno> iterador;
    Vista vista;
    Lista(){

        lista = new LinkedList<Alumno>();
        vista = new Vista();
    }

    public void inicio(){
        int option = -1;
        Alumno alumno;
        while (option!=7){
            option = 0;
            option = vista.leeEntero("Elige una accion:\n\t1.Insertar al inicio\n\t2.Insertar al final\n\t3.Eliminar al inicio\n\t4.Eliminar al final\n\t5.Buscar\n\t6.Mostrar\n\t7.Salir");
            switch (option) {
                case 1:
                    alumno = leerAlumno();
                    insertarInicio(alumno);
                    break;
                case 2:
                    alumno = leerAlumno();
                    insertarFinal(alumno);
                    break;
                case 3:
                    eliminarInicio();
                    break;
                case 4:
                    eliminaFinal();
                    break;
                case 5:
                    double n = vista.leeDouble("Ingrese el No. de cuenta del alumno que quiere buscar");
                    buscar(n);
                    break;
                case 6:
                    desplegarLista();
                    break;
            }
        }
    }

    public Alumno leerAlumno(){
        Alumno alumno;
        int cuenta;
        String nombre;
        double calificacion;
        cuenta = vista.leeEntero("Ingresa el numero de cuenta");
        nombre = vista.leeString("Ingresa el nombre");
        calificacion = vista.leeDouble("Ingresa la calificacion");
        alumno = new Alumno(cuenta, nombre, calificacion);
        return alumno;
    }

    public void insertarInicio(Alumno alumno){
        lista.addFirst(alumno);
        vista.mostrarMensaje("Alumno insertado");
    }

    public void insertarFinal(Alumno alumno){
        lista.addLast(alumno);
        vista.mostrarMensaje("Alumno insertado");
    }
    public void eliminarInicio(){
        if (!lista.isEmpty()){
            lista.removeFirst();
            vista.mostrarMensaje("Alumno eliminado");
        } else {
            vista.mostrarMensaje("Lista vacia");
        }
    }

    public void eliminaFinal(){
        if(!lista.isEmpty()){
            lista.removeLast();
            vista.mostrarMensaje("Alumno eliminado");
        } else vista.mostrarMensaje("Lista vacia");
    }
    public void buscar(double n){
        iterador = lista.iterator();
        boolean seEncontro = false;
        Alumno alumno;
        int index = 0;
        while(iterador.hasNext()){
            alumno = iterador.next();
            if (alumno.cuenta == n){
                seEncontro = true;
                index = lista.indexOf(alumno);
                break; 
            }
        }
        if (seEncontro){
            vista.mostrarMensaje("El alumno esta en la posicion: "+index);
        }else vista.mostrarMensaje("Alumno no encontrado :(");
    }
    public void desplegarLista(){
        iterador = lista.iterator();
        Alumno alumno;
        int total= 0;
        String data="";
        while (iterador.hasNext()){
            total ++;
            alumno = iterador.next();
            data+="\n"+total+".- Cuenta: "+alumno.getCuenta()+"\t\t Nombre: "+alumno.getNombre()+"\t\t Calificacion: "+alumno.getCalificacion();
        }
        vista.mostrarMensaje(data);
    }

    
}
