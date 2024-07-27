package Stream_filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CombinedSample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "ail", "cherry", "aaauieo", "fig", "grape");

        // Predicateを定義
        Predicate<String> startsWithA = s -> s.startsWith("a");
        Predicate<String> length4over = s -> s.length() > 4;

        // 複数のPredicateを組み合わせる
        Predicate<String> combinedPredicate = startsWithA.and(length4over);

        // filterメソッドで組み合わせたPredicateを使用
        List<String> result = list.stream()
                .filter(combinedPredicate) // "a"で始まり、かつ長さが4より大きい要素をフィルタリング
                .collect(Collectors.toList());

        System.out.println(result); // [apple]
    }
}
