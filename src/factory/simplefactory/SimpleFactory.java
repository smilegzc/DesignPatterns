package factory.simplefactory;

/**
 * 简单工厂，但是扩展性差
 */
public class SimpleFactory {
    public Car creatCar() {
        /**
         * 业务逻辑代码或Car操作代码
         */
        return new Car();
    }

    public Plan creatPlan() {
        /**
         * 业务逻辑代码或Plan操作代码
         */

        return new Plan();
    }
}
