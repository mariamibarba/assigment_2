abstract class Animal {
    private String name;
    private int age;
    private AnimalTipe type;
    private String habitat;

    public Animal(String name, int age, AnimalTipe type, String habitat) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AnimalTipe getType() {
        return type;
    }

    public void setType(AnimalTipe type) {
        this.type = type;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public abstract void makeSound();
}