package mosiQ33;

public class Sample {
    public Test test;
    public synchronized boolean hello(Test test) {
        if (this.test == null) {
            this.test = test;
            return true;
        }
        return false;
    }
    public synchronized void bye() {
        test = null;
    }
}
