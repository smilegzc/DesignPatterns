package strategy;

public class Cat implements Comparable<Cat>{
    int width;
    int height;

    public Cat(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int comparableTo(Cat cat) {
        if(this.width < cat.width)
            return -1;
        else if(this.width > cat.width)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
