package factory.abstractfactory;

import factory.abstractfactory.factory.Weapon;

public class OldWeapon extends Weapon {
    @Override
    public void shoot() {
        System.out.println("Old weapon shoot");
    }
}
