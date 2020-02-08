package factory.simplefactory;

public class Plan implements Moveable {
    @Override
    public void go() {
        System.out.println("I'm a plan!");
    }
}
