package strategy;

public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compar(Cat c1, Cat c2) {
        if(c1.height < c2.height)
            return -1;
        else if(c1.height > c2.height)
            return 1;
        else
            return 0;
    }
}
