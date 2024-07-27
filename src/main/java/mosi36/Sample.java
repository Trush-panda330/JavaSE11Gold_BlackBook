package mosi36;

import java.util.ArrayList;
import java.util.List;


//設問のコード
//public class futureSubmit1.Sample {
//    public static void main(String[] args) {
//        List<Integer> a = new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        List b = List.copyOf(a);
//        b.add(3);
//        List<List<Integer>> c = List.of(a, b);
//        System.out.println(c);
//
//    }
//}

import java.util.ArrayList;
import java.util.List;


//　正しく動作するように書き直したコード
public class Sample {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);

        // a のコピーを作成し、変更可能なリストにする
        List<Integer> b = new ArrayList<>(a);
        b.add(3);

        // c のリストを作成
        List<List<Integer>> c = List.of(a, b);

        System.out.println(c);
    }
}
