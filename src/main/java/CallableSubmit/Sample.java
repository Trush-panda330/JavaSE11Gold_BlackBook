package CallableSubmit;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sample {
    public static void main(String[] args) {
        // スレッドプールを作成
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Callableタスクを定義
        Callable<Integer> task = () -> {
            // 例として、1秒間スリープしてから値を返す
            Thread.sleep(1000);
            return 123;
        };

        // タスクをsubmitメソッドで送信 Future<Integer>のオブジェクトを返しfutureに代入する
        Future<Integer> future = executorService.submit(task);

        // タスクの結果を取得。Callableタスクの結果から123をresultに代入
        try {
            Integer result = future.get(); // ブロックして結果を待つ
            System.out.println("Result of the task: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // シャットダウン
        executorService.shutdown();
    }
}
