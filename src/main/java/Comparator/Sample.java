package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Sample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("takuya", 28));

        // 名前でソートするコンパレータ
        Comparator<Person> nameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        };

        Collections.sort(people, nameComparator);
        System.out.println("Sorted by name: " + people);




        // 年齢でソートするコンパレータ
        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age);
            }
        };

        Collections.sort(people, ageComparator);
        System.out.println("Sorted by age: " + people);


        //ラムダ式を使ったソート
        Comparator<Person> nameComparator2 = (p1, p2) -> p1.name.compareTo(p2.name);
        Comparator<Person> ageComparator2 = (p1, p2) -> Integer.compare(p1.age, p2.age);


        Collections.sort(people, nameComparator2);
        System.out.println("Sorted by name: " + people);

        Collections.sort(people, ageComparator2);
        System.out.println("Sorted by age: " + people);

    }
}
