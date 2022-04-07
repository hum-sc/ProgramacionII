//José Raúl Resendiz Carrillo y Humberto Antonio Salinas Cortés
public abstract class AnimalCarnivoro extends Animal {
    AnimalCarnivoro(){}
    @Override
    public void alimentarse(){
        System.out.println("Se alimenta de carne");
    }
    abstract void correr();
    
}
