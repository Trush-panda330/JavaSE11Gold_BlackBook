package parallelStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class ParallelStreamPerformance {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // 大量のランダムな数値をリストに追加
        IntStream.range(0, 1000000).forEach(i -> numbers.add(random.nextInt(1000000)));

        // 通常のストリームのパフォーマンス測定
        long startTime = System.currentTimeMillis();
        long count = numbers.stream().filter(n -> n % 2 == 0).count();
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential Stream Count: " + count + ", Time: " + (endTime - startTime) + " ms");

        // 並列ストリームのパフォーマンス測定
        startTime = System.currentTimeMillis();
        count = numbers.parallelStream().filter(n -> n % 2 == 0).count();
        endTime = System.currentTimeMillis();
        System.out.println("Parallel Stream Count: " + count + ", Time: " + (endTime - startTime) + " ms");
    }
}
