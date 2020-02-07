package singleton;

/**
 * 单例模式的几种写法，推荐第一种和第二种写法
 */
public class SintletonTest {
    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.INSTANCE;
        mgr01.m();

        Mgr02 mgr02 = Mgr02.getInstance();
        mgr02.m();

        Mgr03 mgr03 = Mgr03.getInstance();
        mgr03.m();
    }
}

//推荐写法,完美
enum Mgr01 {
    INSTANCE;

    public void m() {
        System.out.println("Mgr01");
    }
}

//实现简单，易懂。缺点，不管类是否会被用到，都会实例化
class Mgr02 {
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

//优点：懒加载，用到才加载，缺点：写法复杂
class Mgr03 {
    private static class Mgr03Holder {
        private static final Mgr03 INSTANCE = new Mgr03();
    }

    private Mgr03() {

    }

    public static Mgr03 getInstance() {
        return Mgr03Holder.INSTANCE;
    }

    public void m() {
        System.out.println("Mgr03");
    }
}