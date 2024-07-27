package parallelStream;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 通常のストリーム処理
        System.out.println("Stream:");
        numbers.stream()
                .forEach(System.out::println);


        // 並列ストリーム処理
        System.out.println("\nParallel Stream:");
        numbers.parallelStream()
                .forEach(System.out::println);
    }
}
