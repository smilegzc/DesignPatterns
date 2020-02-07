package singleton;

public class Main {
    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.INSTANCE;
        mgr01.m();

        Mgr02 mgr02 = Mgr02.getInstance();
        mgr02.m();

        Mgr03 mgr03 = Mgr03.getInstance();
        mgr03.m();
    }
}
