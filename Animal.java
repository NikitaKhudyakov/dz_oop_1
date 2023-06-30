public class Animal {
    public String name;
    protected String color;
    public String animal;

    public Animal(String animal, String name, String color) {
        this.name = name;
        this.color = color;
        this.animal = animal;

    }

    public void toGo() {
        System.out.println("Умеет Ходить");

    }

    public void toFly() {
        System.out.println("Умеет Летать");
    }

    public void toSwim() {
        System.out.println("Умеет Плавать");

    }

    public String toString() {

        return String.format("Animal: {animal = %s, name = %s, color = %s}", animal, name, color);
    }
}