package ExtendsThread;

//Threadクラスを継承したクラスを作る
class ThreadA extends Thread {
    public void run() { //run()をオーバーライドしてスレッド内の処理を記述する
        for (int i = 0; i < 5; i++) {
            System.out.println("A:" + i + " ");
        }
    }
}
class ThreadB extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B:" + i + " ");
        }
    }
}

//Threadクラスを利用するmainクラスの中でスレッドを作る
// Thread a = new ThreadA();
public class Sample {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        a.start();  //start()を呼び出してrun()メソッドを実行する
        b.start();
    }
}
