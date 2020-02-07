package strategy;

public class Pig {
    int width;
    int height;
    int food;

    public Pig(int width, int height, int food) {
        this.width = width;
        this.height = height;
        this.food = food;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "width=" + width +
                ", height=" + height +
                ", food=" + food +
                '}';
    }
}
