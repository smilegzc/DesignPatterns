package singleton;

//实现简单，易懂。缺点，不管类是否会被用到，都会实例化
public class Mgr02 {
    private static final Mgr02 INSTANCE = new Mgr02();

    private Mgr02() {

    }

    public static Mgr02 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("Mgr02");
    }
}