package ImplRunnable;

//Runnableインターフェースを実装したクラスを作る
class ThreadA implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("A:" + i + " ");
        }
    }
}

class ThreadB implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B:" + i + " ");
        }
    }
}

public class Sample {
    public static void main(String[] args) {
        //スレッドの作成
        Thread a = new Thread(new ThreadA());
        Thread b = new Thread(new ThreadB());

        //スレッドの実行開始
        a.start();
        b.start();
    }
}
