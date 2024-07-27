package Stream_filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class customPredicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Predicateを匿名クラスとして定義
        Predicate<Integer> isEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };
        //ラムダ式でも書ける
//        Predicate<Integer> isEven = n -> n % 2 == 0;

        // filterメソッドでカスタムPredicateを使用
        List<Integer> evenNumbers = list.stream()
                .filter(isEven) // PredecateのisEvenをfilterメソッドに渡して偶数の要素をフィルタリング
                .collect(Collectors.toList());

        System.out.println(evenNumbers); // [2, 4, 6, 8, 10]
    }
}
