package factory.abstractfactory;

import factory.abstractfactory.factory.Weapon;

public class AK47 extends Weapon {
    @Override
    public void shoot() {
        System.out.println("AK47 shoot!");
    }
}
