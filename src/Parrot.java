class Parrot extends Animal implements Bird {
    private String color;

    public Parrot(String name, int age, String color, String spotty) {
        super(name, age, AnimalTipe.BIRD, spotty);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeSound() {
        System.out.println("sound ");
    }

    public void fly() {
        System.out.println(getName() + " is flying");
    }

    public void playWith() {
        System.out.println(getName() + " playing ");
    }
}
