package factory.abstractfactory;

import factory.abstractfactory.factory.Vehicle;

public class Car extends Vehicle {
    @Override
    public void go() {
        System.out.println("Car go");
    }
}
