package Annotation.Vararges;

import java.util.List;

public class StaticVarargesAnnotation {
    @SafeVarargs
    public static <T> void safeVarargesMethod(List<T>... lists) {
        for (List<T> list: lists) {
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        List<String> list1 = List.of("A","B","C");
        List<String> list2 = List.of("D","F","G");
        List<String> list3 = List.of("H","I","J");
        List<String> list4 = List.of("K","L","M");

        safeVarargesMethod(list1,list2,list3,list4);

    }
}
