
public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Cat", "Barsik", "Black");
        Dug fifa = new Dug("Dug", "Fifa", "White");

        System.out.println(fifa);
        fifa.toGo();
        fifa.toFly();
        fifa.toSwim();
        System.out.println(barsik);
        barsik.toGo();
        barsik.toFly();
        barsik.toSwim();
        
    }
}