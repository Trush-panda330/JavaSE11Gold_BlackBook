package kuro4_3;
import java.util.Optional;
public class orElseSample {
    public static void main(String[] args) {
        Optional<String> sample = Optional.empty();
        System.out.println(sample.orElse("empty"));
    }

}
