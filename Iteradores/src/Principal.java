//Humberto Antonio Salinas Cortés y José Raúl Resendiz Carrillo 

public class Principal {
    public static void main(String[] args) throws Exception {
        Articulos articulos= new Articulos();
        System.out.println(articulos.consultarFor());
        System.out.println(articulos.consultarIterator());
    }
}
