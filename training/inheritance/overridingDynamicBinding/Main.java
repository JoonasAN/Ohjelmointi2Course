package training.inheritance.overridingDynamicBinding;

public class Main {
    public static void main(String[] args) {
        /*Vehicle f = new Vehicle();
        f.printMe();

        Bike a = new Bike();
        a.printMe();

        Car o = new Car();
        o.printMe();*/

        //Vehicle f = new Bike();
        //f.printMe();

        //Vehicle f = new Car();
        //f.printMe();

        Fruit f = new Fruit();
        f.printMe();
        
        Fruit a = new Apple();
        a.printMe();

        Fruit o = new Orange();
        o.printMe();
    }
}
