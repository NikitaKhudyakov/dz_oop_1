
public class Cat extends Animal {

    public Cat(String animal, String name, String color) {
        super(animal, name, color);
    
    }
    
    public void toGo() {
        System.out.println("Умеет Ходить");

    }

    public void toFly() {
        System.out.println("Не умеет Летать");
    }

    public void toSwim() {
        System.out.println("Не умеет Плавать");

    }
}
