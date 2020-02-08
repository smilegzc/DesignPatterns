package factory.abstractfactory;

import factory.abstractfactory.factory.Food;

public class Bread extends Food {
    @Override
    public void eat() {
        System.out.println("Food eat!");
    }
}
