public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("pesce");
        Lion lion = new Lion("leone");
        Cow cow = new Cow("mucca");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}