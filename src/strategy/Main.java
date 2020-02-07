package strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] c = {new Cat(2,9), new Cat(9,5), new Cat(1,2), new Cat(4,6)};
        Dog[] d = {new Dog(3), new Dog(1), new Dog(9), new Dog(2)};
        Pig[] p = {new Pig(2,3,4), new Pig(3,5,1), new Pig(9,4,5)};

        Sorter.sort(c, new CatWidthComparator());
        System.out.println(Arrays.toString(c));

        Sorter.sort(c, new CatHeightComparator());
        System.out.println(Arrays.toString(c));

        Sorter.sort(d);
        System.out.println(Arrays.toString(d));

        Sorter.sort(p, new PigWidthComparator());
        System.out.println(Arrays.toString(p));
    }
}
