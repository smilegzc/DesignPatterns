package factory.simplefactory;

public class Main {
    public static void main(String[] args) {
        //Moveable move = new Plan();
        //move.go();

        SimpleFactory sf = new SimpleFactory();
        sf.creatCar().go();
        sf.creatPlan().go();
    }
}
