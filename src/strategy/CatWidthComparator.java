package strategy;

public class CatWidthComparator implements Comparator<Cat>{

    @Override
    public int compar(Cat c1, Cat c2) {
        if(c1.width < c2.width)
            return -1;
        else if(c1.width > c2.width)
            return 1;
        else
            return 0;
    }
}
