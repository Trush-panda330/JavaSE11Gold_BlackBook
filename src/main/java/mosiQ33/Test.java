package mosiQ33;

public class Test {
    public synchronized void excute(Sample... samples) {
        for (int i = 0; i < 10; i++) {
            while(!samples[0].hello(this)) {
                //do something
            }
            while(!samples[1].hello(this)) {
                //do something
            }
            samples[1].bye();
            samples[0].bye();
        }

    }
}
