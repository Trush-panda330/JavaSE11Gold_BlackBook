package Annotation;

import java.util.ArrayList;
import java.util.List;

public class DeprecatedSample {

    @SuppressWarnings("unchecked")
    public void addToList(List list, Object item) {
        list.add(item); // unchecked 警告を抑制
    }

    public static void main(String[] args) {
        List rawList = new ArrayList();
        DeprecatedSample myClass = new DeprecatedSample();
        myClass.addToList(rawList, "Hello");
        System.out.println(rawList);
    }
}
