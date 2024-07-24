package Annotation.Vararges;

import java.util.List;

public class FinalVarargesAnnotation {

    @SafeVarargs
    public final <T> void safeVarargsMethod(List<T>... lists) {
        for (List<T> list : lists) {
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        FinalVarargesAnnotation example = new FinalVarargesAnnotation();

        List<String> list1 = List.of("A", "B", "C");
        List<String> list2 = List.of("D", "E", "F");

        example.safeVarargsMethod(list1, list2);
    }
}
