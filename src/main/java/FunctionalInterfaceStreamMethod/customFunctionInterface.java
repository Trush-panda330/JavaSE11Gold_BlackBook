package FunctionalInterfaceStreamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class customFunctionInterface {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // Functionインターフェースを使用して文字列を大文字に変換
        Function<String, String> toUpperCase = String::toUpperCase;
        //　ラムダ式を使った書き方
        // Function<String, String> toUpperCase = s -> s.toUpperCase();

        List<String> upperCaseWords = words.stream()
                .map(toUpperCase)  // ここでカスタムFunctionを使う
                .collect(Collectors.toList());

        System.out.println(upperCaseWords);
    }
}
