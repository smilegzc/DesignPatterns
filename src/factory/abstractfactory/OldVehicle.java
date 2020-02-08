package factory.abstractfactory;

import factory.abstractfactory.factory.Vehicle;

public class OldVehicle extends Vehicle {
    @Override
    public void go() {
        System.out.println("Old vehicle go!");
    }
}
