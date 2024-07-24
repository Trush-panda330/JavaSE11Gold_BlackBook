package mosiQ33;

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        Sample s1 = new Sample();
        Sample s2 = new Sample();

        new Thread(() -> {
            t1.excute(s1, s2);
        }).start();

        new Thread(() -> {
            t2.excute(s2, s1);
        }).start();
    }
}
