package strategy;

public class Sorter {

    public static void sort(Comparable[] c) {
        int length = c.length;

        for(int i = 0; i < length; i++) {
            for(int j = i+1; j < length; j++) {
                if(c[i].comparableTo(c[j]) > 0)
                    swap(c, i, j);
            }
        }
    }

    public static void sort(Object[] c, Comparator comparator) {
        int length = c.length;

        for(int i = 0; i < length; i++) {
            for(int j = i+1; j < length; j++) {
                if(comparator.compar(c[i], c[j]) > 0)
                    swap(c, i, j);
            }
        }
    }

    private static void swap(Object[] c, int i, int j) {
        Object temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
