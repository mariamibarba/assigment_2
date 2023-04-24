public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("jeka", 9, "spotty", "High");
        dog.makeSound();
        dog.fetch();

        Parrot parrot = new Parrot("Chiko", 1, "Green", "spotty");

        parrot.makeSound();
        parrot.fly();
        parrot.playWith();
    }
}