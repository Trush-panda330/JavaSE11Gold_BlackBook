package parallelStream;

import java.util.Arrays;
import java.util.List;

public class Samplparallel_sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 8, 1, 9, 4);

        List<Integer> sortedList =
                list.parallelStream()
                        .sorted()  // 並べ替え
                        .toList(); // リストに変換

        sortedList.forEach(System.out::println);

//        List<Integer> sortList=
//                 list.stream()
//                .sorted().toList();
//
//        sortList.forEach(System.out::println);
    }
}
