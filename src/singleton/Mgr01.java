package singleton;

//推荐写法,完美
public enum Mgr01 {
    INSTANCE;

    public void m() {
        System.out.println("Mgr01");
    }
}
