public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal("pesce");
        Animal lion = new Lion("leone");
        Animal cow = new Cow("mucca");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}