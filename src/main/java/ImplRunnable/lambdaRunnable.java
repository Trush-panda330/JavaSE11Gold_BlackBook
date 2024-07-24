package ImplRunnable;

//Runnableインターフェースは抽象メソッドのrun()メソッドを1つしか持っていないので
//関数型インターフェースでラムダ式が使える
public class lambdaRunnable {
    public static void main(String[] args) {
        //run()は引数を受け取らないので実引数はなし｛｝の中に処理を書く
         Thread threadA = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        });  // }).start();

        threadA.start();

        new Thread(() -> {
            System.out.println("hello");
        }).start();
    }
}
