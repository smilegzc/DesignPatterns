package factory.simplefactory;

public class Car implements Moveable {
    @Override
    public void go() {
        System.out.println("I'm a car!");
    }
}
