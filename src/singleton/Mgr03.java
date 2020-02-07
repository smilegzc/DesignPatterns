package singleton;

//优点：懒加载，用到才加载，缺点：写法复杂
public class Mgr03 {
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