//José Raúl Resendiz Carrillo y Humberto Antonio Salinas Cortés 
public class Principal {
    public static void main(String[] args) throws Exception {
        Planta planta = new Planta();
        AnimalCarnivoro animalCarnivoro = new AnimalCarnivoro();
        AnimalHerbivoro animalHerbivoro = new AnimalHerbivoro();

        planta.alimentarse();
        animalCarnivoro.alimentarse();
        animalHerbivoro.alimentarse();
    }
}
