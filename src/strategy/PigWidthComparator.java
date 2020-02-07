package strategy;

public class PigWidthComparator implements Comparator<Pig> {

    @Override
    public int compar(Pig p1, Pig p2) {
        if(p1.width < p2.width)
            return -1;
        else if(p1.width > p2.width)
            return 1;
        else
            return 0;
    }
}
