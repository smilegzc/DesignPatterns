package factory.abstractfactory;

import factory.abstractfactory.factory.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new ModenFactory();
        //Factory factory = new OldFactory();

        factory.creatFood().eat();
        factory.creatVehicle().go();
        factory.creatWeapon().shoot();
    }
}
