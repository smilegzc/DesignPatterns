package factory.abstractfactory;

import factory.abstractfactory.factory.Food;

public class OldFood extends Food {
    @Override
    public void eat() {
        System.out.println("Old food eat!");
    }
}
