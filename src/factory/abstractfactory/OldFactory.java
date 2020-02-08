package factory.abstractfactory;

import factory.abstractfactory.factory.Factory;
import factory.abstractfactory.factory.Food;
import factory.abstractfactory.factory.Vehicle;
import factory.abstractfactory.factory.Weapon;

public class OldFactory extends Factory {
    @Override
    public Food creatFood() {
        return new OldFood();
    }

    @Override
    public Weapon creatWeapon() {
        return new OldWeapon();
    }

    @Override
    public Vehicle creatVehicle() {
        return new OldVehicle();
    }
}
