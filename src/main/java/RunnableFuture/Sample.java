package RunnableFuture;//package RunnableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sample{
    public static void main(String[] args) {
        // スレッドプールを作成
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Runnableタスクを定義
        Runnable task = () -> {
            // 例として、1秒間スリープしてからメッセージを表示
            try {
                Thread.sleep(1000);
                System.out.println("Task executed by " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // タスクをsubmitメソッドで送信
        Future<?> future = executorService.submit(task);

        // タスクの完了を待つ
        try {
            future.get(); // ブロックしてタスクの完了を待つ
            System.out.println("Task is completed");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // シャットダウン
        executorService.shutdown();
    }
}


//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
////submit(Runnable task, T result) Runnableタスクの完了後に特定の結果を返すことができます。
//
//public class Sample {
//    public static void main(String[] args) {
//        // スレッドプールを作成
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//
//        // Runnableタスクを定義
//        Runnable task = () -> {
//            // 例として、1秒間スリープしてからメッセージを表示
//            try {
//                Thread.sleep(1000);
//                System.out.println("Task executed by " + Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        };
//
//        // タスクをsubmitメソッドで送信し、結果を設定
//        Future<String> future = executorService.submit(task, "Task Completed");
//
//        // タスクの結果を取得
//        try {
//            String result = future.get(); // ブロックして結果を待つ
//            System.out.println("Result of the task: " + result);
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
//
//        executorService.shutdown();
//    }
//}
