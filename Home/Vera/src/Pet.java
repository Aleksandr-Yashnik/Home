public class Pet {
    public void makeSound() {
        System.out.println("Pet издает звуки.");
    }
    public void play(String toy) {
        System.out.println("Pet хочет играть c " + toy);
    }
    public void eat(String food) {
        System.out.println("Pet хочет есть " + food+ "?");
    }

    boolean notSleepsPet;
    public void sleep() {
        notSleepsPet = false;
        System.out.println("Pet спит");
    }
}
