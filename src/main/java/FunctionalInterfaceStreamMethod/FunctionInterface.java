package FunctionalInterfaceStreamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionInterface {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");

        List<Integer> lengths = list.stream()
                .map(String::length) // Function<String, Integer> を使用
                .collect(Collectors.toList());

        System.out.println(lengths); // [5, 6, 6]
    }
}
