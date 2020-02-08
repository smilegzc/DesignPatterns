package factory.abstractfactory;

import factory.abstractfactory.factory.Factory;
import factory.abstractfactory.factory.Food;
import factory.abstractfactory.factory.Vehicle;
import factory.abstractfactory.factory.Weapon;

public class ModenFactory extends Factory {
    @Override
    public Food creatFood() {
        return new Bread();
    }

    @Override
    public Weapon creatWeapon() {
        return new AK47();
    }

    @Override
    public Vehicle creatVehicle() {
        return new Car();
    }
}
