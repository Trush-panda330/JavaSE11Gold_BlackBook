package Annotation;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all") //全ての警告を抑制している(使用は非推奨である)
public class SuppressWarnings_all { public void uncheckedOperation() {
        List rawList = new ArrayList();
        rawList.add("Hello");
    }

    public static void main(String[] args) {
        SuppressWarnings_all myClass = new SuppressWarnings_all();
        myClass.uncheckedOperation();
    }
}
