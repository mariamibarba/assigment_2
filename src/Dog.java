class Dog extends Animal {
    private String spotty;

    public Dog(String name, int age, String spotty, String height ) {
        super(name, age, AnimalTipe.MAMMAL, height);
        this.spotty = spotty;
    }

    public String getHeight() {
        return spotty;
    }

    public void setHeight(String legs) {
        this.spotty = legs;
    }

    public void makeSound() {
        System.out.println("hello from dog class");
    }

    public void fetch() {
        System.out.println(getName() + " hi");
    }
}