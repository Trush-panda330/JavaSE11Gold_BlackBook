package Stream_filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

        // Predicateを定義
        Predicate<String> startsWithA = s -> s.startsWith("a");

        // filterメソッドでPredicateを使用
        List<String> result = list.stream()
                .filter(startsWithA) // "a"で始まる要素をフィルタリング
                .collect(Collectors.toList());

        System.out.println(result); // [apple]
    }
}
